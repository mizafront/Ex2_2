package home1

import home1.PostObject.Comments
import home1.PostObject.Reposts

fun main() {
    val firstComments = Comments(
            canPost = true
    )

    val firstReposts = Reposts()


    val firstPost = Post(
            id = 1,
            comments = firstComments,
            reposts = firstReposts,

    )

    println(firstPost)
    PostService.add(firstPost)
    println(firstPost)
    println(PostService.update(firstPost))
    println(firstPost)


}


