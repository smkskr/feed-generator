package org.example;

import models.Feed;
import models.Post;
import service.MergingService;
import service.PostGeneratorService;
import service.RankingService;
import service.SortingService;

import java.util.List;

public class FeedGenerator {
    public static void main(String[] args) {
        PostGeneratorService postGeneratorService = new PostGeneratorService();
        RankingService rankingService = new RankingService();
        SortingService sortingService = new SortingService();
        MergingService mergingService = new MergingService();

        List<Post> posts = postGeneratorService.createPost(10);
        rankingService.assignRank(posts);
        Feed feed = sortingService.sort(posts);
        mergingService.mergePosts(feed);

    }
}