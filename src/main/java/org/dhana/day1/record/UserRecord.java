package org.dhana.day1.record;

import java.io.Serializable;

public record UserRecord(long id, String name) implements Serializable {
    private static String salutation = "Your Highness";

    public UserRecord {
        if (id <= 0) {
            throw new IllegalArgumentException("id cannot be less than 0");
        }
    }

    public UserRecord() {
        this(1, "Manoj");
    }

    /*public UserRecord(long id, String name) {
        this.id = id + 1;
        this.name = "" + name;
    }*/

    public static void main(String[] args) {
        UserRecord userRecord1 = new UserRecord(1, "Dhana");
        UserRecord userRecord2 = new UserRecord(1, "Dhana");
        System.out.println(userRecord1.id() + " " + userRecord1.name());


        System.out.println(userRecord1);
        System.out.println(userRecord1.equals(userRecord2));
    }

}
