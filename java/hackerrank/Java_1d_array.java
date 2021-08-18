package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Java_1d_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> array1D = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            array1D.add(input);
        }

        sc.close();

        for (int i = 0; i < array1D.size(); i++) {
            System.out.println(array1D.get(i));
        }

    }

}
