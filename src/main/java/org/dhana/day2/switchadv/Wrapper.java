package org.dhana.day2.switchadv;

public class Wrapper {
    public static void main(String[] args) {
        Integer dayOfWeek = 1;
        var day = switch (dayOfWeek) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> throw new IllegalStateException("Unexpected value: " + dayOfWeek);
        };

        System.out.println("Week day " + day);
    }
}