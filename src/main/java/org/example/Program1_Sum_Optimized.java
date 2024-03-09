package org.example;
import org.junit.Assert;
import java.util.HashSet;
import java.util.Set;

public class Program1_Sum_Optimized {

    //input array =[1,2,3,4,5,6,7,3,4,22,44,0,9], target = 100
    //psuedo code -
    /* 1.

      Time complexity : O(n) -> Solution based on time
      Space complexity : O(n) -> Space occupied for your solution
    */

    //take one number ->  check target - number => check this resulted number present in array
    public static boolean twoSum(int[] nums, int targetSum){

        //edge case
        if(nums.length<=1){
            return false;
        }

        //load all inputs elements to a set
        Set<Integer> existingNums = new HashSet<>();

        // Iteration using enhanced for loop
        for (int num : nums) {
            existingNums.add(num);
        }
        //loop through input array
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = targetSum - nums[i];

            System.out.println("Pair " +x+ " " +y);
            //check for other number present in set and return true if present
            if(existingNums.contains(y)){  // --> O(1)
                return true;
            }
        }



        return false; //default return
    }

    public static void main(String[] args) {
        System.out.println("Result is --------->" +twoSum(new int[]{1,2,3,8,78,0,3,12,16,22},100));

        //unit tests
        Assert.assertTrue(twoSum(new int[]{1,2,3,8,78,0,3,12,16,22},100));

        Assert.assertFalse(twoSum(new int[]{1,2,3,8,78,0,3,12,16},100));

        //edge case

        Assert.assertFalse(twoSum(new int[]{},100));
        Assert.assertFalse(twoSum(new int[]{1},100));


    }
}
