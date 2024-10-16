package org.dhana.day1.switchadv;

public class SwitchNew {
    public static void main(String[] args) {
        String weekDay = "Sunday";
        
        var day = switch (weekDay) {
            case "Monday" -> 2;
            case "Tuesday" -> 3;
            case "Wednesday" -> 4;
            case "Thursday" -> 5;
            case "Friday" -> 6;
            case "Saturday" -> 7;
            case "Sunday" -> {
                System.out.println("Sunday is a holiday.");
                yield 1;
            }

            default -> {
                throw new IllegalArgumentException("Not a week day");
            }
        };

        System.out.println("day of week " + day);
    }
}
