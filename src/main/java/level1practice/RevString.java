package level1practice;

public class RevString {
    public static void main(String[] args) {
        revString("Iam a Software Tester");
    }

    public static void revString(String text) {
        String[] strArray = text.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            if (i % 2 == 0) {
            char[] temchar= strArray[i].toCharArray();
                for (int j = temchar.length-1; j >=0; j--) {
                    System.out.print(temchar[j]);
                }
            }
            else{
                System.out.print(" ");
                System.out.print(strArray[i]);
            }
        }
    }
}