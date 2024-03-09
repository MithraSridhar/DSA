package week1.day1;

import java.util.List;

public class Fundamentals {


    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < 10; i++) { //Time complexity : O(n)T
            System.out.println("For loop -->" +i);
        }

        //while loop
        int i=0;
        while (i<100){ //Time complexity : O(n)T
            System.out.println("While loop-->" +i);
            i++;
        }

        //while loop
        int j=1;
        while (j<100){ //Time complexity : O(log n)T
            System.out.println("While loop-->" +i);
            j=j*2;
        }
        //1,2,4,8,16,32,64,128.......=> Grows exponentially - Logarithmic time complexity - meaning the looping becomes half compared to O(n)

        //while loop
        int k=1;
        while (k<100){ //Time complexity : O(n/2)T => O(n) [as constant is negligible]
            System.out.println("While loop-->" +i);
            k=k+2;
        }
        //1,3,5,7,......99 N/2 => N

        //for each loop
        int[] arr = new int[]{5,6,7};
        for (int x: arr) { //Time complexity : O(n)T
            System.out.println("For each loop-->" +x);
        }

        //do while
        int y= 0;
        do { //Time complexity : O(n)T
            System.out.println("Do while loop-->" +y);
            y++;
        }
        while (y<100);

        //Collections

        /*List
        List addition = O(1)
        List.get based on index = O(1)
        List looping = O(n)
        List.getIndexOf = O(n)

        Map
        Map addition = O(1)
        Get = O(1)
        removal = O(1)

        Set
        Set addition = O(1)
        Get = O(1)
        removal = O(1)
        */
    }
}
