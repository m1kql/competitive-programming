package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Java_strings_introduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        int lengthOfA = A.length();
        int lengthOfB = B.length();
        int sumOfAB = lengthOfA + lengthOfB;

        System.out.println(sumOfAB);

        ArrayList<String> aAndB = new ArrayList<>();
        aAndB.add(A);
        aAndB.add(B);

        Collections.sort(aAndB);

        boolean isBBeforeA = new Boolean(false);

        if (aAndB.get(0) != A) {
            isBBeforeA = true;
        }
        if (isBBeforeA) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        char firstLetterA = A.charAt(0);
        String firstLetterAUpper = String.valueOf(firstLetterA).toUpperCase();
        String newA = A.replace(String.valueOf(firstLetterA), firstLetterAUpper);

        char firstLetterB = B.charAt(0);
        String firstLetterBUpper = String.valueOf(firstLetterB).toUpperCase();
        String newB = B.replace(String.valueOf(firstLetterB), firstLetterBUpper);

        System.out.println(newA + " " + newB);

        sc.close();

    }

}
