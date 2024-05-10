package org.example

class Hangman(
    var word: String

) {
    private var gameWon = false
    private var guessedLetters = mutableSetOf<Char>()
    private var wrongLetters = mutableListOf<Char>()

    fun guess(letter: Char): String {
        if (gameWon) return "Du hast gewonnen"
        checkLetter(letter)
        return buildCurrentWord() + buildWrongLetters()
    }

    private fun checkLetter(letter: Char) {
        if (letter in word) {
            guessedLetters.add(letter)
            checkIfWon()
        } else if (letter !in wrongLetters) {
            wrongLetters.add(letter)
        }
    }

    private fun checkIfWon() {
        gameWon = word.all { it in guessedLetters }
    }

    private fun buildCurrentWord(): String {
        return word.map {
            if
                    (it in guessedLetters)
                it
            else '_'
        }
            .joinToString(" ")
    }

    private fun buildWrongLetters(): String {
        return if (wrongLetters.isEmpty()) ""
        else " # " + wrongLetters.joinToString(" ")
    }

    fun startGame(): String {
        return word.map { '_' }.joinToString(" ")
    }
}