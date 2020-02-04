package challenges

import java.io.File

fun main() {
    var amount: Int = 0
    val ipAddress: String = "0"
    val ipAddressToAmount = mutableMapOf<String, Int>()
    File("src/io/60.ips.txt").forEachLine {
        val previous = ipAddressToAmount.getOrDefault(it, 0)
        ipAddressToAmount.put(it, previous + 1)
        //if (ipAddressToAmount.contains(it)) {
        //    ipAddressToAmount.put(it, ipAddressToAmount.get(it)!! + 1)
        //}
        //ipAddressToAmount.putIfAbsent(it, 1)
    }
//    var a = 0
//    var b = 0
//    ipAddressToAmount.values.toHashSet().forEach {
//        a = it
//        if (it > b) b = a
//    }
//    var lineNumber = 0
//    var position = 0
//    ipAddressToAmount.values.forEach {
//        lineNumber++
//        if (b == it){
//            position = lineNumber
//        }
//    }
//    var lineNumber2 = 0
//    var ipMaxAddress = "0"
//    File("src/io/60.ips.txt").forEachLine {
//       lineNumber2++
//       if (lineNumber2 == position) ipMaxAddress = it
//    }

/*    var ipMaxAddress = ipAddressToAmount.keys.first()
    var maxAmount = 0
    for ((ip, amount) in ipAddressToAmount.entries){
        if (amount > maxAmount) {
            maxAmount = amount
            ipMaxAddress = ip
        }
    }

 */

    val (ipMaxAddress, maxAmount) = ipAddressToAmount.entries.maxBy { it.value }!!

    println("$ipMaxAddress has the most entries with a total of $maxAmount times")

}