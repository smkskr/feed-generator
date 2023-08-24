package service;

import models.Feed;
import models.Post;

import java.util.List;
import java.util.Queue;

public class MergingService {

    /**
     * Merge posts on basis of boosted and non-boosted posts
     * The boosted posts are added on an interval of 5
     * @param feed
     */
    public void mergePosts(Feed feed){

        Queue<Post> boostedPosts = feed.getBoostedPosts();
        List<Post> posts = feed.getPosts();
        int index = 0;
        for(Post post : posts){
            if(index % 5 == 0 && !boostedPosts.isEmpty()){
                index++;
                Post boostedPost = boostedPosts.poll();
                System.out.println("--------------------------------");
                System.out.println("ID            : " +  boostedPost.getId());
                System.out.println("Content       : " +  boostedPost.getContent());
                System.out.println("Comment Count : " +  boostedPost.getCommentCount());
                System.out.println("Like Count    : " +  boostedPost.getLikesCount());
                System.out.println("Share Count   : " +  boostedPost.getShareCount());
                System.out.println("Ranking       : " +  boostedPost.getRanking());
                System.out.println("Boost         : " +  boostedPost.isBoost());
                System.out.println("Timestamp     : " +  boostedPost.getTimestamp());
                System.out.println("--------------------------------");
            }
                index++;
                System.out.println("--------------------------------");
                System.out.println("ID            : " +  post.getId());
                System.out.println("Content       : " +  post.getContent());
                System.out.println("Comment Count : " +  post.getCommentCount());
                System.out.println("Like Count    : " +  post.getLikesCount());
                System.out.println("Share Count   : " +  post.getShareCount());
                System.out.println("Ranking       : " +  post.getRanking());
                System.out.println("Boost         : " +  post.isBoost());
                System.out.println("Timestamp     : " +  post.getTimestamp());
                System.out.println("--------------------------------");
            }


    }
}
