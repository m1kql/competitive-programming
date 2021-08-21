package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_map {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Map map = new HashMap();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int phone = sc.nextInt();
            sc.nextLine();
            map.put(name, phone);
        }

        map.entrySet();


        while(sc.hasNext()) {
            String s = sc.nextLine();
            if (map.containsKey(s)) {
                System.out.print(s + "=" + map.get(s) + "\n");
            } else {
                System.out.println("Not found");
            }
        }

    }

}
