package org.dhana.record;

import java.util.Objects;

public final class User {
    private final long id;
    private final String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
        if (id <= 0) {
            throw new IllegalArgumentException("id cannot be less than equal to 0");
        }

        if (name.equals("")) {
            throw new IllegalArgumentException("name cannot be empty.");
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        User user1 = new User(1, "");
        User user2 = new User(1, "Dhana");
        User user3 = new User(2, "Dhana");

        System.out.println(user1);
        System.out.println(String.format("""
                User id is %d
                User name is %s
                """, user1.getId(), user1.getName()));

        System.out.println("1 vs 2 " + user1.equals(user2));
        System.out.println("1 vs 3 " + user1.equals(user3));
    }
}
