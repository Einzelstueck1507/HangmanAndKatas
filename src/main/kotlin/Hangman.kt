package org.example

class Hangman(
    var word: String

) {
    private var loseCounter = 0
    private var gameWon = false
    private var guessedLetters = mutableSetOf<Char>()
    private var wrongLetters = mutableListOf<Char>()

    fun guess(letter: Char): String {
        if(gameWon) return "Du hast bereits gewonnen, Spiel ist vorbei"
        checkLetter(letter)
        checkIfWon()
        if(loseCounter==5){
            return "Du hast verloren das Wort war $word du hast folgende Buchstaben geraten:${buildWrongLetters()}"
        }
        if (gameWon) return "Du hast gewonnen"
        return buildCurrentWord() + buildWrongLetters()
    }

    private fun checkLetter(letter: Char) {
        if (letter in word && letter !in guessedLetters) {
            guessedLetters.add(letter)
        } else if (letter !in wrongLetters) {
            wrongLetters.add(letter)
        }
    }

    private fun checkIfWon() {
        gameWon = word.all { it in guessedLetters }
    }

    private fun buildCurrentWord(): String {
        return word.map {
            if (it in guessedLetters)
                it
            else '_'
        }
            .joinToString(" ")
    }

    private fun buildWrongLetters(): String {
         if (wrongLetters.isEmpty()) {
          return   ""
        } else {
            loseCounter++
           return  " # " + wrongLetters.joinToString(" ")
        }
    }


}