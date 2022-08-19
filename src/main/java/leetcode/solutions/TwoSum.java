package leetcode.solutions;

import java.util.HashMap;

/**
 * 1. Two Sum
 *
 * Given an array of integers nums and an integer target, return indices of the TWO NUMBERS such that they add up to the target
 * You may assume that each input would have EXACTLY ONE SOLUTION and you may not use the same element twice
 * You can return the answer in any order
 *
 * EXAMPLE 1:
 * input: nums = [2,7,11,15] , target = 9
 * output: [0,1]
 * explanation: because nums[0] + nums[1] == 9, we return [0,1]
 *
 * EXAMPLE 2:
 * input: nums = [3,2,4] , target = 6
 * output: [1,2]
 *
 * EXAMPLE 3:
 * input: nums = [3,3] , target = 6
 * output: [0,1]
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */

public class TwoSum {

    /**
     * Objective of the problem is to identify if any of the elements in the array add up to the target
     *
     * The idea behind the hashmap implementation is to subtract the current INDEX'S VALUE from the target to create a searchable value
     *
     * nums = {5, 2, 4 }
     * target = 6
     * searchable value = target - nums[i]
     * key -> value
     * 1 -> 0
     * 4 -> 1
     * 2 -> 2
     *
     * Then we check if the searchable sum exists in the hashmap
     * If it doesn't exist then we store it for future searches
     * If it does then we return the index from the complementary searchable sum and the current index
     *
     * For instance:
     * for loop:
     *
     *
     * @param nums - the array in which to pull the
     * @param target - the sum in which two elements of the array need to equal
     * @return - the numbers that add up to the target
     * @return null - if the target is not found in the
     */

    public int[] twoSum(int[] nums, int target) {

        //create map to store searchable sum (current index's value minus target)
        HashMap<Integer, Integer> searchableSum = new HashMap<>();

        //start for loop to loop through the nums array
        for(int i = 0; i < nums.length; i++){

            /**
             *
             * hashmap get() method returns the key or null if the map contains no mapping for the key
             * therefor if the get() method returns something, it will be the key we're looking for
             */
            if(searchableSum.get(nums[i]) != null) return new int[]{i, searchableSum.get(nums[i])};

            //to insert the searchable sum to the hashmap
            //subtract the value from the target to get the searchable sum
            //then include where we found the searchable sum which is the index
            //searchable sum = target - nums[i]
            searchableSum.put(target - nums[i], i);
        }

        //if the pair isn't found return null
        return null;
    }
}