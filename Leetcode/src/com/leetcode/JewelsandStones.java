package com.leetcode;

public class JewelsandStones {


//
// You're given strings J representing the types of stones that are jewels,
// and S representing the stones you have.
// Each character in S is a type of stone you have.
// You want to know how many of the stones you have are also jewels.
//
//
// The letters in J are guaranteed distinct,
// and all characters in J and S are letters. Letters are case sensitive,
// so "a" is considered a different type of stone from "A".
//
// Example 1:
//
//    Input: J = "aA", S = "aAAbbbb"
//    Output: 3
//
// Example 2:
//
//    Input: J = "z", S = "ZZ"
//    Output: 0
//
// Note:
//
//    S and J will consist of letters and have length at most 50.
//    The characters in J are distinct.


//   20 ms
// public static  int numJewelsInStones(String J, String S) {
//        StringBuilder b= new StringBuilder();
//        for(int i = 0; i < J.length(); i++){
//            char c = J.charAt(i);
//            b.append("(");
//            b.append(c);
//            b.append(")|");
//            }
//
//        String rejex = b.toString();
//        rejex = rejex.substring(0, rejex.length()-1);
//        Pattern pattern = Pattern.compile(rejex);
//        Matcher matcher = pattern.matcher(S);
//
//        int matches = 0;
//        while (matcher.find()) {
//            matches++;
//        }
//        return matches;
//
//
//    }


//12 ms
//    public static  int numJewelsInStones(String J, String S) {
//        int count = 0;
//
//        for(int i = 0; i< S.length(); i++){
//           count += J.contains(S.charAt(i)+"") ? 1 : 0 ;
//         }
//
//        return count;
//
//    }


//11 ms
    public static  int numJewelsInStones(String J, String S) {



        return count(J, S, 0);

    }

    public static int count(String J, String S,int  i){
        if(i == S.length()){
            return 0;
        }
        int c = J.contains(S.charAt(i)+"") ? 1 : 0 ;
        return c + count(J, S, i+1);

 }



    public static void main(String[] args){
//String J = "z", S = "ZZ";//
        String J =  "aA", S = "aAAbbbb";
        Main.p(numJewelsInStones(J, S));

    }


}
