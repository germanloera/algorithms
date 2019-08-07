package euler;


import com.leetcode.Main;

import java.util.HashSet;
import java.util.Set;

public class Multiples3And5 {

/*

Multiples of 3 and 5
Problem 1
If we list all the natural numbers below 10
that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

 */

public static int solution(int n){

    int s=0;

    for(int i=1; i < n; i++){
       int mod3 = i % 3;
        int mod5 = i % 5;
        if(mod3 == 0 || mod5 == 0){
            s+= i;
        }



    }

    return s;


}


public static int solution2(int n){
    int sum =0;
    Set s = new HashSet();

    int it = 0;
    int n1 = 3;
    int n2 = 5;

    for(n1 = 3; n1 < n; n1+=3){
        s.add(n1);
        sum += n1;
        it++;
    }
    Main.p("Iteraciones 3: "+ it);

    for(n2 = 5; n2 < n; n2+=5){
       boolean fueAgregado=  s.add(n2);
        if(fueAgregado == true) {
            sum += n2;
            it++;
        }

    }
Main.p("Iteraciones Total: "+ it);
    return sum;


}




    public static void main(String[] args){
int sol = Multiples3And5.solution2(1000);
        Main.p(sol);
    }

}
