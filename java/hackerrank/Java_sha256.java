package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Java_sha256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);

        MessageDigest digestSha256 = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digestSha256.digest(sc.nextLine().getBytes(StandardCharsets.UTF_8));

        String parsedHash = String.format("%064x", new BigInteger(1, encodedHash));

        System.out.println(parsedHash);
    }

}
