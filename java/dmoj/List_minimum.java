package dmoj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List_minimum {

    /*
    * Solution by https://github.com/yak-fumblepack
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        sc.nextLine();

        ArrayList<Integer> array = new ArrayList<>(n);

        int number = 0;

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            array.add(number);
        }

        for (int i = 0; i < n; i++) {
            int smallestNumber = Collections.min(array);
            System.out.println(smallestNumber);
            array.remove(array.indexOf(smallestNumber));
        }

        sc.close();
    }
}
