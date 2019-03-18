package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int userCount = 0;
    private int postCount = 0;
    private int commentCount = 0;
    private double postsByUsers = 0;
    private double commentsByUsers = 0;
    private double commentsByPosts = 0;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        if(userCount > 0) {
            postsByUsers = postCount / userCount;
            commentsByUsers = commentCount / userCount;
        }
        if(postCount > 0) {
            commentsByPosts = commentCount/postCount;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + userCount);
        System.out.println("Total number of posts: " + postCount);
        System.out.println("Total number of comments: " + commentCount);
        System.out.println("Average number of posts by users: " + postsByUsers);
        System.out.println("Average number of comments by users: " + commentsByUsers);
        System.out.println("Average number of comments in posts: " + commentsByPosts);
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getPostsByUsers() {
        return postsByUsers;
    }

    public double getCommentsByUsers() {
        return commentsByUsers;
    }

    public double getCommentsByPosts() {
        return commentsByPosts;
    }
}
