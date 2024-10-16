package org.dhana.day2.recordpattern;

public class RecordPattern {
    public static void main(String[] args) {
        Shape shape = new Point(7, 9);

        if (shape instanceof Point p) {
            System.out.println(p.x() + " " + p.y());
        }

        if (shape instanceof Point(int x, int y)) {
            System.out.println(x + " " + y);
        }

        if (shape instanceof Point(var x, var y)) {
            System.out.println(x + " " + y);
        }

        shape = new Line(new Point(5,6), new Point(8, 10));
        // Nested Pattern Matching with Records

        if (shape instanceof Line l) {
            System.out.println(l.point1().x() + " " + l.point2().x());
        }

        if (shape instanceof Line(var p1, var p2)) {
            System.out.println(p1.x() + " " + p2.y());
        }

        if (shape instanceof Line(Point(int x1, int y1), Point(int x2, int y2))) {
            System.out.println(x1 + " " + x2);
        }

        switch (shape) {
            case Line(Point(int x1, int y1), Point(var x2, var y2)) -> System.out.println(x1 + " " + x2);
            case Point(int x1, int y1) -> System.out.println(x1 + " " + y1);
            default -> throw new IllegalArgumentException("something wrong.");
        }
    }
}
