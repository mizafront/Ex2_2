package home1

import home1.PostObject.Comments
import home1.PostObject.Reposts

fun main() {
    val theFirstComments = Comments(
            canPost = true
    )

    val theFirstReposts = Reposts()


    val theFirstPost = Post(
            id = 1,
            comments = theFirstComments,
            reposts = theFirstReposts,

    )

    println(theFirstPost)
    PostService.add(theFirstPost)
    println(PostService.update(theFirstPost))
    println(theFirstPost)
}


