public class DI_String_Match {
    public static void main(String[] args) {
        String s = "DDI";
        diStringMatch(s);
    }
    public static int[] diStringMatch(String s) {
        int[] answer = new int[s.length()+1];
        int temp[] = new int[answer.length];
        for (int i = 0; i <=s.length(); i++) {
            temp[i]=i;
        }
        for (int x:temp
        ) {
            System.out.print(x+" ");
        }
        System.out.println();
        int left = 0, right = temp.length-1,index=0;

        for (int i = 0; i < s.length(); i++) {
            System.out.println(left+" "+right+" "+index);
            if(s.charAt(i)=='I'){
                answer[index]=temp[left];
                left++;index++;
            }
            else if(s.charAt(i)=='D'){
                answer[index]=temp[right];
                right--;index++;
            }
        }
        while(left<=s.length() && left<=right){
            answer[index]=temp[left];
            index++;
            left++;
        }
        while(right>=0 && right>=left){
            answer[index]=temp[right];
            index++;
            right--;
        }
        for (int x:answer
        ) {
            System.out.print(x+" ");
        }
        return answer;
    }
}
