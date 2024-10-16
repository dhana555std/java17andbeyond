package org.dhana.day2.recordpattern;

public class UnNamedVariables {
    public static void main() {
        Shape shape = new Line(new Point(2, 3), new Point(9, 7));

        switch (shape) {
            case Line(_, Point(var x2, var _)) -> System.out.println(x2 );
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        }
    }
}
