package service;

import models.Post;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PostGeneratorService {

    /**
     * This method will randomly generate posts based on the quantity
     * @param quantity
     * @return
     */
    public List<Post> createPost(int quantity){
        List<Post> posts = new ArrayList<>();
        Random random = new Random();
        int randomRange = 1000;
        long timestampRange = 1000000000;
        for(int index = 0;index < quantity;index++){
            Post post = new Post.PostBuilder(index, "Some text")
                    .commentCount(index + random.nextInt(randomRange))
                    .likesCount(index + random.nextInt(randomRange))
                    .shareCount(index + random.nextInt(randomRange))
                    .timestamp(random.nextLong(timestampRange))
                    .isBoost(index % 5 == 0 ? true : false)
                    .build();
            posts.add(post);
        }
        return posts;
    }
}
