package org.dhana.instanceofpm;

final public class RectangleD extends Diagram {
    public String getArea() {
        return "length * breadth";
    }

    void setDimensions(int length, int breadth) {
        System.out.println(STR."length is \{length} and breadth is \{breadth}");
    }
}
