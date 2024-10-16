package org.dhana.day2.switchadv;

public class PatternMatching {
    public static void main(String[] args) {
        Object object = "Hello World!";

        switch (object) {
            case String s when (s.length() > 2 && s.contains("l"))  -> System.out.println(s.toUpperCase());
            case String s when (s.length() <= 2) -> System.out.println(s.toLowerCase());

            case Integer x -> System.out.println(x);
            default -> throw new IllegalStateException("Unexpected value: " + object);
        }
    }
}
