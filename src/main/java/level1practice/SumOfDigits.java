package level1practice;

public class SumOfDigits {
    public static void main(String[] args) {
        findSum(new int[]{3,4,5,6});
    }

    public static void findSum(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
             sum = num[i]+sum;
        }
        System.out.println("Sum is "+sum);
    }
}
