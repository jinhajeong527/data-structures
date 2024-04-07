package com.jjh.hashtables;

import java.util.HashMap;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        str = str.toLowerCase();
        HashMap<Character, Integer> table = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char word : chars) {
            if (table.containsKey(word)) {
                table.put(word, table.get(word) + 1);
            } else {
                table.put(word, 1);
            }
        }
        for (char value: chars) {
            if (table.get(value) == 1) {
                return value;
            }
        }
        return  Character.MIN_VALUE;
    }

}
