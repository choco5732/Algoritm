package DP;

/**
 * 동적 계획법  (Dynamic Programming)
 * 분할 정복 (Divide and Conquer)
 * <p>
 * 문제를 풀기위한 알고리즘은 아니지만 문제를 풀기위한 전략으로 사용된다.
 * <p>
 * 1. 동적 계획법
 * - DP라고 불림
 * - 상향식 접근법
 * - 입력 크기가 작은 문제들을 해결한 후, Memorization 기법을 사용해 결과값을 저장한 후, 큰 크기의 문제를 해결하는 전략
 * <p>
 * 2. 분할 정복
 * - Memorization 기법 사용 X
 * - 하향식 접근법
 * - 문제를 잘개 쪼개 해결 한 후, 합병하면서 문제의 답을 찾는 전략
 */
public class RecursiveCall {


    public static void main(String[] args) {
        int answer = fibonacci(9);
        if (answer != -1) {
            System.out.println(answer);
        }

        RecursiveCall rc = new RecursiveCall();
        int answer2 = rc.fibonacciPro(10);
        System.out.println(answer2);


    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return -1;
    }

    public int fibonacciPro(int data) {
        if (data <= 1) {
            return data;
        }
        return fibonacciPro(data - 1) + fibonacciPro(data - 2);
    }
}
