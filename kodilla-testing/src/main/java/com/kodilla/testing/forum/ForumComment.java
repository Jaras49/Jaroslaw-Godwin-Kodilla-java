package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumComment
{
    ForumPost forumPost;
    String commentbody;
    String author;

    public ForumComment(ForumPost forumPost, String author, String commentbody) {
        this.forumPost = forumPost;
        this.commentbody = commentbody;
        this.author = author;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentbody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumComment that = (ForumComment) o;
        return Objects.equals(forumPost, that.forumPost) &&
                Objects.equals(commentbody, that.commentbody) &&
                Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(forumPost, commentbody, author);
    }
}
