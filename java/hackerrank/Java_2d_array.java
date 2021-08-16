package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java_2d_array {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> hourglassSums = new ArrayList<>();

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

        System.out.println(max_hourglass);


        bufferedReader.close();
    }

}
