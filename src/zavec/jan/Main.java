package zavec.jan;

import java.util.Arrays;

public class Main {
        public static class ListNode {
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

        static class MyCircularQueue {

            int[] numbers;
            int length;
            int howManyInsterted = 0;

            public MyCircularQueue(int k) {
                numbers = new int[k];

                length = k;
            }

            public boolean enQueue(int value) {
                if(howManyInsterted+1 <= length) {
                    numbers[howManyInsterted] = value;
                    howManyInsterted++;
                    return true;
                }
                return false;
            }

            public boolean deQueue() {
                if(howManyInsterted == 0)
                {
                    return false;
                }
                int[] copy = new int[length];
                 for(int i = 1 ; i < length; i++)
                 {
                     copy[i-1] = numbers[i];
                 }
                  numbers = Arrays.copyOf(copy,length);
                 howManyInsterted -= 1;


                return true;
            }

            public int Front() {
                if(howManyInsterted == 0){
                    return -1;
                }
                return numbers[0];
            }

            public int Rear() {
                if(howManyInsterted == length) {
                    return numbers[howManyInsterted-1];
                }
                if(howManyInsterted == 0)
                {
                    return -1;
                }


                return numbers[howManyInsterted-1];
            }

            public boolean isEmpty() {
                return howManyInsterted == 0;
            }

            public boolean isFull() {
                return howManyInsterted == length;
            }
    }


    public static void main(String[] args) {
       MyCircularQueue myQueue = new MyCircularQueue(3);
       myQueue.enQueue(1);
       System.out.println(myQueue.Rear());
        System.out.println(myQueue.Front());
        System.out.println(myQueue.isFull());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.enQueue(4));
        System.out.println(myQueue.Rear());
    }
}
