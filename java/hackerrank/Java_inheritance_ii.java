package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

class Arithmetic {
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

class Adder extends Java_inheritance_ii.Arithmetic {

}

public class Java_inheritance_ii {

    static class Arithmetic {
        int add(int a, int b) {
            int ans = a + b;
            return ans;
        }
    }

    static class Adder extends Arithmetic {

    }

    public static void main(String[] args) {
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }

}
