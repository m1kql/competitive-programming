package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_arraylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList[] table = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();

            table[i] = new ArrayList();

            for (int j = 0; j < d; j++) {
                int dIntegers = sc.nextInt();
                table[i].add(dIntegers);
            }

        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                Object resultObject = table[x-1].get(y-1);
                Integer result = new Integer((Integer) resultObject);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }


    }

}
