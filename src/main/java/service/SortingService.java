package service;

import models.Feed;
import models.Post;

import java.util.*;

public class SortingService {

    /**
     * Sort the posts on the basis of ranking and separate out boosted posts and non boosted posts
     * @param posts
     * @return
     */
    public Feed sort(List<Post> posts){
        Queue<Post> boostedPosts = new LinkedList<>();
        for(int index = 0;index < posts.size();index++){
            if(posts.get(index).isBoost()){
                boostedPosts.offer(posts.get(index));
                posts.remove(index);
            }
        }

        Collections.sort(posts, new Comparator<Post>() {
            @Override
            public int compare(Post post1, Post post2) {
                // If both posts are boosted or non-boosted, then compare by ranking
                return Float.compare(post2.getRanking(), post1.getRanking());
            }
        });

        Feed feed = new Feed();
        feed.setBoostedPosts(boostedPosts);
        feed.setPosts(posts);
        return feed;

    }

}
