package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.*;
import java.io.*;

public class Java_datatypes {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    // br = new BufferedReader(new InputStreamReader(System.in));
    // out = new PrintWriter(new OutputStreamWriter(System.out));
    // br = new BufferedReader(new FileReader("in.txt"));
    // out = new PrintWriter(new FileWriter("out.txt"));

    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {

      try {
        long x = sc.nextLong();
        System.out.println(x + " can be fitted in:");
        if (x >= -128 && x <= 127)
          System.out.println("* byte");
        if (x <= 32767 && x >= -32768)
          System.out.println("* short");
        if (x >= -2147483648 && x <= 2147483647)
          System.out.println("* int");
        if (x >= Math.pow(-2, 63) && x <= (Math.pow(2, 63) - 1))
          System.out.println("* long");
      } catch (Exception e) {
        System.out.println(sc.next() + " can't be fitted anywhere.");
      }

    }

    // out.close();
    sc.close();
  }

  static String next() throws IOException {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }

  static long readLong() throws IOException {
    return Long.parseLong(next());
  }

  static int readInt() throws IOException {
    return Integer.parseInt(next());
  }

  static double readDouble() throws IOException {
    return Double.parseDouble(next());
  }

  static char readCharacter() throws IOException {
    return next().charAt(0);
  }

  static String readLine() throws IOException {
    return br.readLine().trim();
  }

}
