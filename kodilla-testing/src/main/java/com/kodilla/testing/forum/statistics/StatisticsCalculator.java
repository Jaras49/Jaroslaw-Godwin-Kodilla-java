package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;



    public void CalculateAdvStatistics(Statistics statistics){

        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();

        if (!statistics.usersNames().isEmpty()) {
            this.avgPostsPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
        }
        else {
            this.avgPostsPerUser = 0;
        }
        if (!statistics.usersNames().isEmpty()) {
            this.avgCommentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        }
        else {
            this.avgCommentsPerUser = 0;
        }
        if (statistics.postsCount() != 0) {
            this.avgCommentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        }
        else {
            this.avgCommentsPerPost = 0;
        }
    }
    public String showStatistics(){
        return "Number of Users: " + usersCount + ", number of posts: " + postsCount + ", number of comments: " + commentsCount
                + ", average posts pew user: " + avgPostsPerUser + ", average comments per user " + avgCommentsPerUser
                + ", average comments per post: " + avgCommentsPerPost;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
