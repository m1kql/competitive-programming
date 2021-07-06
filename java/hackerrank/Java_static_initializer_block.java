package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.io.*;
import java.util.*;

public class Java_static_initializer_block {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;

  static Scanner sc = new Scanner(System.in);

  static int b = sc.nextInt();
  static int h = sc.nextInt();

  static Boolean no_exception = false;

  static {
    if (b <= 0 || h <= 0) {
      try {
        no_exception = false;
        throw new Exception("Breadth and height must be positive");
      } catch (Exception e) {
        System.out.print(e);
      }
    } else {
      no_exception = true;
    }
  }

  public static void main(String[] args) throws IOException {
    // br = new BufferedReader(new InputStreamReader(System.in));
    // out = new PrintWriter(new OutputStreamWriter(System.out));
    // br = new BufferedReader(new FileReader("in.txt"));
    // out = new PrintWriter(new FileWriter("out.txt"));

    if (no_exception) {
      int area = b * h;
      System.out.println(area);
    }

    sc.close();
    // out.close();
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
