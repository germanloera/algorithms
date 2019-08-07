package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseInt {


//    Given a 32-bit signed integer, reverse digits of an integer.
//
//
// Example 1:
//
//    Input: 123
//    Output: 321
//
// Example 2:
//
//    Input: -123
//    Output: -321
//
// Example 3:
//
//    Input: 120
//    Output: 21
//
// Note:
//    Assume we are dealing with an environment which could
// only store integers within the 32-bit signed integer range:[−231,  231 − 1].
// For the purpose of this problem, assume that your function returns 0 when
// the reversed integer overflows.
//

    public static void main(String[] Args){


       Main.p( ""+ reverseInt(-1575));


    }


    public static int reverseInt(int value){
        double result = 0;
        while (value != 0 ){
            int val = (int)((value % 10));
            value /= 10;
            result = result * 10 + val;

        }


return result > Integer.MAX_VALUE ? 0 : result < Integer.MIN_VALUE ? 0 : (int)result;
    }

}
