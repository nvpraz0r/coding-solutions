package kata.solutions;

/**
 * Good vs Evil
 *
 * The function will be given two parameters.
 * Each parameter will be a string of multiple integers separated by a single space.
 * Each string will contain the count of each race on the side of good and evil.
 *
 * EXAMPLE 1:
 * input: goodGuyArmy = "1 1 1 1 1 1", badGuyArmy = "1 1 1 1 1 1 1"
 * output: "Battle Result: Evil eradicates all trace of Good"
 *
 * EXAMPLE 2:
 * input: goodGuyArmy = "0 0 0 0 0 10", badGuyArmy = "0 1 1 1 1 0 0"
 * output: "Battle Result: Good triumphs over Evil"
 *
 * EXAMPLE 3:
 * input: goodGuyArmy = "1 0 0 0 0 0", badGuyArmy = "1 0 0 0 0 0"
 * output: "Battle Result: No victor on this battle field"
 *
 * @see <a href="https://www.codewars.com/kata/52761ee4cffbc69732000738/train/java">Good vs Evil</a>
 */

public class GoodVsEvil {
    /**
     *
     * Psuedo:
     *      create necessary variables
     *      split the single string into multiple variables and store them in an array
     *      loop through each array to determine the sum total value of each array
     *      return a message related to the large of the two sums
     *
     * @param goodGuyArmy
     * @param badGuyArmy
     * @return the result of the battle
     */
    public static String battle(String goodGuyArmy, String badGuyArmy) {

        //sum variables
        int goodGuyArmyStrength = 0, badGuyArmyStrength = 0 ;

        //split the string into separate variables and store them in an array
        String[] goodGuySoldiers = goodGuyArmy.split(" ");
        String[] badGuySoldiers = badGuyArmy.split(" ");

        //loop through array created from the parameter
        //add the values of the array together
        //parse the string to an integer
        for (String goodGuySoldier : goodGuySoldiers) {
            goodGuyArmyStrength += Integer.parseInt(goodGuySoldier);
        }

        for (String badGuySoldier : badGuySoldiers) {
            badGuyArmyStrength += Integer.parseInt(badGuySoldier);
        }

        //
        return (goodGuyArmyStrength > badGuyArmyStrength) ? "Battle Result: Good triumphs over Evil" :
                (badGuyArmyStrength > goodGuyArmyStrength) ? "Battle Result: Evil eradicates all trace of Good" :
                        "Battle Result: No victor on this battle field";
    }
}
