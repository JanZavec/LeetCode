import java.math.BigInteger;

class solution1 {

  public class ListNode {
       int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     
    public static String reverseWords(String s) {
       StringBuilder builder = new StringBuilder();
       builder.append(s);
      return String.valueOf(builder.reverse());
    }


    public static  int concatenatedBinary(int n) {
      long result=1;
      int length=0;
      for(int i=2;i<=n;i++) {
          length=((int)(Math.log(i)/Math.log(2)))+1;
          result=((result<<length)+i)%1000000007;
      }
      return (int)result;
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1 != null)
        {
          

        }

      return merged;
  
  
  }


    public static void main(String[] args)
    {
            int a = 12;
            System.out.println(concatenatedBinary(42));


       
    }
}