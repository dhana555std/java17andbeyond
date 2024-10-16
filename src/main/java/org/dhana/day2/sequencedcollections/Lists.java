package org.dhana.day2.sequencedcollections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>() {{
            add(2); add(5);
            add(7); add(9);
        }};
        integers.addFirst(1);
        System.out.println(integers);

        System.out.println(integers.reversed());
        System.out.println(integers.removeLast());
        System.out.println(integers.removeFirst());
        System.out.println(integers);
    }
}