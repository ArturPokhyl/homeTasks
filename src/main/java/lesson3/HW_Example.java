package main.java.lesson3;

public class HW_Example {
    public static void main(String[] args) {
        //***
        //***
        //***
        int length = 5;
        while (length > 0) {
            int jLength = 5;
            while (jLength > 0) {
                System.out.print("*");
                jLength--;
            }
            System.out.println();
            length--;
        }

        int length2 = 5;
        do{
            int jLength2 = 5;
            do {
                System.out.print("-");
                jLength2--;
            } while (jLength2 > 0);
            System.out.println();
            length2--;
        } while (length2 > 0);

        //2.14.1098 ["2", "14", "1098"]
        //2.14.10
        //3.1.2
    }
}
