package org.dhana.instanceofpm;

public class InstanceOf {
    public static void main(String[] args) {
        Diagram rectangle = new RectangleD();
        Diagram circle = new CircleD();

        getAreaByShape(rectangle);
        getAreaByShape(circle);
    }

    static void getAreaByShape(Diagram shape) {
        if (shape instanceof RectangleD rec) {
//            ((Rectangle)shape).setDimensions(4, 5);
            rec.setDimensions(4, 5);
        } else if (shape instanceof CircleD circle) {
            circle.setRadius(10);
        }
    }
}


