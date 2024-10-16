package org.dhana.day2.prng;

import java.util.Random;

public class Motivation {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(1, 100);
        System.out.println(i);

        double v = random.nextDouble();
        System.out.println(v);
    }
}
