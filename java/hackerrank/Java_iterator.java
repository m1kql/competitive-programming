package hackerrank;

/*
* Solution by https://github.com/yak-fumblepack
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Java_iterator {

    static Iterator func(ArrayList myList) {
        Iterator it = myList.iterator();

        while (it.hasNext()) {
            Object element = it.next();

            if (element instanceof String) {
                break;
            }

        }

        return it;
    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }

}
