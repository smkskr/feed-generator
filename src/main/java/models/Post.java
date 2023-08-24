package models;

import java.time.LocalDate;


public class Post{
    private int id;
    private String content;
    private int likesCount;
    private int commentCount;
    private int shareCount;
    private float ranking;

    private long timestamp;
    private boolean isBoost;

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public float getRanking() {
        return ranking;
    }

    public boolean isBoost() {
        return isBoost;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public void setRanking(float ranking) {
        this.ranking = ranking;
    }

    public void setBoost(boolean boost) {
        isBoost = boost;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    private Post(PostBuilder postBuilder) {
        this.id = postBuilder.id;
        this.content = postBuilder.content;
        this.likesCount = postBuilder.likesCount;
        this.commentCount = postBuilder.commentCount;
        this.shareCount = postBuilder.shareCount;
        this.ranking = postBuilder.ranking;
        this.isBoost = postBuilder.isBoost;
        this.timestamp = postBuilder.timestamp;
    }



    // Getter methods for parameters

    public static class PostBuilder {
        private int id;
        private String content;
        private int likesCount;
        private int commentCount;
        private int shareCount;
        private float ranking;
        private boolean isBoost;

        private long timestamp;


        public PostBuilder(int id, String content) {
            this.id = id;
            this.content = content;
        }


        public PostBuilder likesCount(int likesCount) {
            this.likesCount = likesCount;
            return this;
        }

        public PostBuilder commentCount(int commentCount) {
            this.commentCount = commentCount;
            return this;
        }

        public PostBuilder content(String content){
            this.content = content;
            return this;
        }
        public PostBuilder shareCount(int shareCount) {
            this.shareCount = shareCount;
            return this;
        }

        public PostBuilder ranking(float ranking) {
            this.ranking = ranking;
            return this;
        }

        public PostBuilder isBoost(boolean isBoost) {
            this.isBoost = isBoost;
            return this;
        }

        public PostBuilder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }
}
