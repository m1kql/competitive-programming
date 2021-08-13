package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/


import java.util.Arrays;
import java.util.Scanner;

public class Java_anagrams {

    public static boolean isAnagram(String a, String b) {
        boolean flag = new Boolean(false);

        char[] charArrayA = a.toLowerCase().toCharArray();
        char[] charArrayB = b.toLowerCase().toCharArray();

        int aLength = charArrayA.length;
        int bLength = charArrayB.length;

        if (aLength != bLength) {
            return false;
        }

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        for (int i = 0; i < aLength; i++) {
            if (charArrayA[i] != charArrayB[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a, b;
        a = sc.nextLine();
        b = sc.nextLine();

        boolean flag = isAnagram(a, b);

        if (flag) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }


    }

}
