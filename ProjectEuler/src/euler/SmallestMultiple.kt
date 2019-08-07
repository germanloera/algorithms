package euler


class SmallestMultiple {

    // var primes = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19)
    var numbers = intArrayOf(4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20)
    var map = hashMapOf(2 to 1, 3 to 1, 5 to 1, 7 to 1, 11 to 1, 13 to 1, 17 to 1, 19 to 1)
    var result = 1.toLong()

    fun solution() {

        for (x in numbers) {
            mcm(x)
        }

        for (y in map.keys) {
            var z = Math.pow(y.toDouble(), map[y]!!.toDouble())
            result *= z.toLong()


        }

        println("The result is $result")


    }


    fun mcm(number: Int): HashMap<Int, Int> {
        var n = number
        var i = 0
        var factors = HashMap<Int, Int>()
        while (n != 1) {
            if ((n % map.keys.elementAt(i)) == 0) {

                if (factors.containsKey(map.keys.elementAt(i))) {
                    factors[map.keys.elementAt(i)] = factors[map.keys.elementAt(i)]!! + 1

                } else {

                    factors[map.keys.elementAt(i)] = 1
                }

           n /= map.keys.elementAt(i)

            } else {
                i++
            }


        }

        for (x in factors.keys) {
            var fmax = factors[x]
            var pmax = map[x]

            if (fmax != null) {
                if (fmax > pmax!!) {
                    map[x] = fmax
                }
            }


        }






        return factors


    }


}

fun main(args: Array<String>) {
    SmallestMultiple().solution()


}