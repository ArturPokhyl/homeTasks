package test.java.lesson4;

import main.java.lesson4.Cat;

public class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        int age = 105;
        cat.setAge(age);
        int actualAge = cat.getAge();
        int expectedAge = age;
        if(actualAge != expectedAge) {
            throw new Error("Validation failed");
        }

        int age2 = 2;
        cat.setAge(age2);
        int actualAge2 = cat.getAge();
        int expectedAge2 = age2;
        if(actualAge2 != expectedAge2) {
            throw new Error("Validation failed");
        }
    }
}
