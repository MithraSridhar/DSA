package level1practice;

public class FibonacciSeries {

    public static void main(String[] args) {
        findFib(0,1,11);
    }
//0,1,1,2,3,5,8,13
    public static void findFib(int num1, int num2, int n){
        System.out.println(num1);
        System.out.println(num2);

        for(int i = 2 ; i<=n; i++){
            int sum = num1+num2;
            num1=num2;
            num2=sum;
            System.out.println(sum);
        }

    }
}
