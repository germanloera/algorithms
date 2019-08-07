package com.leetcode;

//Initially, there is a Robot at position (0, 0).
// Given a sequence of its moves, judge if this robot makes a circle,
// which means it moves back to the original place.
//
//
// The move sequence is represented by a string.
// And each move is represent by a character.
// The valid robot moves are R (Right), L (Left), U (Up) and D (down).
// The output should be true or false representing whether the robot makes a circle.
//
//
// Example 1:
//        Input: "UD"
//        Output: true
//
// Example 2:
//        Input: "LL"
//        Output: false


//62 / 62 test cases passed.
//        Status: Accepted
//        Runtime: 11 ms
public class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
char [] chars =  moves.toCharArray();
int v = evaluate(chars, 0);
return v == 0;

    }



    public static int evaluate(char[] c, int i){
        if(i == c.length ){
            return  0;
        }else if(c[i] == 'U' || c[i] == 'R'){
            return 1 + evaluate(c, i+1);
        }
        else if(c[i] == 'D' || c[i] == 'L'){
            return -1 + evaluate(c, i+1);
        }

        return 0;

    }

    public static void main(String [] args){

        Main.p(judgeCircle("UD"));

    }

}
