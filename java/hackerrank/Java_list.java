package hackerrank;

import java.io.*;
import java.util.*;

public class Java_list {

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

    sc.nextLine();

    List<Integer> new_list = new ArrayList<>(n);

    for (int i = 0; i < n; i++) {
      int list_item = sc.nextInt();
      new_list.add(list_item);
    }

    sc.nextLine();

    int q = sc.nextInt();

    sc.nextLine();

    for (int i = 0; i < q; i++) {
      String command = sc.next();
      if (command.equals("Insert")) {
        int q1 = sc.nextInt();
        int q2 = sc.nextInt();
        new_list.add(q1, q2);
      } else if (command.equals("Delete")) {
        int q1 = sc.nextInt();
        new_list.remove(q1);
      }
    }
    sc.close();

    for (int i = 0; i < new_list.size(); i++) {
      System.out.print(new_list.get(i) + " ");
    }

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