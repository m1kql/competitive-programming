package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Java_substring_comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        ArrayList<String> substringsArray = new ArrayList<>();

        for (int i = 0; i <= (s.length() - k); i++) {
            String currentSubstring = s.substring(i, (i+k));
            substringsArray.add(currentSubstring);
        }

        Collections.sort(substringsArray);

        smallest = substringsArray.get(0);
        largest = substringsArray.get(substringsArray.size()-1);

        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
