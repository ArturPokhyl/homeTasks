package test.java.lesson14;

import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Set;

public class Random {
    public static void main(String[] args) {
        String arr[] = {"Acer" , "Apple" , "Asus" , "Dell", "HP" };

        //double rand = Math.random();

/*
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 2000000; i++) {
            int rand = (int)(Math.random() * (arr.length));
            set.add(rand);
        }
        for (Integer i : set) {
            System.out.println(i);
        }
*/

        //System.out.println(Math.random());
        int rand = (int)(Math.random() * (arr.length));
        System.out.println(arr[rand]); //0 - (arr.length -1)
    }
}
