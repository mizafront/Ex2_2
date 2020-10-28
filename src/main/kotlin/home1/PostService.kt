package home1

object PostService {
    private var id = 0L
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()

    }

    fun likeById(id: Long){
        for ((index,post) in posts.withIndex()){
            if (post.id == id){
                post.likes ++
                posts[index] = post.copy(likes = post.likes)
            }
        }

    }

    fun clear() {
        posts = emptyArray()
    }

    fun update(id: Long): Boolean{
        for ((index,post) in posts.withIndex()){
            if (post.id == id){

                posts[index] = post.copy(likes = post.likes )
            }
        }
        return true
    }

    fun sizeArray(){
        println(posts.size)
    }

}