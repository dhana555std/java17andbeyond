package org.dhana.sealedclasses;

import java.io.Serializable;

/**
 * <ul>
 *     <li>Sealed class Abstract, interface, Normal class</li>
 *     <li>implements and extends</li>
 * </ul>
 *
 * <b>Make the interface as Sealed Interface.</b>
 */
public class SealedAbstractClass {
    public static void main(String[] args) {

    }
}

sealed class SealedShape extends Thread implements Serializable  permits CircleShape, RectangleShape {
     int getCountOfSides() {
         return -1;
     }
}

sealed class RectangleShape extends SealedShape permits SquareShape {
    @Override
    int getCountOfSides() {
        return 4;
    }
}

final class CircleShape extends SealedShape {
    @Override
    int getCountOfSides() {
        return 0;
    }
}

non-sealed class SquareShape extends RectangleShape {
    @Override
    int getCountOfSides() {
        return 0;
    }
}

class SmallSquare extends SquareShape {

}
