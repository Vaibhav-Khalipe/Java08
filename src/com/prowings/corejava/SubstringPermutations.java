package com.prowings.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringPermutations {

    public static void main(String[] args) {
        String input = "abc";
        List<String> result = generatePermutations(input);
        for (String perm : result) {
            System.out.println(perm);
        }
    }

    public static List<String> generatePermutations(String input) {
        Set<String> permutations = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                generatePermutations("", substring, permutations);
            }
        }
        return new ArrayList<>(permutations);
    }

    private static void generatePermutations(String prefix, String remaining, Set<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1, n),
                        permutations);
            }
        }
    }
}

