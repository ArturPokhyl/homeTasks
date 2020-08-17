package main.java.homeTasks.lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {

    public  String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
