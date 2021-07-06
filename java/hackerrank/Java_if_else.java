package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.io.*;
import java.util.*;

public class Java_if_else {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    // br = new BufferedReader(new InputStreamReader(System.in));
    // out = new PrintWriter(new OutputStreamWriter(System.out));
    // br = new BufferedReader(new FileReader("in.txt"));
    // out = new PrintWriter(new FileWriter("out.txt"));

    int N = sc.nextInt();
    sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    if (N % 2 == 0) {
      if (N > 20) {
        System.out.println("Not Weird");
      }
      if (2 <= N && N <= 5) {
        System.out.println("Not Weird");
      }
      if (6 <= N && N <= 20) {
        System.out.println("Weird");
      }
    } else {
      System.out.println("Weird");
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
