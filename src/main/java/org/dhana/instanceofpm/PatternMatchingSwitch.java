package org.dhana.instanceofpm;

public class PatternMatchingSwitch {
    public static void main(String[] args) {
        Diagram rectangle = new RectangleD();
        Diagram circle = new CircleD();

        getAreaByShape(rectangle);
        getAreaByShape(circle);
    }

    private static void getAreaByShape(Diagram diagram) {
        switch (diagram) {
            case RectangleD rec when rec.getArea().contains("length") -> rec.setDimensions(2, 4);
            case CircleD circleD when circleD.getArea().contains("radius") -> circleD.setRadius(79);
            default -> throw new IllegalArgumentException("invalid diagram");
        };
    }
}
