package level1practice;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        findMax(new int[]{5,10,20,3,2,1});
        findMax1(new int[]{5,10,20,3,2,1});
    }

    public static void findMax(int[] num){
        Arrays.sort(num);
        System.out.println("Max number is "+num[num.length-1]);
    }

    public static void findMax1(int[] num){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if(min>num[i]){
                min=num[i];
            }
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println("Max number is "+max);
    }
}
