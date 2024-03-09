package week1.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//@author -mithra
public class Arrays_ContainsDuplicate {

    //LEETCODE 217 - EASY
    /*Given integer array - return true if any value appears twice and false if all are distinct
    * */
    public static void main(String[] args) {
        //brute force
        System.out.println("Brute Force "+containsDuplicate_BruteForce(new int[]{1,9,8,11,21,9,2}));
        System.out.println("Brute Force "+containsDuplicate_BruteForce(new int[]{1,9,8,11,21,2}));
        System.out.println("Brute Force "+containsDuplicate_BruteForce(new int[]{1}));
        System.out.println("Brute Force "+containsDuplicate_BruteForce(new int[]{}));
        System.out.println("Brute Force "+containsDuplicate_BruteForce(new int[]{1,1}));

        //best TC
        System.out.println("Best TC "+containsDuplicate_BestTC(new int[]{1,9,8,11,21,9,2}));
        System.out.println("Best TC "+containsDuplicate_BestTC(new int[]{1,1}));
        System.out.println("Best TC "+containsDuplicate_BestTC(new int[]{}));
        System.out.println("Best TC "+containsDuplicate_BestTC(new int[]{5,6,4,5,6,}));

        //best SC
        System.out.println("Best SC "+containsDuplicate_BestTC(new int[]{1,2,3,4,2,3,3}));

    }

    //Approach 1 : Brute force solution
    public static boolean containsDuplicate_BruteForce(int[] nums){
        //Time: O(n^2) => Due to nested loops
        //Space: O(1) => only 3 constants

        int len = nums.length;

        //edge cases
        if(len<=1){
            return false;
        }

        for (int i = 0; i <len-1 ; i++) {
    /*i<len-1 because we will not have any element to check after index 6 as
    we require 2 elements to compare - i<len would also work but one extra loop*/
            int primaryNum = nums[i];
            for (int j = i+1; j < len; j++) {
                int secondayNum=nums[j];
                if(primaryNum==secondayNum){
                    return true;  //Early return (ER)
                }
            }
        }
        return false; //Default return (DR)
    }

    //Approach 2 : Best TC
    public static boolean containsDuplicate_BestTC(int[] nums){
        //Time: O(n) => Due to only one loop
        //Space: O(n) => as we are creating Set

        //edge case
        if(nums.length<=1){
            return true;
        }

        Set<Integer> seen = new HashSet<>();
        for (int num:nums) {
            if(seen.contains(num)){
                return true; //ER
            }
            else{
                seen.add(num);
            }
        }
        return false; //DR
    }
    //Approach 3 : Best SC => This is the best approach if the input array is already sorted
    public static boolean containsDuplicate_BestSC(int[] nums){
        //Time: O(n log n) => Due to only one loop
        //Space: O(1) => as we are not creating any space

        Arrays.sort(nums); // TC: O(n log n)

        for (int i = 0; i < nums.length; i++) { //TC: O(n)
            if(i==0){//edge case as previous element is negative
                continue;
            }
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false; //DR
    }
}
