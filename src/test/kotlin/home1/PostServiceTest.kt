package home1

import home1.PostObject.Comments
import org.junit.Test

class PostServiceTest {

    @Test
    fun add() {

        PostService.add(Post(Comments()))

    }

    @Test
    fun likeById() {

        PostService.add(Post(Comments()))
        PostService.likeById(1)
        println()
    }



}