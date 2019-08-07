package com.leetcode;

public class HammingDistance {

//
// The Hamming distance between two integers is the number of positions at
// which the corresponding bits are different.
//
//    Given two integers x and y, calculate the Hamming distance.
//
//            Note:
//            0 ≤ x, y < 231.
//
//    Example:
//
//    Input: x = 1, y = 4
//
//    Output: 2
//
//    Explanation:
//            1   (0 0 0 1)
//            4   (0 1 0 0)
//                   ↑   ↑
//
//    The above arrows point to positions where the corresponding bits are different.


//    149/149 test cases passed.
//            Status:Accepted
//    Runtime:10 ms
//
//    public static int hammingDistance(int x, int y) {
//        int z = x ^ y;
//
//        String binary = Integer.toBinaryString(z);
//        binary = binary.replace("0", "");
//        return binary.length();
//    }


//    149 / 149 test cases passed.
//            Status: Accepted
//    Runtime: 6 ms
    public static int hammingDistance(int x, int y) {
        int mayor = x > y ? x : y;
        int menor = x < y ? x : y;
        int z = mayor ^ menor;
        int count = 0;

        while (z > 0) {
            int b = ((z >> 0) & 1);
            z = (z >> 1);
            count += b > 0 ? 1 : 0;

        }
        return count;
    }

    public static void main(String[] args) {

        Main.p(hammingDistance(1, 4));//"Germán Raúl Loera Velasco"));

    }
}
