package kata.solutions;

/**
 * Multiples of 3 or 5
 *
 * If we list all the natural numbers below 10 that are multiples or 3 or 5, we get 3,5,6 and 9.
 * The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 BELOW the number passed as a parameter.
 * Additionally, if the number is negative, return 0.
 *
 * NOTE: if the number is a multiple of BOTH 3 and 5, only count it ONCE.
 *
 * EXAMPLE 1:
 * input: 10
 * output: 23
 * ex: 3 + 5 + 6 + 9 = 23
 *
 *
 * @see <a href="https://www.codewars.com/kata/514b92a657cdc65150000006/train/java">MultiplesOfThreeOrFive</a>
 */

public class MultiplesOfThreeOrFive {
    /**
     *
     * @param number - the number
     * @return sum - the product of adding all the numbers that are divisible by 3 or 5
     */
    public int solution(int number) {
        /**
         * when using the statements separately
         * numbers like 15, 30, 60 will be calculated
         * twice because they fulfill the if-statement's
         * logical requirement, so I moved the two statements
         * in to a single if-statement to prevent double-dipping
         *
         *             if(i % 3 == 0) sum += i;
         *             if(i % 5 == 0) sum += i;
         */

        //for code reusability I put the variables
        //the objective of the problem may change
        final int FIRST_DIVISIBLE_NUMBER = 3;
        final int SECOND_DIVISIBLE_NUMBER = 5;

        int sum = 0;

        for(int i = 0; i < number; i++){

            if(i % FIRST_DIVISIBLE_NUMBER == 0 || i % SECOND_DIVISIBLE_NUMBER == 0) sum += i;

        }

        return sum;
    }
}