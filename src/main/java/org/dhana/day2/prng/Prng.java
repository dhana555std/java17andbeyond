package org.dhana.day2.prng;

import java.util.Set;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class Prng {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = RandomGenerator.of("L64X128MixRandom");
        int i = randomGenerator.nextInt(1, 100);
        System.out.println(i);

        Set<Integer> randomIntegers = randomGenerator.ints(1, 100)
                .limit(20).
                boxed().
                collect(Collectors.toSet());
        System.out.println(randomIntegers);
    }
}
