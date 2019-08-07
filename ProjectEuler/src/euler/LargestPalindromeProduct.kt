package euler


class LargestPalindromeProduct {


    var max = 0
    /*

    A palindromic number reads the same both ways.
    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.

     */


    fun isPalindrome( x:Int, y:Int): Boolean {
        var palindrome = false;
        var result = 0
        var number = x * y
        var n = number
        while (n != 0) {
            var x = (n % 10)
            var r = (n / 10)
            n = r
            result = result * 10 + x

        }

        palindrome = result == number

        if(palindrome) {
            if(number > max){
                max = number
                println("x=$x - y=$y - number=$number - isPalindrome=$palindrome - max=$max")
            }


        }
        return palindrome

    }


    fun solution() {
        for (i in 999 downTo  100) {
            for (j in 999 downTo 100) {
                isPalindrome(i,j)
            }
        }
    }




}


fun main(args: Array<String>) {
    LargestPalindromeProduct().solution()
}