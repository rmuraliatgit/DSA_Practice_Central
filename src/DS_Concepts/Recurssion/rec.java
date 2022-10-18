package DS_Concepts.Recurssion;

public class rec {
    public static void main(String[] args) {
        // recu(5);
       // System.out.println(sumOfNnumbers(6));
       // System.out.println(sumOfDigits(1234));
       // System.out.println(productOfDigits(555));
       // System.out.println(reverseANumber(12345));
      // System.out.println(countZero(100800));
       // System.out.println(isSorted(new int[]{1,2,3,5,3,6},0));
        System.out.println(linearSearch(new int[]{1,2,3,5,33,6},33,0));
        skip("baccadh","");
        System.out.println(skip1("baccad"));
    }
    public static void recu(int n){
        if(n==0) {
            return;
        }
         recu(n-1);
        System.out.print(n+ " ");
    }
    public static int sumOfNnumbers(int n){
        if(n==0)return 0;
        return  n+=sumOfNnumbers(n-1);
    }
    public static int sumOfDigits(int n){
        if(n<0)return -1;
        if(n==0)return 0;
        return (n%10)+sumOfDigits(n/10);
    }
    public static int productOfDigits(int n){
        if(n%10==n)return n;
        return (n%10)*(productOfDigits(n/10));
    }
    public static String reverseANumber(int n){
        if(n<=0)return "";
        return String.valueOf(n%10)+reverseANumber(n/10);
    }
    public static int countZero(int n){
        int count=0;
        if(n==0)return count;
        if(n%10==0)count++;
        return count+countZero(n/10);
    }
    public static boolean isSorted(int[] arr,int index){
       if(index==arr.length-1)return true;
       return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }
    public static boolean linearSearch(int[] arr,int target,int index){
//        if(arr[index]==target)return index;
//        return linearSearch(arr,target,index+1);
        if(index==arr.length)return false;
        return arr[index]==target || linearSearch(arr,target,index+1);
    }
    public static void skip(String a,String b){
        if(a.isEmpty()) {
            System.out.println(b);
            return;
        }
        char ch = a.charAt(0);
        if(ch== 'a'){
            skip(b,a.substring(1));
        }
        else{
            skip(b+ch,a.substring(1));
        }
    }
    public static String skip1(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            return skip1(s.substring(1));
        }
        else return ch+skip1(s.substring(1));
    }
}
