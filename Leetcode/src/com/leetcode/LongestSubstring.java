package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {


//    Given a string, find the length of the longest substring without repeating characters.
//
//    Examples:
//
//    Given "abcabcbb", the answer is "abc", which the length is 3.
//    Given "bbbbb", the answer is "b", with the length of 1.
//    Given "pwwkew", the answer is "wke", with the length of 3.
//    Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

//    public static int lengthOfLongestSubstring(String s) {
//        Set<Character> elements = new HashSet<>();
//        Set<Character> dummy = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            char current = s.charAt(i);
//            char  next = 0;
//            boolean containsCurrent =  dummy.contains( current);
//            boolean containsNext = false;
//            if( i + 1 < s.length()){
//                next = s.charAt(i+1);
//                containsNext = dummy.contains( next);
//            }
//
//
//            if(( containsCurrent && containsNext) || (current ==  next) ){
//                if(!containsCurrent){
//                    dummy.add(current);
//                }
//
//                elements = getLonger(elements, dummy);
//                dummy = new HashSet<>();
//                dummy.add(current);
//            }else if( containsCurrent && !containsNext){
//                continue;
//            }else if( !containsCurrent && containsNext){
//                elements = getLonger(elements, dummy);
//                dummy = new HashSet<>();
//                dummy.add(current);
//            }else{
//                dummy.add(current);
//            }
//
//
//         }
//
//        elements = getLonger(elements, dummy);
//
//        Main.p(elements);
//        return elements.toArray().length;
//    }


//    public static int lengthOfLongestSubstring(String s) {
//        List<Character> elements = new ArrayList<>();
//        List<Character> dummy = new ArrayList<>();


//for(Character c : s.toCharArray()){
//    if(dummy.isEmpty()){
//        dummy.add(c);
//
//    }else {
//        Object[] chars =  dummy.toArray();
//        if ((char)chars[0] == c) {
//            dummy.remove(c);
//            dummy.add(c);
//        }else
//        if(!dummy.contains(c)) {
//            dummy.add(c);
//        }else{
//
//            elements = getLonger(elements, dummy);
//            dummy =  new ArrayList<>();
//            dummy.add(c);
//        }
//
//
//
//    }
//
//}
//
//        elements = getLonger(elements, dummy);
//
//        Main.p(elements);
//        return elements.toArray().length;
//    }

//
//    public static int lengthOfLongestSubstring(String s) {
//String result = "";
//String re = "";
//for(int r = 0; r< s.length() ; r++){
//    String c =  s.charAt(r)+"";
//
//    if(result.contains(c)){
//
//        int p = result.indexOf(c);
//        String t =  result.substring( p);
//re = t.length() > re.length() ? t : re;
//if(re.startsWith(c)){
//    result =  re.substring(1) + c;
//
//}else{
//result= c;}
//      //  Main.p("");
//
//    }else {
//
//        result += c;
//    }
//
//
//}


//
//String l =  result.length() > re.length()? result : re;
//
//        Main.p(l);
//        return l.length();
//
//    }
//
//    public static int lengthOfLongestSubstring(String s) {
//        String temp = s;
//        int index = 0;
//        while (!temp.equals("")){
//            String c = temp.charAt(index)+"";
//            String t = temp.substring(index+1);
//
//            if(t.contains(c)){
//                int x = t.indexOf(c);
//                int
//
//            }else{
//                index++;
//            }
//
//
//
//
//
//
//        }
//
//
//
//
//
//    }
//


    public static void lengthOfLongestSubstring(String s) {
        List<String> elements = new ArrayList<>();
        String temp = "";
        String t = "";

        for(int i = 0; i< s.length(); i++){
            String c = s.charAt(i)+ "";
            temp = s.substring(i+1);
            if(temp.contains(c)){





                elements.add(t+c);





                t="";
            }else{
                t+=c;
            }

         }



        elements.add(t);

        String longer = elements.get(0);

        for(int i =1; i< elements.size(); i++){
            

        }






//
//        List<String> elements2 = new ArrayList<>();
//        String [] elementsArray =  new String[elements.toArray().length];
//        elements.toArray(elementsArray);
//
//        for(int i = 0 ; i < elementsArray.length; i++){
//
//
//
//        }
//













//         String mayor = "";
//        for(String m : elements){
//            mayor = m.length() > mayor.length() ? m : mayor;
//        }
//
//elements.add(mayor);
        Main.p("");


    }





    public static String contains(String a , String b){
        char[] ca= a.toCharArray();
        boolean append = true;
        for(char c: ca){
            if(b.contains(c+"")){
                append = false;
            }
        }
        if(append ){
            return a+b;

        }else{

            return b;
        }



    }

    public static List<Character> getLonger(List<Character> elements, List<Character> dummy) {

        int elementsLength = elements.toArray().length;
        int dummyLength = dummy.toArray().length;
        if (dummyLength > elementsLength) {
            elements = dummy;
        }
        return elements;


    }









    public static void main(String[] args) {

        String[] values = {
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                "dvdf",
               "anviaj",
                "cdd",
                "ckilbkd"};

        for (String s : values) {

           // Main.p();
            lengthOfLongestSubstring(s);

        }
    }


}
