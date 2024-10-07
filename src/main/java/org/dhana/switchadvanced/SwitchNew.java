package org.dhana.switchadvanced;

/**
 * Switch with the following:-
 * <ul>
 *     <li>Arrow</li>
 *     <li>return value</li>
 *     <li>yield</li>
 * </ul>
 */
public class SwitchNew {
    public static void main(String[] args) {
        var weekDay = "Sunday";
        var day = switch (weekDay) {
            case "Sunday" -> 1;
            case "Monday" -> 2;
            case "Tuesday" -> 3;
            case "Wednesday" -> 4;
            case "Thursday" -> 5;
            case "Friday" -> 6;
            case "Saturday" -> 7;
            default -> {
                System.out.println("Invalid day");
                yield -1;
            }
        };
        System.out.println(STR."Day of the week is \{day}");
    }
}
