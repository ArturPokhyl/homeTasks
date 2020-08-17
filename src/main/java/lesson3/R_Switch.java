package main.java.lesson3;

public class R_Switch {
    public static void main(String[] args) {
        int a = 0;
        /*if(a == 0) {

        } else if(a == 1) {

        } else {

        }*/
        switch (a) {
            case 0:
                System.out.println("Zero");
                System.out.println("----");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Common action");
                break;
            default:
                System.out.println("No match");
        }

        if(true) System.out.println("dsdad");
        else System.out.println("sdsadsada");

        String name = "a";

        /*switch (name) {
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println("B");
                break;
        }*/
    }
}
