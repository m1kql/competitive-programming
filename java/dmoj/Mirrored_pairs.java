package dmoj;

import java.util.ArrayList;
import java.util.Scanner;

public class Mirrored_pairs {

    /*
    * Solution by https://github.com/yak-fumblepack
    */

    public static void main(String[] args) {
        System.out.println("Ready");
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> pairs = new ArrayList<>();
        while (true) {
            String chars = sc.nextLine();
            if (chars.equals("  ")) {
                break;
            } else {
                char firstChar = chars.charAt(0);
                char secondChar = chars.charAt(chars.length()-1);
                if ((firstChar == 'b' && secondChar == 'd') || (firstChar == 'd' && secondChar == 'b') || (firstChar == 'p' && secondChar == 'q') || (firstChar == 'q' && secondChar == 'p')) {
                    System.out.println("Mirrored pair");
                } else {
                    System.out.println("Ordinary pair");
                }
            }
        }
        sc.close();
    }

}
