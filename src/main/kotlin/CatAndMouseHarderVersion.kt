package org.example

fun catMouse(str:String,number:Int):String{
    val cat = str.indexOf('C')
    val mouse = str.indexOf('m')
    val dog = str.indexOf('D')

    if(cat < 0 || mouse < 0 || dog < 0){
        return "boring without all three"
    }

    if(dog>cat&&dog<mouse){
        return "Protected!"
    }

    if (Math.abs(cat-mouse)<=number){
        return "Caught!"
    }

    return "Escaped!"
}