package level1practice;

import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        findDup(new int[]{3,4,5,3,6,7,7});
    }

    public static void findDup(int[] num){
        Arrays.sort(num);
        for (int i = 0; i < num.length-1; i++) {
            if(num[i]==num[i+1]){
                System.out.println("Duplicate value is "+num[i]);
            }
        }

    }
}
