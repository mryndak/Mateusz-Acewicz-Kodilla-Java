package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identifier;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postCount;

    public ForumUser(final int identifier, final String username, final char sex, final CharSequence dateOfBirth, final int postCount) {
        this.identifier = identifier;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        this.postCount = postCount;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
