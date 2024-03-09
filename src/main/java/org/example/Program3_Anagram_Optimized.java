package org.example;


import java.util.Arrays;
import java.util.HashMap;

/*
* Given 2 string s1 and s2, return true if s1 is anagram of s2 and false otherwise
* Ana anagram is a word or phrase formed by rearranging the letters of a different word or phrase

* pseudo code:
*use map
* key (char)= char
* value (int)= count of char
*Map1 - String 1
* Map2 - String 2
* iterate through ket set and get keys
*    Time complexity : O(n) -> Solution based on time (Actual is n/2)
      Space complexity : O(1) -> Space occupied for your solution - Because we only have 26 char in alphabets
* */
public class Program3_Anagram_Optimized {


    public static boolean isAnagramApp1(String s1, String s2){


        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.length()== 0 & s2.length()==0){
            return true;
        }

        HashMap<Character, Integer> occurance1 = new HashMap<>();// --> O(26)S -> O(1)
        HashMap<Character, Integer> occurance2 = new HashMap<>();// --> O(26)S -> O(1)

        for (int i = 0; i < s1.length(); i++) { //---> O(m)T
            char c = s1.charAt(i);
            //java 8
            occurance1.merge(c,1,Integer::sum);

            /*//java 7
            if(occurance1.containsKey(c)){
                occurance1.put(c,occurance1.get(c)+1);
            }
            else{
                occurance1.put(c,1);
            }*/
        }

        for (int i = 0; i < s2.length(); i++) {//---> O(n)T
            char c = s2.charAt(i);
            //java 8
            occurance2.merge(c,1,Integer::sum);

            /*//java 7
            if(occurance2.containsKey(c)){
                occurance2.put(c,occurance2.get(c)+1);
            }
            else{
                occurance2.put(c,1);
            }*/
        }

        if(occurance1.keySet().size() != occurance2.keySet().size()) return false;

        for (char c:occurance1.keySet()) { // --> O(26)S -> O(1)S
            if(occurance2.containsKey(c)&&occurance1.get(c)!=occurance2.get(c)){
                return false;
            }
        }

        return true;
    }

    //app 2: using ASCII
    public static boolean isAnagramApp2(String s1, String s2){

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        //a n a g r a m
        // a-a = 65-65 =0
        //e-a= 70-65=5
        for(char c: s1.toCharArray()){
            s1Freq[c - 'a']++;
        }

        for(char c: s2.toCharArray()){
            s2Freq[c - 'a']++;
        }

        return Arrays.toString(s1Freq).equals(Arrays.toString(s2Freq));
    }

    public static void main(String[] args) {
        System.out.println("Result is ====>" +isAnagramApp1("cBrag","aGrab"));
        System.out.println("Result is ====>" +isAnagramApp1("Brg","Grab"));
        System.out.println("Result is ====>" +isAnagramApp1("bad ","dab"));
        System.out.println("Result is ====>" +isAnagramApp1("ba d","da b"));

        System.out.println("Result is ====>" +isAnagramApp2("cBrag","aGrab"));
        System.out.println("Result is ====>" +isAnagramApp2("Brg","Grab"));
        System.out.println("Result is ====>" +isAnagramApp2("bad ","dab"));
        System.out.println("Result is ====>" +isAnagramApp2("ba d","da b"));
    }
}
