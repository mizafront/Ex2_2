package home1

fun main() {
    val firstComments = Comments(
            canPost = true
    )

    val firstReposts = Reposts()


    val firstPost = Post(
            comments = firstComments,
            reposts = firstReposts,

    )

    println(firstPost)
    WallService.add(firstPost)
    println(firstPost)
    println(WallService.update(firstPost))
    println(firstPost)

    val second = Comments(
            canPost = true
    )

    val secondRe = Reposts()


    val secondPo = Post(
            comments = second,
            reposts = secondRe,

            )
    println("________________________________________")
    println(firstPost)
    WallService.add(firstPost)
    println(firstPost)
    println(WallService.update(firstPost))
    println(firstPost)

}


