package home1

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        post.id ++

        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (updatePost in posts) {
            if (updatePost.id == post.id) {
                updatePost.text = "New text.txt"
                println("Пост обновлён")
                return true
            }
            break
        }
        return false
    }
}

