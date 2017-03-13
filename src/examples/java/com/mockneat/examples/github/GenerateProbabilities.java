package com.mockneat.examples.github;

import com.mockneat.mock.MockNeat;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andreinicolinciobanu on 13/03/2017.
 */
public class GenerateProbabilities {
    public static void main(String[] args) {
        MockNeat mockNeat = MockNeat.threadLocal();

        Map<String, Integer> mp = new HashMap<>();
        mp.put("A", 0);
        mp.put("B", 0);
        mp.put("C", 0);
        mp.put("D", 0);

        for (int i = 0; i < 1000000; i++) {

            String s = mockNeat.probabilites(String.class)
                    .add(0.1, "A")
                    .add(0.2, "B")
                    .add(0.5, "C")
                    .add(0.2, "D")
                    .val();
            mp.put(s, mp.get(s) + 1);
        }

        System.out.println(mp);
    }
}