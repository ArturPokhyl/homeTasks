package test.java.lesson14;

import java.util.HashSet;
import java.util.Set;

public class Random {
    public static void main(String[] args) {
        String []arr = {"Acer", "Apple", "Asus", "Dell", "Dream Machines", "HP" }; //6

        //double rand = Math.random();

//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < 200000000; i++) {
//            int rand = (int)(Math.random() * (arr.length));
//            set.add(rand);
//        }
//
//        for (Integer i: set) {
//            System.out.println(i);
//        }

        int min = 2;
        int rand = (int)(Math.random() * ((arr.length - 1) - min + 1 )) + min;
        System.out.println(arr[rand]); //0 - ( arr.length - 1 )

    }
}
