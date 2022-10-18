package StriverSheet.Day1_Arrays_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class next_permutation {
    public static void main(String[] args) {
        int[] array ={1,2,3};
        optimal(array);
    }
    public static int[] permutation(int[] array){
        List<Integer> list= new ArrayList<>();
        for (int i:array
             ) {
            list.add(i);
        }Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        int o = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==list.get(i))continue;
            else {
                o=0;break;
            }
        }if(o==1){
            System.out.println("asdf");
            int[] tt = new int[array.length];
            for (int i = 0; i <array.length;i++) {
                System.out.println(list.get(i));
                tt[i]=list.get(i);
            }tt=array;
            System.out.println();
            for (int i:array
                 ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        else {
            int a = -1;
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i - 1] < array[i]) {
                    a = i - 1;
                    break;
                }
            }
            int b = -1;
            for (int i = array.length - 1; i > 0; i--) {
                if (array[a] < array[i]) {
                    b = i;
                    break;
                }

            }
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
            for (int i : array
            ) {
                System.out.print(i + " ");
            }
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = a + 1; i < array.length - 1; i++) {
                al.add(array[i]);
            }
            System.out.println();
            Collections.reverse(al);
            int c = 0;
            for (int i = a + 1; i < array.length - 1; i++) {
                array[i] = al.get(c);
                c++;
            }
            for (int i : array
            ) {
                System.out.print(i + " ");
            }
            System.out.println(a + ":" + b + " " + al);
        }
        return array;
    }
    public static int[] optimal(int[] array){
        int ind1 = 0, ind2 = 0;
        for (int i = array.length-1; i >0; i--) {
            if(array[i-1]<array[i]){
                ind1=i-1;break;
            }
        }for (int i = array.length-1; i >0; i--) {
            System.out.println(i);
            if(array[i-1]>array[i]){
                ind2=i-1;break;
            }
        }
        System.out.println(ind1+" "+ind2);
        int[] te= new int[array.length];
        if(ind1>=0)
        {int temp = array[ind1];
            array[ind1]=array[ind2];
            array[ind2]=temp;
            ArrayList<Integer> al =new ArrayList<>();
            for (int i = ind1+1; i < array.length; i++) {
                al.add(array[i]);
            }
            Collections.sort(al);
            System.out.println(al);

            int x=0;
            for (int i = ind1+1; i < array.length; i++) {
                array[i]=al.get(x);x++;
            }}
        else
        {
            for (int i = array.length-1; i >=0; i--) {
                te[i]=array[i];
            }
        }
        array=te.clone();
        System.out.println();
        for (int i:array
        ) {
            System.out.print(i+" ");
        }
        return array;
    }

}
