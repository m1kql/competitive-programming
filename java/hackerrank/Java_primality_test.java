package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Java_primality_test {



    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger number = new BigInteger((String) n);

        boolean result = number.isProbablePrime(1);

        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        bufferedReader.close();

    }


}
