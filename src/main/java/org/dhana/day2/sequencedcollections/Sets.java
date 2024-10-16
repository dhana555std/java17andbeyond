package org.dhana.day2.sequencedcollections;

import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(){{
            add(4); addFirst(2); addLast(3);
        }};

        System.out.println(set);
        Set<Integer> reversed = set.reversed();
        System.out.println(reversed);

        set.removeFirst();
        set.removeLast();
        System.out.println(set);
    }
}