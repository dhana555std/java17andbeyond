package org.dhana.day1.switchadv;

public class SwitchOld {
    public static void main(String[] args) {
        String weekDay = "Monday";
        int day = -1;

        switch (weekDay) {
            case "Sunday":
                day = 1;
                System.out.println("Day of week " + day);
                break;

            case "Monday":
                day = 2;
                System.out.println("Day of week " + day);
                break;

            case "Tuesday":
                day = 3;
                System.out.println("Day of week " + day);
                break;

            case "Wednesday":
                day = 4;
                System.out.println("Day of week " + day);
                break;

            case "Thursday":
                day = 5;
                System.out.println("Day of week " + day);
                break;

            case "Friday":
                day = 6;
                System.out.println("Day of week " + day);
                break;

            case "Saturday":
                day = 7;
                System.out.println("Day of week " + day);
                break;

            default:
                System.out.println("Invalid day");
        }

    }
}
