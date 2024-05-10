import org.example.Hangman
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HangmanTest {
    @Test
    fun `becomes word`() {
        //Given
        val hangman = Hangman("Test")
        //When
        hangman.startGame()
        val result = hangman.guess(' ')
        // Then
        assertEquals("_ _ _ _ #  ", result)
    }

    @Test
    fun `guessed one letter`() {
        //Given
        val hangman = Hangman("test")
        //When
        hangman.startGame()
        val result = hangman.guess('e')
        //Then
        assertEquals("_ e _ _", result)
    }
    @Test
    fun `guessed two letters`() {
        //Given
        val hangman = Hangman("test")
        //When
        val result = hangman.guess('t')
        //Then
        assertEquals("t _ _ t", result)
    }

    @Test
    fun `guessed two letters and one letter`() {
        //Given
        val hangman = Hangman("test")
        //When
        hangman.startGame()
        var result = hangman.guess('e')
        result = hangman.guess('t')


        //Then
        assertEquals("t e _ t", result)
    }

    @Test
    fun `guessed false Letter`() {
        //Given
        val hangman = Hangman("test")
        //When
        hangman.startGame()
        val result = hangman.guess('a')
        assertEquals("_ _ _ _ # a",result)
    }

    @Test
    fun `guessed true letter and false letter`() {
        //Given
        val hangman = Hangman("test")
        //When
        hangman.startGame()
        var result = hangman.guess('a')
        result = hangman.guess('t')
        assertEquals("t _ _ t # a",result)
    }
    @Test
    fun `win the game by guessing all letters`() {
        // Given
        val hangman = Hangman("test")
        // When
        hangman.startGame()
        hangman.guess('t')
        hangman.guess('e')
        hangman.guess('s')
        val result = hangman.guess('t')
        // Then
        assertEquals("Du hast gewonnen", result)
    }
}