package home1

fun main() {

    var post = Post(1)
    var post2 = Post(2)
    var post3 = Post(3)
    var post4 = Post(4)
    var post5 = Post(5)

    PostService.add(post)
    PostService.add(post2)
    PostService.add(post3)
    PostService.add(post4)
    PostService.add(post5)


    PostService.likeById(3)
    PostService.likeById(2)
    PostService.likeById(3)
    PostService.likeById(3)
    println(post.likes)
    println(post2.likes)
    println(post3.likes)
    println(post4.likes)
    println(post5.likes)


}


