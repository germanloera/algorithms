package euler



import kotlin.random.Random


data class N(val value: Long, var next: N?, var prev: N?)


class LargestPrimeFactor {

    var criba = setOf<Long>(2, 3, 5, 7)
    var primos = setOf<Long>(2, 3, 5, 7)

    val value: Long = 1000//600851475143
    var count = 2
    val cero: Long = 0;
    var pruebas = 10;

    var root: N? = null
    var start: N? = null


    /*

    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?

    */

    fun Solution() {

        var current = N(2, null, null)
        root = current;
        var iterator = root
        var counter = 0.toLong()



        for (i in 3 until (value / 2) + 1 step 1) {
            iterator = root
            var isPrime = true


           do {

                if ((i % iterator!!.value) != 0.toLong()) {
                    isPrime = false
                    break
                }

               if(iterator!!.next == null){
                   break
               }
                iterator = iterator!!.next;
            } while (iterator!!.value != root!!.value)

            if (isPrime) {
                current.next = N(i, root, current)
                current = current.next!!
                root!!.prev = current
              //  if ((counter % 10000.toLong()) == 0.toLong()) {
                    println("isPrime $i -- counter = $counter  --- until = ${(value / 2) + 1}")
              //  }
                counter++
            }

        }

        println(" /********************* Buscando Factor Primo mayor *************************/")


        iterator = root!!.prev
        var largestFactor = null;

        while (iterator!!.value != root!!.value) {

            if ((value % iterator.value) == 0.toLong()) {

                println("is Factor = ${iterator.value}")

                break
            }
            iterator = iterator.prev


        }


/*
        for (count in 2 until  value / 2 step 1) {

            var zero = (value % count)
            if (zero == cero) {
                var cociente = value / count;
                println("- count = $count -- Cociente = $cociente")



                /*for (i: Int in 0..pruebas) {
                    var a = Random.nextLong(cociente - 2);
                    var x = (cociente - 1) / 2;

                    var u = Math.pow(a.toDouble(), x.toDouble())
                    u %= cociente;
                    var v = a / cociente;

                    println("**** a=$a u=$u v=$v  ---- ${u.toLong() == v}")

                }*/


            }*/


    }

}


/*  fun Solution(){
      CribaDeEratostenes(600851475143 )

      criba.forEach { i -> println("$i") }

  }*/

/*

  fun CribaDeEratostenes(n: Long){

      val c:Long =0


      for (i in 8..n ){

          if((i%100000) == c){
              println("$i -- ${criba.size}")

          }

      if( ((i%2) == c)|| ((i%3) == c)|| ((i%5) == c)|| ((i%7) == c) ){
          continue
      }else{

  criba = criba.plus(i)

      }




      }

      println("Buscando Primos -- ${criba.size}")

      for(i in 4 until criba.size ){
          var current = criba.elementAt(i)
var flag = true;
          if(Math.pow(current.toDouble(), 2.toDouble()) < n.toDouble()) {


              for (j in i+1 until criba.size) {
                  if (criba.size > j) {
                      var test = criba.elementAt(j)

                      if ((test % current) == c) {

                          criba = criba.minus(test)
                          println("Quitando ${test} % $current - - ${criba.size}")
                      }


                  }
              }
          }else{
              break
          }


      }



  }








}
*/

fun main(args: Array<String>) {

    LargestPrimeFactor().Solution()

}