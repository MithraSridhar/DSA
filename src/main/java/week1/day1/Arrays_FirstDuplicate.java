package week1.day1;

import java.util.HashSet;
import java.util.Set;

public class Arrays_FirstDuplicate {

    //Find first duplicate in an integer array

    public static void main(String[] args) {
        System.out.println("Best TC "+findFirstDuplicate(new int[]{7,3,2,3,2,7}));
        System.out.println("Best TC "+findFirstDuplicate(new int[]{7}));
        System.out.println("Best TC "+findFirstDuplicate(new int[]{}));
        System.out.println("Best TC "+findFirstDuplicate(new int[]{1,1}));
    }

    //Approach : 1
    public static int findFirstDuplicate(int[] nums){
        //Time: O(n) => Due to only one loop
        //Space: O(n) => as we are creating Set

        //edge case
        if(nums.length<=1){
            return -1;
        }

        Set<Integer> seenbag = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(seenbag.contains(nums[i])){
                return nums[i];
            }
            else{
                seenbag.add(nums[i]);
            }
        }
        return -1; //DR
    }
}
