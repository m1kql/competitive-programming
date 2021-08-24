package hackerrank;

import java.util.Scanner;

public class Java_exception_handling {

    static class my_calculator {
        static long power(int a, int b) throws Exception {

            if (a < 0 || b < 0) {
                throw new Exception("n or p should not be negative.");
            }

            if (a == 0 && b == 0) {
                throw new Exception("n and p should not be zero.");
            }

            double answer = Math.pow(a,b);
            long finalAnswer = (long) answer;
            return finalAnswer;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc .hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}
