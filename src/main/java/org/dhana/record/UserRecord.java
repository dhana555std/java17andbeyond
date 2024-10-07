package org.dhana.record;

/**
 * <ul>
 * <li>Motivation: Immutable</li>
 * <li>Less verbose</li>
 * <li>toString, hashCode, equals</li>
 * <li>Cannonical construtor</li>
 * <li>Compact constructor</li>
 * <li>Default Constructor</li>
 * <li>implements interfaces but cannot extend classes</li>
 * <li>static variables</li>
 * </ul>
 *
 * <b>Assignment:- Why Records cannot extend another class?</b>
 *
 *
 * @param id
 * @param name
 */
public record UserRecord(long id, String name) {
    public static final String SALUTATION = "His Highness ";

    public UserRecord() {
        this(3, "Manoj");
    }

    public UserRecord {
        if (id <= 0) {
            throw new IllegalArgumentException("id cannot be zero or less");
        }

        if (name.isEmpty()) {
            throw new IllegalArgumentException("id cannot be zero or less");
        }
    }

    public static void main(String[] args) {
        UserRecord userRecord1 = new UserRecord(1, "Dhana");
        UserRecord userRecord2 = new UserRecord(1, "Dhana");
        UserRecord userRecord3 = new UserRecord(2, "Dhana");

        System.out.println(userRecord1);
        System.out.println(String.format("""
                UserRecord id is %d
                UserRecord name is %s
                """, userRecord1.id(), userRecord1.name()));

        System.out.println(STR."1 vs 2 \{userRecord1.equals(userRecord2)}");
        System.out.println(STR."1 vs 3 \{userRecord1.equals(userRecord3)}");

        System.out.println(SALUTATION);
    }
}
