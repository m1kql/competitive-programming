package hackerrank;

import java.util.Scanner;

public class Valid_username_regular_expression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {

            String username = sc.nextLine();
            if (username.length() < 8 || username.length() > 30) {
                System.out.println("Invalid");
            } else if (username.matches("(^[a-zA-Z][0-9_|a-zA-Z]{7,29})")) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }

    }

}
