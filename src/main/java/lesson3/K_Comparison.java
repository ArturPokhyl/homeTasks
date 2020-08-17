package main.java.lesson3;

public class K_Comparison {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 20;
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(b == c);
        //a = b;
        System.out.println(b != c);
        System.out.println("--------------------------");
        //System.out.println(!!true);
        boolean isTrue = a < b;
        System.out.println(isTrue);
    }
}
