import org.example.catMouse
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ` CatAndMouseEasyVersionTest` {

    @Test
    fun basicTests() {
        assertEquals("Escaped!", catMouse("C....m"))
        assertEquals("Caught!", catMouse("C..m"))
        assertEquals("Escaped!", catMouse("C.....m"))
        assertEquals("Caught!", catMouse("C.m"))
    }
}