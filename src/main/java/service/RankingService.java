package service;

import enums.RankingWeights;
import models.Post;

import java.util.List;

public class RankingService {

    /**
     * Assign Rank to posts based on predefined weights
     * @param posts
     */
    public void assignRank(List<Post> posts){

        for(Post post : posts){
            float rank = post.getLikesCount() * RankingWeights.LIKES.getValue()
                        + post.getCommentCount() * RankingWeights.COMMENT.getValue()
                        + post.getShareCount() * RankingWeights.SHARE.getValue();
            post.setRanking(rank);
        }
    }
}
