package org.example;

import org.junit.Assert;

public class Program2_Palindrome_Optimized {

    //palindrome - 2 pointer approach
   // A phrase is a palindrom if , it reads the same forward and backward

    /*
    create start and end index
    compare the char at start and end index
    if does not match return false
    if matches continue loop and return true
      Time complexity : O(n) -> Solution based on time (Actual is n/2)
      Space complexity : O(1) -> Space occupied for your solution
    * */

    public static boolean isPalindrome(String s){

        if(s.length()==1){
            return true;
        }
        if(s.equals("")){
            return false;
        }

        int startIndex = 0;
        int endIndex = s.length()-1;

        while(startIndex<=endIndex){
            //to check if we have anything other than lower case char like special chars and space
            //startIndex++ (skip the left char if it is not a lower case char)
            //endIndex-- (skip the right char if it is not a lower case char)
            if(s.charAt(startIndex)!=s.charAt(endIndex)){
                return  false; //early return
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("Result is ===> " +isPalindrome("bob"));

        //unit tests
        Assert.assertTrue(isPalindrome("racecar"));
        Assert.assertTrue(isPalindrome("bob"));
        Assert.assertTrue(isPalindrome("dad"));
        Assert.assertFalse(isPalindrome("bad"));
        Assert.assertTrue(isPalindrome("a"));
        Assert.assertFalse(isPalindrome(""));
    }


}

