package com.jjh.string;

public class StringUtils {
    public static int findNumberOfVowels(String str) {
        if (str == null)
            return 0;
        String upperCased = str.toUpperCase();
        int count = 0;
        String vowels = "AEIOU";
        for (char ch: upperCased.toCharArray())
            if (vowels.indexOf(ch) != -1)
                count++;

        return count;
    }
}
