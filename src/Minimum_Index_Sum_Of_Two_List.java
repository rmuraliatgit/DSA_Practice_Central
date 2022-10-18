import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;

public class Minimum_Index_Sum_Of_Two_List {
    public static void main(String[] args) {
      String[]  list1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"}, list2 = {"Piatti","Shogun","The Grill at Torrey Pines","Hungry Hunter Steakhouse"};
      findRestaurant(list1,list2);
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> answer = new ArrayList<>();
        ArrayList<String> List1 = new ArrayList<>();
        List1.addAll(List.of(list1));
        ArrayList<String> List2 =new ArrayList<>();
        List2.addAll(List.of(list2));
        System.out.println(List1+" "+List2);
        Map<String,Integer> hashMap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < List1.size(); i++) {
            if(List2.contains(List1.get(i)))
            {
                int tempInd = List2.indexOf(List1.get(i));
                System.out.println(List1.get(i)+" "+tempInd+" "+i+" "+min);
                if(min>=(tempInd+i)){
                    min=tempInd+i;
                    hashMap.put(List1.get(i),min);
                }
            }
        }
        System.out.println("hashMap: "+hashMap);
        int x = Collections.min(hashMap.values());
        Iterator<Map.Entry<String,Integer>> entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(x==entry.getValue())answer.add(entry.getKey());
        }
        System.out.println("answer: "+answer);
        String[] an = new String[answer.size()];
        for(int i=0;i<answer.size();i++){
            an[i]=answer.get(i);
        }
        return an;
    }
}
