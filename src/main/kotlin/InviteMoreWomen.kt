package org.example

fun inviteMoreWomen(l: List<Int>): Boolean {

    return (l.count { it == 1 } > l.count { it == -1 })
}