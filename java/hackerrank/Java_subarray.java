package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Java_subarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        ArrayList<Integer> negativeSubArrays = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                ArrayList<Integer> tempSubArray = new ArrayList<>();

                for (int k = i; k <= j; k++) {
                    tempSubArray.add(array[k]);
                }
                int sum = tempSubArray.stream().mapToInt(Integer::intValue).sum();
                if (sum < 0) {
                    negativeSubArrays.add(sum);
                }
            }

        }
        System.out.println(negativeSubArrays.size());
    }

}
