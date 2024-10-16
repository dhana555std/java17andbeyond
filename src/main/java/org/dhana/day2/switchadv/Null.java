package org.dhana.day2.switchadv;

public class Null {
    public static void main(String[] args) {
        Integer x = null;

        switch (x) {
            case null ->
                System.out.println("this is null");
            default -> System.out.println(x);
        }
    }
}
