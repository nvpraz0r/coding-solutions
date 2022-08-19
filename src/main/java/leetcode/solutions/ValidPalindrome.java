package leetcode.solutions;

/**
 * 125. Valid Palindrome
 *
 * A phrase is a palindrome, if after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * EXAMPLE 1:
 * input: s =  "A man, a plan, a canal: Panama"
 * output: true
 * explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * EXAMPLE 2:
 * input: s = "race a car"
 * output: false
 * explanation: "raceacar" is not a palindrome.
 *
 * EXAMPLE 3:
 * input: s = " "
 * output: true
 * explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 * @see <a href="https://leetcode.com/problems/valid-palindrome/">Valid Palindrome</a>
 */

public class ValidPalindrome {
    /**
     *
     * @param s
     * @return false -
     * @return true -
     */
    public boolean isPalindrome(String s) {

        //easy out
        if(s.equals(""))return true;

        //clean up the string parameter and convert it to lower case as per instructions
        s = s.replaceAll("[^A-Za-z]+", "").toLowerCase();

        String reversed = new StringBuffer(s).reverse().toString();

        char[] ch = s.toCharArray();
        char[] chR = reversed.toCharArray();

        int j = s.length() - 1;

        for(int i = 0; i < j; i++, j--){
            if(ch[i] != chR[j]) return false;
        }

        //return true
        return true;
    }
}
