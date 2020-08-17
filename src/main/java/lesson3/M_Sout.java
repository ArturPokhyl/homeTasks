package main.java.lesson3;

public class M_Sout {
    public static void main(String[] args) {
        System.out.println("fsdfsdfds");
        System.out.println("fsdfsdfds");
        System.out.print("Hello");
        System.out.print("world\n");
        System.out.print("******\n");
        String name1 = "Vova";
        String name2 = "Vasyliy";
        System.out.println("Hello user '" + name1 + "', my name is '" + name2 + "'");
        //System.out.println("Hello user '" + "Vova" + "', my name is 'Vasya'");
        System.out.printf("Hello user '%s', my name is '%s'", name1, name2);
    }
}
