package models;

import java.util.List;
import java.util.Queue;

public class Feed {

    private Queue<Post> boostedPosts;
    private List<Post> posts;

    private int userId;
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Queue<Post> getBoostedPosts() {
        return boostedPosts;
    }

    public void setBoostedPosts(Queue<Post> boostedPosts) {
        this.boostedPosts = boostedPosts;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
