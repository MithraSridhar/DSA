package org.example;

import org.junit.Assert;

public class Program2_Palindrome {

    //palindrome - brute force
   // A phrase is a palindrom if , it reads the same forward and backward

    /*
    loop the chars of input from right to left
    build the reversed the string
    compare the input vs reversed string and check they are same or not
          Time complexity : O(n) -> Solution based on time
      Space complexity : O(n) -> Space occupied for your solution
    * */

    public static boolean isPalindrome(String s){

        //initialize the reversed string
        String reversedString =""; //--> O(n)C as it is a copy of same input
        //loop through char from right to left
        for (int i = s.length() -1; i >=0; i--) { //--> O(n)T
            char c = s.charAt(i);
            //build reverse string
            reversedString = reversedString +c;
        }
        //compare input vs reversed string
        return s.equals(reversedString);
    }

    public static void main(String[] args) {
        System.out.println("Result is ===> " +isPalindrome("bob"));
        //unit tests
        Assert.assertTrue(isPalindrome("racecar"));
        Assert.assertTrue(isPalindrome("bob"));
        Assert.assertTrue(isPalindrome("dad"));
        Assert.assertFalse(isPalindrome("bad"));
    }


}

