package kata.solutions;

/**
 * Your Order Please
 *
 * Your task is to sort a given string.
 * Each word in the string will contain a single number.
 * This number is the position the word should have in the result.
 *
 * Note: numbers can be from 1 to 9. So, 1 will be the first not 0.
 *
 * Finally, if the input string is empty, return an empty string.
 *
 * EXAMPLE 1:
 * input:   "is2 Thi1s T4est 3a"
 * output:  "Thi1s is2 3a T4est"
 *
 * EXAMPLE 2:
 * input:   "4of Fo1r pe6ople g3ood th5e the2"
 * output:  "Fo1r the2 g3ood 4of th5e pe6ople"
 *
 * EXAMPLE 3:
 * input:   ""
 * output:  ""
 *
 * @see <a href="https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java">Your Order, Please</a>
 */

public class YourOrderPlease {
    public static String order(String words) {

        //split string parameter into an array of strings at the spaces
        String[] arrayOfStrings = words.split(" ");

        //initialize stringbuilder object
        StringBuilder result = new StringBuilder("");

        //the strings can only contain the numbers 1 - 9
        //therefore 10 is perfect to guarantee
        for(int i = 0; i < 10; i++){
            for(String s: arrayOfStrings){
                //if the item contains the value in the loop
                //append it to the stringbuilder object
                if(s.contains(String.valueOf(i))) result.append(s + " ");
            }
        }

        return result.toString().trim();
    }
}
