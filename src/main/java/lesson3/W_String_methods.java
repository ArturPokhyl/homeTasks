package main.java.lesson3;

public class W_String_methods {
    public static void main(String[] args) {
        String name = "VodD3455523*()*(*)(*)(*)#$%@&dDddva";
        /*System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toLowerCase());*/
        //char i = 'a';
        //short j = (short)i;
        System.out.println((short)'a' + ": a");
        System.out.println((short)'z' + ": z");
        System.out.println((short)'A' + ": A");
        System.out.println((short)'Z' + ": Z");

        System.out.println(myToLowerCase(name));
    }

    public static String myToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if((short)str.charAt(i) >= 65 && (short)str.charAt(i) <= 90) {
                result += (char)(((short)str.charAt(i)) + 32);
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
