package level1practice;

public class ReverseString {
    public static void main(String[] args) {
        revString("Mithra");
    }

    public static void revString(String input){

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.println(input.charAt(i));
        }
    }
}
