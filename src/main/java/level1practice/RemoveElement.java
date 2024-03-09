package level1practice;

import org.junit.Assert;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
      int[] output=  removeEle(new int[]{1,2,3,4,5},3);
        System.out.println(output);
        Assert.assertArrayEquals(output,new int[] {1,2,4,5});
    }

    public static int[] removeEle(int[] num,int target){
        int index=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=target){
                num[index++]=num[i];
            }
        }
        return Arrays.copyOf(num,index);
    }
}
