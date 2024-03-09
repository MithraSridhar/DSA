package week1.day1;

import java.util.HashMap;
import java.util.Map;

public class Arrays_twosumTarget {

    public static int[] twoSumApp1(int[] nums ,int target){

       // Time complexity : O(n) -> Solution based on time
       // Space complexity : O(n) -> Space occupied for your solution

        Map<Integer,Integer> seenBag = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target-nums[i];
            if(seenBag.containsKey(y)){
                return new int[]{seenBag.get(y),i};
            }
            else{
                seenBag.put(nums[i],i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
     int[] result=   twoSumApp1(new int[]{1,2,3,8,78,0,3,12,16,22},100);
        for (int item:result) {
            System.out.println(item);
        }

        int[] result1=   twoSumApp1(new int[]{2,7,11,15},22);
        for (int item:result1) {
            System.out.println(item);
        }
    }
}
