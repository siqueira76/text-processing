package org.siqueira76.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Util {

    /**
     * Generates all possible anagrams from a given set of distinct characters.
     *
     * @param chars The input array of distinct characters.
     * @return A set of all possible anagrams as strings.
     * @throws IllegalArgumentException if the input is null, empty, or contains non-letter characters.
     */
    public static Set<String> generateAnagrams(char[] chars) {
        if (chars == null || chars.length == 0) {
            return new HashSet<>(); // Return empty set for null or empty input
        }

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Input must contain only letters.");
            }
        }

        List<String> anagramsList = new ArrayList<>();
        generateAnagramsRecursive(chars, 0, anagramsList);
        return new HashSet<>(anagramsList); // Use a set to avoid duplicates.
    }

    /**
     * Recursive helper function to generate anagrams.
     *
     * @param chars      The input array of characters.
     * @param startIndex The starting index for permutation.
     * @param anagrams   The list to store generated anagrams.
     */
    private static void generateAnagramsRecursive(char[] chars, int startIndex, List<String> anagrams) {
        if (startIndex == chars.length - 1) {
            anagrams.add(new String(chars));
            return;
        }

        for (int i = startIndex; i < chars.length; i++) {
            swap(chars, startIndex, i);
            generateAnagramsRecursive(chars, startIndex + 1, anagrams);
            swap(chars, startIndex, i); // Backtrack
        }
    }

    /**
     * Helper function to swap two characters in an array.
     *
     * @param chars The character array.
     * @param i     The first index.
     * @param j     The second index.
     */
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
