package test.java.tests.api;

import org.testng.annotations.Test;
import test.java.utils.PropertyLoader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.head;

public class apiTest {
    Object createdID;

    @Test
    public void createProject(){
       /* String bodyAsString = "{" +
                "    \"name\": \"Movies to watch1111\"," +
                "        \"color\": ," +
                "        \"shared\": false" +
                "}";*/
       /* Map<String, Object> bodyAsMap = new HashMap<>();
        bodyAsMap.put("name", "Movies to watch1111");
        bodyAsMap.put("color", 48);
        bodyAsMap.put("shared", false);*/


       createdID =  given()
                    .header("Authorization","Bearer 748a571c09009e7a015e4182b5838f4d82efa5ce")
                    .header("Content-Type", "application/json")
                    /*.body(bodyAsMap)*/
                    .body(new File("D:\\automationQA\\lesson3\\src\\test\\java\\tests\\api\\createProjectBody.json"))
                .when()
                    .post(PropertyLoader.loadProperty("api.url") + "/projects")
                .then()
                    .statusCode(200)
                    .extract().path("id");
        System.out.println(createdID);
    }
    @Test(dependsOnMethods = "createProject")
    public void deletedProjectTest(){
        given()
                    .header("Authorization","Bearer 748a571c09009e7a015e4182b5838f4d82efa5ce")
                    .contentType("application/json").log().all()
                .when()
                    .delete(PropertyLoader.loadProperty("api.url")+ "/projects/" + createdID)
                .then().log().all()
                    .statusCode(204);
    }
}
