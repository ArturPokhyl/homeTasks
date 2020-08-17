package main.java.lesson3;

public class HW_addvance {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int length = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String str = j < (length - i) ? " " : "*";
                System.out.print(str);
            }
            /*for (int l = 0; l < length - i; l++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }*/
            System.out.println();
        }
    }
}
