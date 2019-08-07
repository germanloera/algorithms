package com.leetcode;

import java.util.LinkedList;

public class AddTwoNumbers {

//    You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order and each of their nodes contain a single digit.
// Add the two numbers and return it as a linked list.
//
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//            Example:
//
//    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//    Output: 7 -> 0 -> 8
//    Explanation: 342 + 465 = 807.
//
//    https://leetcode.com/problems/add-two-numbers/description/
//

    public static void AddTwoNumbers(LinkedList<Integer> n1, LinkedList<Integer> n2) {
        long value = getNumber(n1) + getNumber(n2);
        LinkedList<Integer> result = toList(value);
        Main.p(result);
    }

    public static long getNumber(LinkedList<Integer> n) {
        long result = 0;
        int pow = 0;

        for (Integer number : n) {


            result = result + number * (long) Math.pow(10, pow);
            pow++;
        }

        return result;
    }


    public static LinkedList<Integer> toList(long value) {

        LinkedList<Integer> result = new LinkedList<>();
        while (value != 0) {
            long number =  (value % 10);
            result.addLast((int)number);
            value /= 10;
        }
        return result;
    }

    public static void main(String[] args) {

        LinkedList<Integer> n1 = new LinkedList<>();
        n1.add(9);
//        n1.add(2);
//        n1.add(4);
//        n1.add(3);

        LinkedList<Integer> n2 = new LinkedList<>();
        n2.add(1);
        n2.add(9);
        n2.add(9);
        n2.add(9);
        n2.add(9);
        n2.add(9);
        n2.add(9);
        n2.add(9);
        n2.add(9);
        n2.add(9);

//        n2.add(5);
//       n2.add(6);
//        n2.add(4);


        AddTwoNumbers(n1, n2);


    }


}
