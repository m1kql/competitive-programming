package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Java_biginteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger additionAnswer = a.add(b);
        BigInteger multiplicationAnswer = a.multiply(b);

        System.out.println(additionAnswer);
        System.out.println(multiplicationAnswer);

    }

}
