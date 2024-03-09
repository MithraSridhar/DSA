package org.example;

import org.junit.Assert;

public class Palindrome_Number_two_pointer {

    public static boolean isPalindrome(int x) {
        if(x<1){
            return false;
        }
        char[] c = String.valueOf(x).toCharArray();
        int startIndex = 0;
        int lastIndex = c.length-1;

        while(startIndex<lastIndex){
            if(c[startIndex]!=c[lastIndex]){
                return false;
            }
            startIndex++;
            lastIndex--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("solution is ===> " +isPalindrome(121));

        Assert.assertTrue(isPalindrome(121));
        Assert.assertFalse(isPalindrome(-121));
        Assert.assertFalse(isPalindrome(0));
        Assert.assertFalse(isPalindrome(10));
    }
}
