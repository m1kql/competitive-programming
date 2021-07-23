package leetcode;

/*
* Solution by https://github.com/yak-fumblepack
*/

public class Fizz_buzz {
  class Solution {
    public List <String> fizzBuzz(int n) {
      List<String> arr = new ArrayList<>();
      String fizz = "Fizz";
      String buzz = "Buzz";
      String fizzbuzz = "FizzBuzz";
      // using list.add because it appends the value if it fits the condition.
      // previously, I used list.set at index i which did not work.
      for (int i = 1; i <= n; i++) {
        // fizzbuzz
        if ((i % 3 == 0) && (i % 5 == 0)) {
          arr.add(fizzbuzz);
        }
        // fizz
        else if ((i % 3 == 0) && (i % 5 != 0)) {
          arr.add(fizz);
        }
        // buzz
        else if ((i % 3 != 0) && (i % 5 == 0)) {
          arr.add(buzz);
        }
        else {
          Integer temp = i;
          arr.add(temp.toString()); 
        }
      }
      return arr;
    }
  }
}