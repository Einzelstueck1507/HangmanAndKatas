import org.example.inviteMoreWomen
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test


class InviteMoreWomenTest {
    @Test
    fun basicTests() {
        assertEquals(true, inviteMoreWomen(listOf(1, -1, 1)))
        assertEquals(false, inviteMoreWomen(listOf(-1, -1, -1)))
        assertEquals(false, inviteMoreWomen(listOf(1, -1)))
        assertEquals(true, inviteMoreWomen(listOf(1, 1, 1)))
    }
}