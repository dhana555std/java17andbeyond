package org.dhana.sealedclasses;

public class Motivation {
    public static void main(String[] args) {
        Shape car = new Car();
        System.out.println(car.getCountOfSides());
    }
}

abstract class Shape {
    abstract int getCountOfSides();
}

class Rectangle extends Shape {
    @Override
    int getCountOfSides() {
        return 4;
    }
}

class Circle extends Shape {
    @Override
    int getCountOfSides() {
        return 0;
    }
}

/**
 *
 * How the hell can <b>Car</b> be a {@link Shape}.
 *
 */
class Car extends Shape {
    @Override
    int getCountOfSides() {
        return 100;
    }
}

