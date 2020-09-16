package test.java.homeTasks.apiTests;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import test.java.utils.PropertyLoader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class HW_lesson15_Task {
    Object createdID;

    @Test
    public void createTask(){
        createdID =  given()
                    .header("Authorization","Bearer " + PropertyLoader.loadProperty("userToken"))
                    .contentType("application/json")
                    .body(new File("D:\\automationQA\\lesson3\\src\\test\\java\\homeTasks\\apiTests\\createTaskBodyHW.json"))
                .when()
                    .post(PropertyLoader.loadProperty("api.url") + "/tasks")
                .then()
                    .statusCode(200)
                    .extract().path("id");
        System.out.println(createdID);
    }

    @Test
    public void readTask(){
        Header authorizationHeader = new Header("Authorization","Bearer " + PropertyLoader.loadProperty("userToken"));
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header(authorizationHeader).header("Content-Type", "application/json");
        Response response = httpRequest.get(PropertyLoader.loadProperty("api.url")+ "/tasks/" + createdID);
        System.out.println(response.asString());
    }

    @Test
    public void updateTask(){
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("content", "Home Task Create Task Update"); // Cast
        given()
                .header("Authorization","Bearer " + PropertyLoader.loadProperty("userToken"))
                .contentType("application/json")
                .when()
                .body(jsonAsMap)
                .post(PropertyLoader.loadProperty("api.url")+ "/tasks/" + createdID)
                .then()
                .statusCode(204);

    }

    @Test
    public void deleteTask(){
        given()
                    .header("Authorization","Bearer 748a571c09009e7a015e4182b5838f4d82efa5ce")
                    .contentType("application/json")
                .when()
                    .delete(PropertyLoader.loadProperty("api.url")+ "/tasks/" + createdID)
                .then().log().all()
                    .statusCode(204);
    }

}
