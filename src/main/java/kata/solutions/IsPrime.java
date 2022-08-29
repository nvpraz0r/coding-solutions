package kata.solutions;

/**
 * Is a number prime?
 *
 * Define a function that takes an integer argument and returns a logical value true or false depending on if the integer is a prime.
 * Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 *
 * EXAMPLE 1:
 * input: 0
 * output: false
 *
 * EXAMPLE 2:
 * input: 1
 * output: false
 *
 * EXAMPLE 3:
 * input: 2
 * output: true
 *
 * @see <a href="https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java">Is number prime?</a>
 */

public class IsPrime {
    public static boolean isPrime(int num){

        // if the number is less than or equal to 1
        // then number is NOT prime
        if(num <= 1) return false;

        // start loop at 2 because we already checked if num is less than or equal to 1
        for(int i = 2; i < num; i++){
            // if number is divisible by any number less than itself then
            // it is not prime
          if(num % i == 0) return false;
        }

        // if all else fails, return true
        return true;
    }
}
