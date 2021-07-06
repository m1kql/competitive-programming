package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'reverseArray' function below.
   *
   * The function is expected to return an INTEGER_ARRAY. The function accepts
   * INTEGER_ARRAY a as parameter.
   */

  public static List<Integer> reverseArray(List<Integer> a) {

    List<Integer> reverse = new ArrayList<>();

    for (int i = a.size(); i-- > 0;) {
      int element = a.get(i);
      reverse.add(element);
    }
    return reverse;
  }

}

public class Array_ds {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
        .collect(toList());

    List<Integer> res = Result.reverseArray(arr);

    bufferedWriter.write(res.stream().map(Object::toString).collect(joining(" ")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }
}
