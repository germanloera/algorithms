package com.leetcode;



import java.util.Random;

public class AddTwoNumbersSolution {




        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            return sum(l1, l2, 0);
        }

        public static ListNode sum(ListNode l1, ListNode l2, int acarreo){
            if(l1 == null && l2 == null){
                if(acarreo == 0){
                    return null;
                }else{
                    return new ListNode(acarreo);
                }

            }else if(l1 == null && l2 != null){
                int val = l2.val + acarreo;
                acarreo = val / 10;

                ListNode nuevo = new ListNode(val % 10);
                nuevo.next = sum (l1, l2.next, acarreo);
                return nuevo;
            }else if(l1 != null && l2 == null){

                int val = l1.val + acarreo;
                acarreo = val / 10;

                ListNode nuevo = new ListNode(val % 10);
                nuevo.next = sum (l1.next, l2, acarreo);
                return nuevo;
            }

            int val = l1.val+ l2.val + acarreo;
            acarreo = val / 10;

            ListNode nuevo = new ListNode(val % 10);
            nuevo.next = sum (l1.next, l2.next, acarreo);
            return nuevo;

        }


        public static void plist(ListNode n){
            if(n == null){
                return;
            }

            plist(n.next);
            Main.p(n.val);

        }


    public static void main(String[] args){
        Random r = new Random();
           ListNode h1 = new ListNode(r.nextInt(9));
        ListNode h2 = new ListNode(r.nextInt(9));
ListNode c = h1;

        int max = r.nextInt(30);
        for(int i =0; i< max; i++ ){
            c.next = new ListNode(r.nextInt(9));
            c = c.next;
        }

        c = h2;
        max = r.nextInt(30);
        for(int i =0; i< max; i++ ){
            c.next = new ListNode(r.nextInt(9));
            c = c.next;
        }

        Main.p("h1");
        plist(h1);
        Main.p("");
        Main.p("h2");
        plist(h2);
        Main.p("");
        Main.p("result");
        ListNode l = addTwoNumbers(h1, h2);
        plist(l);


    }




}

 class ListNode {
    int val;
    ListNode next;
      ListNode(int x) { val = x; }
  }