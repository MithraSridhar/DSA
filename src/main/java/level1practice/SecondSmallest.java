package level1practice;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        findSecSmall(new int[]{5,34,23,65,12,56});
        findSecSmall(new int[]{5});
    }

    public static void findSecSmall(int[] num){
        if(num.length<2){
            System.out.println("Invalid input");
        }
        else{
            Arrays.sort(num);
            System.out.println(num[1]);
        }

    }
}
