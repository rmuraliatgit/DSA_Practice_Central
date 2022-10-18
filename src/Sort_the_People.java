import java.util.*;

public class Sort_the_People {
    public static void main(String[] args) {
      String[]  names = {"Alice","Bob","Bob"};
      int[] heights = {155,185,150};
      sortPeople(names,heights);
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        String[] answer = new String[names.length];
        int[] temp = heights.clone();
        HashMap<String,Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < names.length; i++) {
            hashMap.put(names[i], heights[i]);
        }
        System.out.println(hashMap);
        Arrays.sort(new int[][]{temp}, Collections.reverseOrder());
        Iterator<Map.Entry<String,Integer>> entries = hashMap.entrySet().iterator();
        for (int i = 0; i < temp.length; i++) {
            while (entries.hasNext()) {
                Map.Entry<String,Integer> entry = entries.next();
                if(hashMap.containsValue(temp[i]) ){
                    System.out.println("Key = " + entry.getKey() + temp[i]+ ", Value = " + entry.getValue());
                    answer[i] = entry.getKey();
                    break;
                }
            }
        }
        for (String s :
                answer) {
            System.out.print(s+" ");
        }


        return answer;
    }
}
