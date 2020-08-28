package main.java.lesson9;

public abstract class Animal implements IAnimable{
    public String name = "Animal";

    public void sleep() {
        System.out.println("I am sleeping ***");
    }

    @Override
    public String toString() {
        System.out.println("Invoked method 'toString()'");
        return "Hello my name is :"  + this.name;
    }

    public abstract String getName();

    public void eat() {
        System.out.println("I am eating ....");
    }
}
