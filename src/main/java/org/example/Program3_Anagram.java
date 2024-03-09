package org.example;


import java.util.Arrays;

/*
* Given 2 string s1 and s2, return true if s1 is anagram of s2 and false otherwise
* Ana anagram is a word or phrase formed by rearranging the letters of a different word or phrase

* pseudo code:
* 1. calculate length of both string
* check length matches, if does not match return false
* if length matches
* convert string to char array
* sort the array
* check equals
*
*    Time complexity : O(n * log n) -> Solution based on time (Actual is n/2)
      Space complexity : O(1) -> Space occupied for your solution
* */
public class Program3_Anagram {


    public static boolean isAnagram(String s1, String s2){


        if(s1.length()!=s2.length()){
            return false;
        }
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1) ; // O(n log n)
        Arrays.sort(c2) ;

       if(Arrays.equals(c1,c2)){
        return true;
       }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Result is ====>" +isAnagram("Brag","Grab"));
        System.out.println("Result is ====>" +isAnagram("Brg","Grab"));
        System.out.println("Result is ====>" +isAnagram("bad ","dab"));
        System.out.println("Result is ====>" +isAnagram("ba d","da b"));
    }
}
