package org.example

fun catMouse(str:String,number:Int):String{
    val cat = str.indexOf('C')
    val mouse = str.indexOf('m')
    val dog = str.indexOf('D')

    if (cat-mouse<number){
        return "Caught!"
    }
    return ""
}