package util;

import org.junit.jupiter.api.Test;
import org.siqueira76.util.Util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtilTest {
    @Test
    public void testGenerateAnagrams_basic() {
        char[] input = {'a', 'b', 'c'};
        Set<String> expected = new HashSet<>(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
        assertEquals(expected, Util.generateAnagrams(input));
    }

    @Test
    public void testGenerateAnagrams_singleLetter() {
        char[] input = {'a'};
        Set<String> expected = new HashSet<>(Arrays.asList("a"));
        assertEquals(expected, Util.generateAnagrams(input));
    }

    @Test
    public void testGenerateAnagrams_emptyInput() {
        char[] input = {};
        Set<String> expected = new HashSet<>();
        assertEquals(expected, Util.generateAnagrams(input));
    }

    @Test
    public void testGenerateAnagrams_nullInput() {
        Set<String> expected = new HashSet<>();
        assertEquals(expected, Util.generateAnagrams(null));
    }

    @Test
    public void testGenerateAnagrams_invalidInput() {
        char[] input = {'a', '1', 'b'};
        assertThrows(IllegalArgumentException.class, () -> Util.generateAnagrams(input));
    }
}
