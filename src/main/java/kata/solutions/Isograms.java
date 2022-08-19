package kata.solutions;

/**
 * Isograms
 *
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 * Implement a function that determines whether a string that contains only letters is an isogram.
 * Assume the empty string is an isogram. Ignore letter case.
 *
 * EXAMPLE 1:
 * input: str = "Dermatoglyphics"
 * output: true
 *
 * EXAMPLE 2:
 * input: str = "aba"
 * output: false
 *
 * EXAMPLE 3:
 * input: str = "moOse" (ignore letter case)
 * output: false
 *
 * @see <a href="https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java">Isograms</a>
 */

public class Isograms {
    public static boolean  isIsogram(String str) {
        /**
         * What I'm going for here is return true/false
         * return whether that string length is equal to the number of distinct chars in the string
         */
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
