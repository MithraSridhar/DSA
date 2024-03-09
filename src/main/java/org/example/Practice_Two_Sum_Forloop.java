package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.HashSet;
import java.util.Set;

public class Practice_Two_Sum_Forloop {

    public static int[] sumTwo(int[] nums,int target){


        int[] result = new int[2];

        Set<Integer> numbers = new HashSet<>();
        for (int num:nums) {
            numbers.add(num);
        }

        for (int i = 0; i < nums.length-1; i++) {

            int searchNum = target- nums[i];
            if(numbers.contains(searchNum)){
                result[0] =i;
                result[1] = ArrayUtils.indexOf(nums,searchNum);
                System.out.println(result[0]);
                System.out.println(result[1]);
                return new int[]{result[0],result[1]};
            }
        }
        return new int[]{result[0],result[1]};

    }

    public static void main(String[] args) {
        System.out.println("Result is ---->" +sumTwo(new int[]{3,7},10));
    }
}
