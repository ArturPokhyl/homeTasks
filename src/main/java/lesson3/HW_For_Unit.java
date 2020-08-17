package main.java.lesson3;

public class HW_For_Unit {
    public String someMethod() {
        String result = "";
        String name = "*";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                result += name;
            }
            result += "\n";
        }
        return result;
    }
}
