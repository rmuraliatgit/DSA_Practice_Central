public class Add_Two_Numbers {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "", s2 = "";
        while(l1!=null){
            s1+=String.valueOf(l1.val);
        }
        while(l2!=null){
            s2+=String.valueOf(l2.val);
        }
        System.out.println(s1);



         return new ListNode(0);
    }
    public static void main(String[] args) {

    }
}
