package main.java.lesson3;

public class P3_Foreach {
    public static void main(String[] args) {
        String names[] = {"Vova", "Vytya", "Max", "AAA", "BBB"};
//        for (int i = 0; i < names.length; i++) {
//            if(i%2 == 0) {
//                names[i] = "*********";
//            }
//            System.out.println(names[i]);
//        }

        for (String name: names) {
            System.out.println(name);
        }
    }
}
