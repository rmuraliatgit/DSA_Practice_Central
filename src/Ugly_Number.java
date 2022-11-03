import java.util.ArrayList;
import java.util.List;

public class Ugly_Number {
    public  static boolean isUgly(int n) {
        if(n<0)return false;
        List<Integer> list = new ArrayList<>();
        int temp =n;
        int i =2;
        while(temp>1)
        {
            if (temp%i==0) {
                list.add(i);
                temp=temp/i;
            }
            else
                i++;

        }
        for(int j=0;j<list.size();j++){
            if(list.get(j)==2||list.get(j)==3||list.get(j)==5){
                continue;
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1305744254;
        System.out.println(isUgly(num));
    }
    public boolean isUgly2(int num) {
        if(num==1) return true;
        if(num==0) return false;
        while(num%2==0) num=num/2;
        while(num%3==0) num=num/3;
        while(num%5==0) num=num/5;
        return num==1;
    }
}
