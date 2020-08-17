package main.java.lesson3;

public class S_Ternar {
    public static void main(String[] args) {
        int age = 2;
        /*String greeting;
        if(age < 18) {
            greeting = "Good bye";
        } else {
            greeting = "Hello";
        }*/
        String greeting = (age < 18)
                ? "Goodbye"
                : "Hello";

        System.out.println(greeting);
    }
}
