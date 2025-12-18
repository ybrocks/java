package C02MethodClass;

import java.util.ArrayList;
import java.util.Arrays;

//재귀함수 대표적인 기본예시 : 누적합계, 팩토리얼, 피보나치수열 등(모두 재귀로 푸는것을 권고하지 않음)
public class C12RecursiveExample {
    public static void main(String[] args) {

//        //1~10까지 누적합계 (for문)
//        int total = 0;
//        for (int i=1; i<=10; i++){
//            total += i;
//        }
//        System.out.println(total);
//
//        //1~10까지 누적합계 (재귀함수)
//        int total2 = sumAcc(1,10);
//        System.out.println(total2);

        //1~5까지 누적곱(팩토리얼) - for문
//        int result = 1;
//        for (int i = 1; i < 6; i++) {
//            result *= i;
//        }
//        System.out.println(result);
//
//        int result2 = factorial(5);
//        System.out.println(result2);

        //피보나치 수열 : f(n) = f(n-1) + f(n-2)
        // 1 1 2 3 5 8 13 21 34 ...
        //피보나치 수열의 10번째 값은?
        //풀이1 : for문만을 이용
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        for (int i = 2; i < 10; i++) {
            n3=n1+n2;

        }

        //풀이2 : dp(dynamic programing)알고리즘(기억하기-메모리제이션 알고리즘)을 활용한 풀이법
        //점화식 : f(n) = f(n-1) + f(n-2)
        int[] dp = new int[10];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<10; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(Arrays.toString(dp));

        //풀이3 : 재귀함수를 이용한 풀이법
        System.out.println(fibonacci(10));

    }

//    public static int sumAcc(int start, int end){
//        if (start>end){
//            return 0;
//        }
//        return start+sumAcc(start+1, end);
//    }

//public static int factorial(int n) {
//        if (n<=1){
//            return 1;
//        }
//        return n*factorial(n-1);
//}
    public static int fibonacci(int n){
        if (n<=2){
            return  1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

