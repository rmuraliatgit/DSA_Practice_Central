import java.util.*;
import java.util.stream.Collectors;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println("answer: "+thridmax(nums));
    }
    public static int thirdMax(int[] nums) {
        int answer = 0;
//
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        System.out.println(hashSet);
        Integer[] temp = new Integer[hashSet.size()];

        temp = hashSet.toArray(temp);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        Arrays.sort(temp);
        if(hashSet.size()>=3)return temp[2];
        else return temp[temp.length-1];

    }
    public static int thridmax(int[] nums){
        int answer = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],hashMap.containsKey(nums[i])?(hashMap.get(nums[i])+1):1);
        }
        System.out.println(hashMap);
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        Iterator<Map.Entry<Integer,Integer>> entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(entry.getValue()==1)al.add(entry.getKey());
            else al2.add(entry.getKey());
        }
        Collections.sort(al,Collections.reverseOrder());
        Collections.sort(al2,Collections.reverseOrder());

        int temp[] = new int[al.size()+al2.size()];
        int tt = 0;
        for (int x:al
             ) {
            temp[tt]=x;
            tt++;
        }
        for (int x:al2
        ) {
            temp[tt] = x;
            tt++;
        }
        System.out.println(al+" "+al2);
        for (int i:temp
             ) {
            System.out.print(i+" ");
        }
        if(al.size()==0)return temp[temp.length-1];
        if(temp.length>=3)return temp[2];
        else return temp[temp.length-1];
    }
}
