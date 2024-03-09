package org.example;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        System.out.println("Result is " +twoSum(new int[]{1,2,3,8,78,0,3,12,16,22},100));
    }

    public static int[] twoSum(int[] nums, int target) {
        System.out.println(nums);
        Set<Integer> numbers = new HashSet<>();

        for (int num :nums ){
            numbers.add(num);
        }

        int[] solution = new int[2];
        for(int i=0; i<nums.length-1;i++){
            int searchNum = target-nums[i];

            if(numbers.contains(searchNum)){
                solution[0]= i;
                solution[1]= Arrays.asList(nums).indexOf(searchNum);
                System.out.println(solution);
                return solution;
            }
        }

        return solution;
    }
}