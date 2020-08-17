package main.java.homeTasks.lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {

    public static void main(String[] args) {
        String name = "Artur";
        int counter1 = 0;
        int counter2 = 0;
        while (counter1 < 5){
            while (counter2 < 10){
                System.out.print(name + " ");
                counter2++;
            }
            System.out.println();
            counter2 = 0;
            counter1++;
        }

    }
}