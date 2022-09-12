package kata.solutions;

/**
 * Your Order Please
 *
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes.
 * PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 *
 * EXAMPLE 1:
 * input:   "1234"
 * output:  "true"
 *
 * EXAMPLE 2:
 * input:   "12345"
 * output:  "false"
 *
 * EXAMPLE 3:
 * input:   "a234"
 * output:  "false"
 *
 * @see <a href="https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java">Regex Validate PIN Code</a>
 */

public class RegexValidateCode {
    //the solution
    public static boolean validatePin(String pin){
        //matches returns true or false based on the conditions of the regex
        return pin.matches("\\d{4} | \\d{6}");
        //the slashes followed by the letter "d" indicate the method should look for "digits"
        //the "4" indicates how many digits in the string
        //the "|" indicates to find a match for any one of the patterns
    }

    //my caveman solution
    public static boolean mySoltion(String pin){

        if(pin.length() != 4 && pin.length() != 6) return false;

        for(char c: pin.toCharArray()){
            if(!Character.isDigit(c)) return false;
        }

        return true;
    }
}
