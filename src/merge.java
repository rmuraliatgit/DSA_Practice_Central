public class merge {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};
       // merge(arr1,arr2);
        int[] array = {1,2,3,4,5,6,7};
        int target = 10;
        //indexOfPair(array,target);
        normalRecrussion(10);
    }
    public static  int[] merge(int[] arr1, int[] arr2){
        int[] answer = new int[arr1.length + arr2.length];
            int x =0,ind =0,y=0;
        for (int i = 0; i < arr1.length+arr2.length; i++) {
//            System.out.println(arr1[i]+" "+arr2[x]+" "+answer[ind]);
            if(arr1[y]==arr2[x]){
                answer[ind] = arr1[y];
                answer[ind+1] = arr2[x];
                ind++;x++;y++;
            }
            else if(arr1[y]<arr2[x]){
                answer[ind] = arr1[y];
                ind++;y++;
            }
            else if(arr1[y]>arr2[x]){
                answer[ind] = arr2[x];
                x++;ind++;
            }
        }
        for (int i:answer
             ) {
            System.out.print(i+" ");
        }
        return answer;
    }
    public static void  normalRecrussion(int n){
        if(n<1){
            System.out.println("out of milk");
        }
        else{
            normalRecrussion(n-1);
            System.out.println(n);
        }
    }
    public static void indexOfPair(int[] array, int target){
        if(!(array.length >0)) System.out.println("input array has no elements");;
        int[] answer = new int[2];
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if((array[i]+array[j]) == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        for (int i:answer
             ) {
            System.out.print(i+" ");
        }
        if(answer[0]==0 && answer [1]==0) System.out.println("no such pairs are available");
    }
}
