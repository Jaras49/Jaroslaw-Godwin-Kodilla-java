package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Random;

public final class ForumUser {

    private final String username;
    private final int id;
    private final char sex;
    private final LocalDate birthDate;
    private int postsNumber;

    public ForumUser(String username, char sex, int year, int month, int day){
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(year, month, day);
        Forum.numberOfForumUsers++;
        this.id = Forum.numberOfForumUsers;

        Random rand = new Random();
        this.postsNumber = rand.nextInt(9);
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
