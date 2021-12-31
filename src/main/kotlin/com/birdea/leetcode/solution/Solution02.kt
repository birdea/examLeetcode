package com.birdea.leetcode.solution

import java.lang.NumberFormatException
import java.math.BigDecimal
import java.math.BigInteger

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution02 {

    fun test () {
        var l1 = makeNode("243")
        var l4 = makeNode("564")
        addTwoNumbers(l1, l4)

        l1 = makeNode("249")
        l4 = makeNode("5649")
        addTwoNumbers(l1, l4)

        l1 = makeNode("9")
        l4 = makeNode("1999999999")
        addTwoNumbers(l1, l4)

        l1 = makeNode("1000000000000000000000000000001")
        l4 = makeNode("564")
        addTwoNumbers(l1, l4)
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1sum = makeInt(l1)
        var l2sum = makeInt(l2)
        var sum = l1sum + l2sum
        println("l1sum: $l1sum, l2sum:$l2sum")

        var output = makeNode(sum.toString().reversed())
        println("output: $output")
        return output
    }

    fun makeNode(value: String): ListNode? {
        if (value.isNullOrEmpty()) {
            return null
        }
        var valFirst = value.first()
        var valModd = value.subSequence(1, value.length)
        var out = ListNode (Integer.parseInt(value.first().toString()))
        out.next = makeNode(value.substring(1))
        println("makeNode: $value -> valFirst:$valFirst, valModd:$valModd, out:$out")
        return out
    }

    fun makeInt(node: ListNode?): BigInteger {
        if (node == null) {
            return BigInteger("0")
        }
        if (node?.next == null) {
            return BigInteger.valueOf(node?.`'val'`.toLong())
        }
        val curVal = node?.`'val'`
        //println("makeInt: $curVal, ${node?.next}")
        try {
            return BigInteger(makeInt(node?.next).toString() + curVal.toString())
        }catch (e: NumberFormatException) {
            e.printStackTrace()
            return BigInteger("0")
        }
    }
}

class ListNode(var `'val'`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "$`'val'`, $next"
    }
}
