package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice_Two_Sum_HashMap {

    public static int[] sumTwo(int[] nums,int target){

        Map<Integer,Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int searchNum = target-nums[i];
            if(numbers.containsKey(target-nums[i])){
                System.out.println(i);
                System.out.println(numbers.get(target-nums[i]));
                return new int[] {i,numbers.get(target-nums[i])};
            }
            numbers.put(nums[i],i);
        }

        return new int[] {};


    }

    public static void main(String[] args) {

        System.out.println("Result is ---->" +sumTwo(new int[] {3,7},10));
    }
}
