package org.dhana.sealedclasses;

public class Motivation {
    public static void main(String[] args) {

    }
}

/**
 * Shape represents a Geometrical shape like parallelogram, Circle, Rectangle, Square.
 *
 */
abstract class Shape {
    int noOfSides() {
        return -1;
    }
}

class Parallelogram extends Shape {
    @Override
    int noOfSides() {
        return 4;
    }
}

class Circle extends Shape {
    @Override
    int noOfSides() {
        return 0;
    }
}

// Not correct!
class Car extends Shape {
    @Override
    int noOfSides() {
        return 100;
    }
}


