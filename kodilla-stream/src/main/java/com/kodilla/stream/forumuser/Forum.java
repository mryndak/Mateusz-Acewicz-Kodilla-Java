package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,  "ala00", 'F', "1990-01-15", 01));
        userList.add(new ForumUser(2,  "robert93", 'M',"1995-05-03" , 1));
        userList.add(new ForumUser(3,  "brian2", 'M',"1999-09-20" , 3));
        userList.add(new ForumUser(4,  "jessica16", 'F', "1999-07-11", 5));
        userList.add(new ForumUser(5,  "tomtom", 'M', "1991-02-25", 10));
        userList.add(new ForumUser(6,  "ola.m", 'F', "1989-11-13", 4));
        userList.add(new ForumUser(7,  "gabi", 'F', "2002-02-14", 5));
        userList.add(new ForumUser(8,  "markp", 'M', "1998-03-18", 0));
        userList.add(new ForumUser(9,  "ala01", 'F', "2000-08-01", 3));
        userList.add(new ForumUser(10,  "lucasss", 'M', "1984-11-27", 16));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
