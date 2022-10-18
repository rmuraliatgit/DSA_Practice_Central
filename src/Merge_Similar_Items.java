import java.util.*;

public class Merge_Similar_Items {
    public static void main(String[] args) {
        int[][]items1 = {{15,5},{2,6},{5,3},{14,8},{12,4},{19,6},{25,4},{13,4},{9,1}}, items2 = {{15,9},{2,4},{5,2},{14,4},{12,3},{19,10},{25,7},{13,6},{9,9}};
        mergeSimilarItems(items1,items2);
    }
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
            for (int i = 0; i < items1.length; i++) {
                int temp = 0;
                for (int j = 0; j < items2.length; j++) {
                    if(items1[i][0]==items2[j][0]) {
                        temp = items1[i][1] + items2[j][1];
                        hashMap.put(items1[i][0],temp);
                    }
                }
            }

                for (int i = 0; i < items1.length; i++) {
                    if(hashMap.containsKey(items1[i][0])) {
                        System.out.println("item1");
                        continue;
                    }
                    else {System.out.println("item1 else");
                        hashMap.put(items1[i][0], items1[i][1]);
                    }
                }


                for (int i = 0; i < items2.length; i++) {
                    if(hashMap.containsKey(items2[i][0])) {
                        System.out.println("item2");
                        continue;
                    }
                    else {System.out.println("item2 else");
                        hashMap.put(items2[i][0], items2[i][1]);
                    }
                }

        System.out.println(hashMap);
        int size = hashMap.size();
        int[][] t = new int[size][2];
        System.out.println(size);
        int x = 0;
        Iterator<Map.Entry<Integer,Integer>> entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            ArrayList<Integer> al = new ArrayList<>();
        }
        List<List<Integer>> answer = new ArrayList();
        List keys = new ArrayList(hashMap.keySet());
        Collections.sort(keys);
        System.out.println(keys);
        for(int i=0;i<t.length; i++){
            if(hashMap.containsKey(keys.get(i)))
            {
                t[x][0]= (int) keys.get(i);
                t[x][1] = hashMap.get(keys.get(i));
                x++;
            }
        }
        for(int i=0;i<t.length; i++){
            answer.add(Arrays.asList(t[i][0],t[i][1]));
        }
        System.out.println("answer: "+answer);
        return answer;
    }
}
