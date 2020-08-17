package main.java.lesson3;

public class V_Debug {
    public static void main(String[] args) {
        String name = "";
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
            if (i % 2 == 0) {
                name += "A";
            } else {
                name += "a";
            }
        }
        System.out.println(name);
    }
}
