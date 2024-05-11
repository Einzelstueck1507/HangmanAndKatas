import org.example.catMouse
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CatsAndMouseHarderVersionTest {

    @Test
    fun `cat caught mouse`(){
        //Given
        var str = "'..D.....Cm"
        val number = 13
        //Then
        assertEquals("Caught!",catMouse(str,number))
    }
    @Test
    fun `not all three in String`(){
        //Given
        var str = "m.C..."
        val number = 8
        //Then
        assertEquals("boring without all three",catMouse(str,number))
    }
    @Test
    fun `Dog protects mouse`(){
        var str = "...C....D....m......."
        val number = 13
        assertEquals("Protected!",catMouse(str,number))
    }

    @Test
    fun`Mouse escaped`(){
        var str = ".....C............m......D"
        val number = 5
        assertEquals("Escaped!",catMouse(str,number))
    }


}