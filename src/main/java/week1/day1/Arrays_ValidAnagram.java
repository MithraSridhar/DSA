package week1.day1;

import java.util.Arrays;
import java.util.HashMap;
/*
* Given 2 string s1 and s2, return true if s1 is anagram of s2 and false otherwise
* Ana anagram is a word or phrase formed by rearranging the letters of a different word or phrase
*/

public class Arrays_ValidAnagram {
    public static boolean isAnagram(String s1, String s2){
/*        pseudo code:
*use map
* key (char)= char
* value (int)= count of char
*Map1 - String 1
                * Map2 - String 2
                * iterate through ket set and get keys
*    Time complexity : O(n) -> Solution based on time (Actual is n/2)
        Space complexity : O(1) -> Space occupied for your solution - Because we only have 26 char in alphabets
            */
        if(s1.length()!=s2.length()){
            return false;
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

        for (char c:occurance1.keySet()) { // --> O(26)S -> O(1)S
            if(occurance2.containsKey(c)&&occurance1.get(c)!=occurance2.get(c)){
                return false;
            }
        }

        return true;
    }

    //app 2: using ASCII

    public static boolean isAnagramApp2(String s1, String s2){
        //Time: O(n)
        //Space: O(1) => because we are only counting the occurance of characters so that char would be max of 26

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        //a n a g r a m
        // a-a = 65-65 =0
        //e-a= 70-65=5
        for(char c: s1.toLowerCase().toCharArray()){
            s1Freq[c - 'a']++;
        }

        for(char c: s2.toLowerCase().toCharArray()){
            s2Freq[c - 'a']++;
        }

        return Arrays.toString(s1Freq).equals(Arrays.toString(s2Freq));
    }


    public static void main(String[] args) {
        System.out.println("Result is ====>" +isAnagram("Brag","Grab"));
        System.out.println("Result is ====>" +isAnagram("Brg","Grab"));
        System.out.println("Result is ====>" +isAnagram("bad ","dab"));
        System.out.println("Result is ====>" +isAnagram("ba d","da b"));

        System.out.println("Result is ====>" +isAnagramApp2("anagram","nagaram"));
        System.out.println("Result is ====>" +isAnagramApp2("Brg","Grab"));
        //space wont work with ASCII
       // System.out.println("Result is ====>" +isAnagramApp2("bad ","dab"));
       // System.out.println("Result is ====>" +isAnagramApp2("ba d","da b"));
    }
}
