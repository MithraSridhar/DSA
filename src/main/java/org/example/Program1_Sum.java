package org.example;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Program1_Sum {

    //input array =[1,2,3,4,5,6,7,3,4,22,44,0,9], target = 48
    //psuedo code - Brute force solution -> just solving the problem without taking complexity into consideration
    /* 1. Outer loop: loop all elements
        2. inner loop: loop for all inner elements(only at the right)
        3. form the pair with outer loop and inner loop elements
        4. sum it and check if that returns target
        5. if yes, return true: early return
        6. if no, keep continue loop

      Time complexity : O(n^2) -> Solution based on time
      Space complexity : O(n) -> Space occupied for your solution
    */

    public static boolean twoSum(int[] nums, int targetSum){

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int firstElement = nums[i];
                int secondElement = nums[j];
                int currentSum=firstElement+secondElement;
                if(currentSum == targetSum){
                    System.out.println("Indices are " +i+ " and " +j);
                    return true; //early return
                }
            }
        }


        return false; //default return
    }

    public static void main(String[] args) {
        System.out.println("Result is --------->" +twoSum(new int[]{1,2,3,8,78,0,3,12,16,22},100));

        //unit tests
      Assert.assertTrue(twoSum(new int[]{1,2,3,8,78,0,3,12,16,22},100));

      Assert.assertFalse(twoSum(new int[]{1,2,3,8,78,0,3,12,16},100));

        Assert.assertTrue(twoSum(new int[]{3,2,4},6));


    }
}
