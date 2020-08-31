package main.java.lesson9;

public class ImmortalPonny extends Animal implements IMashinable {

    @Override
    public String getName() {
        return "Pony";
    }

    @Override
    public void repare() {
        System.out.println("Repare");
    }
}
