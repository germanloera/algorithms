package euler




/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.
 */

class EvenFibonacciNumbers {

    var sum = 0;
    var set = setOf<Int>()


    fun Solve(num: Int):Int{

        var i = 1;
        var flag = true;


        while(flag){ //( i in 0..num){

           var value = Fibonacci(i.toDouble())

            if ((value % 2) == 0) {
                println("$i ----  $value")
                set= set.plus(value)
            }

            if(value >= 4000000){
                flag = false
            }else{
                i++
            }

        }

       // Solution(num)


        set.forEach {
            item ->
            println(item)
        }
        return set.sum()

    }

    fun Solution(num: Int):Int{

if (num <= 1){
    return 1
}
        var value =  Solution(num-1) + Solution(num - 2);
        if ((value % 2) == 0) {
          set= set.plus(value)
        }
        return value

    }



    fun Fibonacci(n: Double) : Int{

        var sqrt5 = Math.sqrt(5.toDouble());

 var f = ((Math.pow(1+sqrt5, n) - Math.pow(1-sqrt5, n)) / (Math.pow(2.toDouble(),n)*sqrt5))
        return f.toInt()

    }




// 0 1 2 3 4 5  6  7  8  9  10
// 1 2 3 5 8 13 21 34 55 89 144
}

fun main(args: Array<String>){
var x = EvenFibonacciNumbers().Solve(4000000)
println("Sum = $x" );
}