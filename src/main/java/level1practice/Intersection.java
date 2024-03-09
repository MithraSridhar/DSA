package level1practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        findIntersection(new int[]{3,6,7,8,9,5}, new int[]{5,1,2,4,8,9});
    }

     public static void findIntersection(int[] arr1, int[] arr2){
        List<Integer> IntersectedArray = new ArrayList<>();

         for (int i = 0; i < arr1.length; i++) {
             for (int j = 0; j < arr2.length; j++) {
                 if(arr1[i]==arr2[j]){
                     IntersectedArray.add(arr1[i]);
                 }
             }

         }
         Collections.sort(IntersectedArray);
         System.out.println("Intersected Array is "+IntersectedArray);
     }
}
