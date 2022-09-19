package leetcode.solutions;

import java.util.ArrayList;

/**
 * Duplicate Zeroes
 *
 * Given a fixed-length integer array, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 *
 * EXAMPLE 1:
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 *
 * EXAMPLE 2:
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 */

public class DuplicateZeros {
    public void duplicateZeros(int[] paramArray){

        ArrayList nums = new ArrayList();

        for(int i = 0; i < paramArray.length; i++){
            if(paramArray[i] == 0 && i != paramArray.length - 1){
                nums.add(0);
                nums.add(0);
            } else {
                nums.add(paramArray[i]);
            }
        }

    }
}
