package com.leetcode;


import com.leetcode.Main;

import java.util.Set;

public class DemoCodity {

    /* This is a demo task.

     Write a function:

     class Solution { public int solution(int[] A); }

     that, given an array A of N integers,
     returns the smallest positive integer
     (greater than 0) that does not occur in A.

     For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

     Given A = [1, 2, 3], the function should return 4.

     Given A = [−1, −3], the function should return 1.

     Write an efficient algorithm for the following assumptions:

     N is an integer within the range [1..100,000];
     each element of array A is an integer within the range [−1,000,000..1,000,000].

      https://codility.com/demo/take-sample-test



          java.util.Arrays.parallelSort(A);
        int sum = 0;
        int result = 0;
        int last = 0;
        boolean flag = true;
        for (int i = 0; i < A.length - 1; i++) {

            if (A[i] <= 0) {
                sum += A[i];
                continue;
            }

            flag = false;

            int x = A[i + 1] - A[i];
            if (x > 1) {
                result = A[i] + 1;
                return result;

            } else {

                last = A[i];

            }


        }


        if (flag) {
            sum += A[A.length - 1];
        }


        if (sum < 0) {
            return 1;
        } else {

            return A[A.length - 1] - last > 1 ? last + 1 : A[A.length - 1] + 1;
        }




     */
    public static int solution(int[] A) {
        // write your code in Java SE 8
        //Set;



        java.util.Arrays.parallelSort(A);
        int sum = 0;
        int result = 0;
        int last = 0;
        boolean flag = true;
        for (int i = 0; i < A.length ; i++) {

            if (A[i] <= 0) {
                sum += A[i];
                continue;
            }

            flag = false;

            int b = (i+1) == A.length ? 0 : A[i + 1];


            int x = b - A[i];
            if (x > 1) {
                result = A[i] + 1;
                return result;

            } else {

                last = A[i];

            }


        }




        if (sum < 0) {
            return 1;
        } else {

            return A[A.length - 1] - last > 1 ? last + 1 : A[A.length - 1] + 1;
        }


    }


    public static void main(String[] a) {

        int[] A = {1,1,1,1,1,1,1,1,1,1,1, 0};
        // {1, 2, 3};
        //{1, 3, 6, 0, 4, 1, 2};
        //{-1,-3};

        int s = DemoCodity.solution(A);

        Main.p(s);
    }


}
