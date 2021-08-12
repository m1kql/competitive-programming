package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.Scanner;

public class Java_string_reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();


        // turn into char array for easy comparison
        char[] charArrayOfA = A.toCharArray();

        // start pointer A from the end of the array
        int pointerA = charArrayOfA.length - 1;
        // start pointer B from the start of the array
        int pointerB = 0;

        boolean isPalindrome = new Boolean(true);


        // while B < A
        // increment pointer B and decrement pointer A
        // obtain elements and if they are not equal
        // set the flag as false
        while (pointerB < pointerA) {
            if (charArrayOfA[pointerB++] != charArrayOfA[pointerA--]) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        sc.close();


    }

}
