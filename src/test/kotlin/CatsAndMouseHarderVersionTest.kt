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

}