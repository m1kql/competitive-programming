package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.io.*;
import java.util.*;

public class Java_int_to_string {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    // br = new BufferedReader(new InputStreamReader(System.in));
    // out = new PrintWriter(new OutputStreamWriter(System.out));
    // br = new BufferedReader(new FileReader("in.txt"));
    // out = new PrintWriter(new FileWriter("out.txt"));

    int n = sc.nextInt();

    Boolean works = false;

    try {
      String N = Integer.toString(n);
      works = true;
    } catch (Exception e) {
      System.out.println("Wrong answer");
    }

    if (works) {
      System.out.println("Good job");
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
