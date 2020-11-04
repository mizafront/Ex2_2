package home1

import org.junit.Test

import org.junit.Assert.*

internal class WallServiceTest {
    val firstComments = Comments (
            canPost = true
    )
    val firstReposts = Reposts ()

    val firstPost = Post (
            id = 1,
            comments = firstComments,
            reposts = firstReposts,
    )

    @Test
    fun add() {
        var testParam: Boolean = true
        WallService.add(firstPost)
        if (firstPost.id == 0) testParam = false
        assertEquals(true, testParam)
    }

    @Test
    fun updateTrue() {
        WallService.add(firstPost)
        assertEquals(true, WallService.update(firstPost))
    }

    @Test
    fun updateFalse() {
        val firstComments = Comments (
                canPost = true
        )
        val firstReposts = Reposts ()

        val secondPost = Post(
                id = 1,
                comments = firstComments,
                reposts = firstReposts
        )
        assertEquals(false, WallService.update(secondPost))
    }
}
