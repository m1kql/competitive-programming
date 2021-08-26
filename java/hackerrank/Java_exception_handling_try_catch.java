package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.Scanner;

public class Java_exception_handling_try_catch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;

        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
            return;
        }
        try {
            y = sc.nextInt();
        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
            return;
        }

        try {
            System.out.println(x/y);
        } catch (Exception e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
            return;
        }

    }

}
