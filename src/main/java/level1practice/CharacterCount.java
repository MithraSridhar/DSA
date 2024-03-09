package level1practice;

public class CharacterCount {

    public static void main(String[] args) {
        String test ="TestLeaf";
        char ch = 'a';

        int count = 0;
        char[] charArray = test.toLowerCase().toCharArray();

        for (int i = 0; i <charArray.length ; i++) {

            if(charArray[i]==ch){
                count++;
            }
        }
        System.out.println(count);


    }


}
