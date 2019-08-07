package euler


class SumSquareDifference {
/*
    The sum of the squares of the first ten natural numbers is,

    12 + 22 + ... + 102 = 385
    The square of the sum of the first ten natural numbers is,

    (1 + 2 + ... + 10)2 = 552 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/


    fun solution(){
        var sumOfSquare = 0.toDouble()
        var sumNaturalNumbers = 0.toDouble()



        for(i in 1 until 101){

            var sq = Math.pow(i.toDouble(), 2.toDouble())
            sumNaturalNumbers += i
            sumOfSquare += sq

        }

        sumNaturalNumbers = Math.pow(sumNaturalNumbers, 2.toDouble())
        var result = sumNaturalNumbers - sumOfSquare

println("Result ${result.format(15)}")





    }

    fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)

}

fun main(args:Array<String>) {
SumSquareDifference().solution()
}