package kata.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Make the Deadfish Swim
 *
 * Write a simple parser that will parse and run Deadfish.
 * Deadfish has 4 commands, each 1 character long.
 * i -> increments the value
 * d -> decrements the value
 * s -> squares the value
 * o -> outputs the CURRENT value into the return array
 *
 * Invalid characters should be ignored.
 *
 * value starts at ZERO
 *
 * EXAMPLE 1:
 * input: string = "iiisdoso":
 * output: {8, 64}
 *
 * @see <a href="https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java">Deadfish</a>
 */

public class MakeTheDeadfishSwim {
    /**
     *
     * @param data String of commands to issue
     * @return result arraylist
     */
    public static int[] parse(String data) {

        List<Integer> list = new ArrayList<>();

        //the value indicated to be manipulated
        int value = 0;

        //loop through each character in the parameter
        for(char command : data.toCharArray()) {
            //enhanced switch case
            switch (command) {
                //increment value
                case 'i' -> value++;
                //decrement value
                case 'd' -> value--;
                //square value
                case 's' -> value *= value;
                //add value to the arraylist
                case 'o' -> list.add(value);
                //else do nothing
                default -> {}
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
