package org.dhana.record;

import java.util.Objects;

public final class User {
    private final long id;
    private final String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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
        User user1 = new User(1, "Dhana");
        User user2 = new User(1, "Dhana");
        System.out.println(user1);
        System.out.println("compare user1 and user2 " + user1.equals(user2));
    }
}
