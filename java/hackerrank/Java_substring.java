package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.Scanner;

public class Java_substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(S.substring(start, end));
    }

}
