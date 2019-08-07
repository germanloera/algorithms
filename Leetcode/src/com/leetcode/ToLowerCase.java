package com.leetcode;

public class ToLowerCase {
    public static final int a = (int) 'a';
    public static final int A = (int) 'A';
    public static final int space = a - A;

    public static String toLowerCase(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int c = (int) str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                char lowerCase = (char) (c + space);
                result.append(lowerCase);
            }else{
                result.append((char) c);
            }



        }
        return result.toString();
    }
    public static void main(String[] args){

        Main.p(toLowerCase("al&phaBET"));//"Germán Raúl Loera Velasco"));

    }

}
