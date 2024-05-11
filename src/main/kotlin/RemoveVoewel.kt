package org.example

fun disemvowel(str: String): String {
    val voewelList = listOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return str.map {
        if (voewelList.contains(it)) {
            ""
        } else {
            it
        }
    }.joinToString("")

}