package home1

import home1.PostObject.Comments
import home1.PostObject.Reposts
import org.junit.Test

import org.junit.Assert.*

internal class PostServiceTest {
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
        PostService.add(firstPost)
        if (firstPost.id == 1) testParam = false
        assertEquals(true, testParam)
    }

    @Test
    fun updateRealID() {
        PostService.add(firstPost)
        assertEquals(true, PostService.update(firstPost))
    }

    @Test
    fun updateNotRealID() {
        val theFirstComments = Comments (
                canPost = true
        )
        val theFirstReposts = Reposts ()

        val secondPost = Post (
                id = 5,
                comments = theFirstComments,
                reposts = theFirstReposts,
        )
        assertEquals(false, PostService.update(secondPost))
    }
}
