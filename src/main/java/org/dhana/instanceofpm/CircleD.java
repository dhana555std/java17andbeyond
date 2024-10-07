package org.dhana.instanceofpm;

final public class CircleD extends Diagram {
    @Override
    public String getArea() {
        return "pi * radius * radius";
    }

    void setRadius(int radius) {
        System.out.println(STR."radius is \{radius}");
    }
}
