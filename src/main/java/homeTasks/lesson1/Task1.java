package main.java.homeTasks.lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */

    public  int min(int a, int b, int c) {
        int minNum;

            if ((a < b) & (a < c)){
                minNum = a;
            } else if ((b < a) & (b < c)){
                minNum = b;
            } else minNum = c;
        return minNum;
    }
}