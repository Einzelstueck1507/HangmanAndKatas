package org.example


    fun catMouse(s: String): String {
        if(s.isEmpty()) return "Escaped!"
        if(s.toCharArray().map { it }.count(){it =='.'}<=3) {
            return "Caught!"
        }
        else return "Escaped!"
    }
