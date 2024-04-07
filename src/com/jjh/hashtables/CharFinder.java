package com.jjh.hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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

    public char findFirstRepeatedChar(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        // None of the character repeated
        return Character.MIN_VALUE;
    }

}
