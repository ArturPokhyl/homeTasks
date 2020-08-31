package main.java.HW;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    public static void main(String[] args) {
        //System.out.println(min(5,2,3));
    }

    public int min(int arr[]) {
        int minimum = arr[0];
        for (int el: arr) {
            minimum = minimum < el ? minimum : el;
        }
        return minimum;
    }
}