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
   * Complete the 'hourglassSum' function below.
   *
   * The function is expected to return an INTEGER. The function accepts
   * 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int hourglassSum(List<List<Integer>> arr) {
    List<Integer> hourglassSums = new ArrayList<>();

    /*
     * Iterate up to 4 because each hourglass stretches 3 elements and there can
     * only be 4 such hourglass in each row.
     */

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        int hourglass1 = arr.get(i).get(j);
        int hourglass2 = arr.get(i).get(j + 1);
        int hourglass3 = arr.get(i).get(j + 2);
        int hourglassmid = arr.get(i + 1).get(j + 1);
        int hourglass4 = arr.get(i + 2).get(j);
        int hourglass5 = arr.get(i + 2).get(j + 1);
        int hourglass6 = arr.get(i + 2).get(j + 2);
        int sum = hourglass1 + hourglass2 + hourglass3 + hourglass4 + hourglass5 + hourglass6 + hourglassmid;
        hourglassSums.add(sum);
      }
    }

    int max_hourglass = Collections.max(hourglassSums);
    return max_hourglass;
  }

}

public class Array_2d_ds {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, 6).forEach(i -> {
      try {
        arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
            .collect(toList()));
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    int result = Result.hourglassSum(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
