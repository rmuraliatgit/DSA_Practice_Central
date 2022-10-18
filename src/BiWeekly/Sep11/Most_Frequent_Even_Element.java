package BiWeekly.Sep11;

import java.util.*;

public class Most_Frequent_Even_Element {
    public static void main(String[] args) {
       // int[] nums = {4287,799,8103,3526,8396,7060,8287,4214,4093,6763,651,4907,8350,4866,5114,5245,3198,6644,3620,1586,3068,2769,9506,2319,588,5055,730,6968,4814,144,5180,8798,8783,3319,7765,3254,7164,5462,8085,5481,8363,3135,2910,583,3751,3044,8734,4075,5489,7866,3404,9532,3751,571,7460,4934,9346,4076,1505,9576,9406,3342,8090,5979,3140,4453,4779,9324,2945,7279,6809,9619,6958,9881,8308,9246,2529,3727,1241,7230,4536,9852,1667,1688,1320,6400,6359,6140,904,6287,6499,9256,7666,4083,2927,3165,9239,9433,1620,6961,3115,8766,2416,6653,9030,2690,9165,6150,1644,5925};
        int[] nums = {0,1,2,2,4,4,1};

        System.out.println("answer: ");
        mostFrequent(nums);
    }
    public static int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0)
            hashMap.put(nums[i], hashMap.containsKey(nums[i]) ? (hashMap.get(nums[i]) + 1) : 1);
        }
        System.out.println(hashMap);
        int k = 0;
        Iterator<Map.Entry<Integer,Integer>> entries = hashMap.entrySet().iterator();
        int min = Integer.MAX_VALUE;
        int max = hashMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
        System.out.println("max: "+ max);
        ArrayList<Integer> al = new ArrayList<>();
        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(entry.getValue()>=max && entry.getKey()%2==0){
                al.add(entry.getKey());
            }
        }
        System.out.println(al);
        Collections.sort(al);
        if(al.isEmpty())return -1;
        else return al.get(0);
    }
    static int mostFrequent(int arr[])
    {
       ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)al.add(arr[i]);
        }
        System.out.println(al);
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)%2==0)
                hashMap.put(al.get(i), hashMap.containsKey(al.get(i)) ? (hashMap.get(al.get(i)) + 1) : 1);
        }
        if(hashMap.size()==0)return -1;
        int max = hashMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
        Iterator<Map.Entry<Integer,Integer>> entries = hashMap.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(entry.getValue()>max)max=entry.getValue();
        }
        System.out.println(max);
        ArrayList<Integer> all = new ArrayList<>();
        Iterator<Map.Entry<Integer,Integer>> entriess = hashMap.entrySet().iterator();

        while (entriess.hasNext()) {
            Map.Entry<Integer,Integer> entry = entriess.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()+" max: "+ max);
            if(entry.getValue()==max ){
                all.add(entry.getKey());
            }
        }
        Collections.sort(all);
        System.out.println(all);
        //return all.get(0);return
        if(all.isEmpty())return -1;
        else return all.get(0);
    }
}
