package main.java.homeTasks.lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while
*/

public class Task4 {

    public static void main(String[] args) {
        String name = "Artur";
        int counter1 = 0;
        int counter2 = 0;

          do {
            do {
                System.out.print(name + " ");
                counter2++;
                }while (counter2 < 10);
            System.out.println();
            counter1++;
            counter2 = 0;
           }while (counter1 < 5);
        }
    }