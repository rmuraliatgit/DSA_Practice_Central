package Medium.Array;

import java.util.ArrayList;
import java.util.Collections;

public class Queries_on_a_Permutation_With_Key {
    public static void main(String[] args) {
        int[] queries = {7,5,5,8,3};
        int m = 8;
        processQueries(queries,m);
    }
    public static int[] processQueries(int[] queries, int m) {
        int[] answer = new int[queries.length];
        ArrayList<Integer> queriesList = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            queriesList.add(queries[i]);
        }
        System.out.println(queriesList);
        ArrayList<Integer> p = new ArrayList<>();
            for (int i = 1; i <=m; i++) {
                p.add(i);
            }
        for (int i = 0; i < queries.length; i++) {
            int index = p.indexOf(queries[i]);
            answer[i] = index;
            p.remove(index);
            p.add(0,queries[i]);
        }
        System.out.println();
        for (int i:answer
             ) {
            System.out.print(i+" ");
        }
        return answer;
    }
}
