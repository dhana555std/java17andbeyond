package org.dhana.instanceofpm;

sealed public class Diagram permits RectangleD, CircleD {
    public String getArea() {
        return "";
    }
}
