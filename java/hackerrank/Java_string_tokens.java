package hackerrank;

import java.util.Scanner;

public class Java_string_tokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String delimiters = "[ !,?.\\_'@]+";

        if (s.trim().length() > 0) {

            String[] tokens = s.trim().split(delimiters);

            System.out.println(tokens.length);

            for (int i = 0; i < tokens.length; i++) {
                System.out.println(tokens[i]);
            }

        } else {
            System.out.println(0);
        }

        sc.close();
    }

}
