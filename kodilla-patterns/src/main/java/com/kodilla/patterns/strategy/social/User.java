package com.kodilla.patterns.strategy.social;

public abstract class User {
    private final String username;
    protected SocialPublisher socialPublisher;

    public User(final String username) {
        this.username = username;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public String getUsername() {
        return username;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
