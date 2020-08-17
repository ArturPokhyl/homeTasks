package main.java.lesson3;

public class U_Methods {
    public static void main(String[] args) {
        /*greet("Vova");
        greet("Vitya");
        greet("Max");
        greet("Max", 5);
        greet(2);*/
        int a = 50;
        int b = 30;
        int result = sum(a, b);
        //byte result2 = sum(a, b);
        System.out.println(result);
        //System.out.println(sum(a, b));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String getName() {
        return "Vova";
    }

    public static void greet(String name) {
        System.out.println("*--------------------");
        System.out.printf("Hello '%s'\n", name);
        System.out.println("*--------------------");
    }

    public static void greet(int age) {
        System.out.println("*--------------------" + age);
        System.out.printf("Hello '%s'\n", "Vova");
        System.out.println("*--------------------");
    }

    public static void greet(String name, int age) {
        System.out.println("*--------------------" + age);
        System.out.printf("Hello '%s'\n", name);
        System.out.println("*--------------------" + age);
    }
}
