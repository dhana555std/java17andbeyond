package org.dhana.day1.switchadv;

public class Multiple {
    public static void main(String[] args) {
        String weekDay = "Monday";

        switch (weekDay) {
            case "Sunday", "Saturday" -> System.out.println("Weekend");
            default -> System.out.println("Weekday");
        }
    }
}
