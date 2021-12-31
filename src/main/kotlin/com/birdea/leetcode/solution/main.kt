package com.birdea.leetcode.solution

import java.math.BigInteger

fun main(args: Array<String>) {
    println("Hello World!")

    val a = "10000000000000000000"
    val b = "123"

    var aa = BigInteger(a)
    val bb = BigInteger(b)

    var sum1 = aa.add(bb)
    var sum2 = aa + bb

    //println("aa:$aa, bb:$bb = sum1:$sum1, sum2:$sum2")

    //Solution01().test()

    Solution15().test()
}