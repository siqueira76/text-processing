# Anagram Generator

This Java project provides a utility function to generate all possible anagrams from a given set of distinct letters.

## Problem Description

The task is to create a function for a text-processing application that generates all possible anagrams from a given group of distinct letters. For example, the input `{a, b, c}` should return the output: `abc`, `acb`, `bac`, `bca`, `cab`, `cba`.

## Requirements

1.  The program should accept any group of distinct letters as input and produce the correct result.
2.  Optimize for readability and clarity.
3.  Include basic validation (e.g., ensure the input is non-empty and contains only letters).
4.  Write unit tests to validate the function with at least three different test cases, including edge cases (e.g., input with a single letter or empty input).
5.  Document the code clearly, explaining the logic for generating anagrams.

## Project Structure

* `Util.java`: Contains the implementation of the anagram generation logic.
* `UtilTest.java`: Contains unit tests for the `Util` class.
* `build.gradle`: Gradle build file for the project.
* `README.md`: This file.

## Implementation

The `Util` class provides the following public method:

* `public static Set<String> generateAnagrams(char[] chars)`: Generates all possible anagrams from the given array of distinct characters.

The implementation uses a recursive approach with backtracking to generate all permutations of the input characters.

### Logic Explanation

1.  **Validation:** The input array is validated to ensure it is not null or empty and contains only letters.
2.  **Recursion:** The `generateAnagramsRecursive` function recursively generates permutations by swapping characters and exploring different arrangements.
3.  **Backtracking:** After each recursive call, the characters are swapped back to their original positions to explore other permutations.
4.  **Result:** The generated anagrams are stored in a `HashSet` to ensure uniqueness and returned as the result.

## Build and Run

### Prerequisites

* Java Development Kit (JDK) 8 or later
* Gradle

### Build

To build the project, run the following command in the project root directory:

```bash
./gradlew build

Run Tests
To run the unit tests, execute the following command:

./gradlew test

Run the application
To run the application you can use an IDE, or create a runnable jar using gradle, and then run it.

Usage Example

char[] input = {'a', 'b', 'c'};
Set<String> anagrams = Util.generateAnagrams(input);
System.out.println(anagrams); // Output: [abc, acb, bac, bca, cab, cba]