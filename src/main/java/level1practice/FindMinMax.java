package level1practice;

import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        findMainMax(new int[] {23,45,89,-34,88});
        findMainMax1(new int[] {23,45,89,-34,88});
    }
    public static void findMainMax(int[] num){
        Arrays.sort(num);
        System.out.println("Min value is "+num[0]);
        System.out.println("Max value is "+num[num.length-1]);
    }

    public static void findMainMax1(int[] num){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("Min value is "+min);
        System.out.println("Max value is "+max);
    }

}
