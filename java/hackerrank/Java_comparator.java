package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Java_comparator {

    static class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

    }

    static class Checker implements Comparator<Player> {

        @Override
        public int compare(Player player1, Player player2) {
            int comparison = Integer.compare(player1.getScore(), player2.getScore())*-1;

            if (comparison != 0) {
                return comparison;
            } else {
                int comparisonOfNames = player1.getName().compareTo(player2.getName());
                return comparisonOfNames;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(sc.next(), sc.nextInt());
        }

        sc.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}
