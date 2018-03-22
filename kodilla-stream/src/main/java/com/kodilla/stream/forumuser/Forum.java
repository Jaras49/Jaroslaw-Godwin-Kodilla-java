package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    static int numberOfForumUsers = 0;

    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum(){
        forumUsers.add(new ForumUser("Jarek", 'M', 1992, 8, 1));
        forumUsers.add(new ForumUser("Kamil", 'M', 1990, 4, 15));
        forumUsers.add(new ForumUser("Iza", 'F', 1993, 12, 22));
        forumUsers.add(new ForumUser("Weronika", 'F', 1988, 1, 6));
        forumUsers.add(new ForumUser("Andrzej", 'M', 1980, 11, 28));
        forumUsers.add(new ForumUser("Putin", 'M', 1995, 7, 11));
    }

    public List<ForumUser> getUsersList(){

        return new ArrayList<>(forumUsers);
    }
}
