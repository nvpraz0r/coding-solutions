package kata.solutions;

/**
 * Abbreviate A Two Word Name
 *
 * Write a function to convert a name into initials.
 * This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 *
 * EXAMPLE 1:
 * input: Sam Harris
 * output: S.H
 *
 * EXAMPLE 2:
 * input: patrick feeney
 * output: P.F
 *
 * EXAMPLE 3:
 * input: P Favuzzi
 * output: P.F
 *
 * @see <a href="https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java">Abbreviate A Two Word Name</a>
 */

public class AbbreviateTwoWordName {
    /**
     * Objective of the problem is to return the first letter of each name (first and last) with a period between each letter.
     *
     * Psuedo
     *      create array for the names
     *      separate the parameter string
     *      get the first character of each name
     *      return the characters separated by a period
     *
     * @param name - the String parameter
     * @return names - the abbreviated version of the String parameter
     */
    public static String abbrevName(String name){
        //string of array NAMES equal to parameter NAME which will be separated at the space between names
        String[] names = name.split(" ");
        //return the first character of each name
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}
