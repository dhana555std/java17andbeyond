package org.dhana.day1.instanceOf;

import java.io.Serializable;

public class Motivation {
    public static void main(String[] args) {
        Animal animal = new Human();

        // Old Way
        if (animal instanceof Human) {
            ((Human) animal).speaks();
        } else if (animal instanceof Horse) {
            ((Horse) animal).eatGrass();
        }

        // New way
        if (animal instanceof Human h) {
            h.speaks();
        } else if (animal instanceof Horse h) {
            h.eatGrass();
        }

        Object o = "Hello";
        if (o instanceof String s) {
            s.concat("World");
        }
    }
}

sealed interface Animal permits Human, Horse {
}

final class Human implements Animal, Serializable {
    void speaks() {
        System.out.println("Humans speak!!!");
    }
}

final class Horse implements Animal {
    void eatGrass() {
        System.out.println("Horses eat Grass!!!");
    }
}


