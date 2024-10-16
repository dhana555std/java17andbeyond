package org.dhana.day1.sealedclasses;

import java.io.Serializable;

public class SealedClasses {
    public static void main(String[] args) {

    }
}

// final
// sealed class
// non sealed class
sealed abstract class GShape extends Thread implements Serializable permits GParallelogram, GCircle {
    int noOfSides() {
        return -1;
    }
}

sealed class GParallelogram extends GShape permits GSquare {
    @Override
    int noOfSides() {
        return 4;
    }
}


non-sealed class GSquare extends GParallelogram {
}

final class GCircle extends GShape {
    @Override
    int noOfSides() {
        return 0;
    }
}





