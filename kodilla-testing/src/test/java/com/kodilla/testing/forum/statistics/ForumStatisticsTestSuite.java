package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testForNoPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        when(statsMock.postsCount()).thenReturn(0);
        when(statsMock.commentsCount()).thenReturn(1000);
        when(statsMock.usersNames()).thenReturn(Arrays.asList("Adam", "Kamil"));
        ForumStatistics forumStats = new ForumStatistics();
        //When
        forumStats.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(0, forumStats.getPostsByUsers(), 0.01);
        Assert.assertEquals(500, forumStats.getCommentsByUsers(), 0.01);
        Assert.assertEquals(0, forumStats.getCommentsByPosts(), 0.01);
    }

    @Test
    public void testForThousandPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics forumStats = new ForumStatistics();
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(1000);
        when(statsMock.usersNames()).thenReturn(Arrays.asList("Tomek", "Kamil", "Robert", "Adam"));
        //When
        forumStats.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(250, forumStats.getPostsByUsers(), 0.01);
        Assert.assertEquals(250, forumStats.getCommentsByUsers(), 0.01);
        Assert.assertEquals(1, forumStats.getCommentsByPosts(), 0.01);
    }

    @Test
    public void testForNoComments() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics forumStats = new ForumStatistics();
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(0);
        when(statsMock.usersNames()).thenReturn(Arrays.asList("Tomek", "Kamil", "Robert", "Adam"));
        //When
        forumStats.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(250, forumStats.getPostsByUsers(), 0.01);
        Assert.assertEquals(0, forumStats.getCommentsByUsers(), 0.01);
        Assert.assertEquals(0, forumStats.getCommentsByPosts(), 0.01);
    }

    @Test
    public void testForLessCommentsThanPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics forumStats = new ForumStatistics();
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(800);
        when(statsMock.usersNames()).thenReturn(Arrays.asList("Tomek", "Kamil", "Robert", "Adam"));
        //When
        forumStats.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(250, forumStats.getPostsByUsers(), 0.01);
        Assert.assertEquals(200, forumStats.getCommentsByUsers(), 0.01);
        Assert.assertEquals(0.8, forumStats.getCommentsByPosts(), 0.01);
    }

    @Test
    public void testForMoreCommentsThanPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics forumStats = new ForumStatistics();
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(1200);
        when(statsMock.usersNames()).thenReturn(Arrays.asList("Tomek", "Kamil", "Robert", "Adam"));
        //When
        forumStats.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(250, forumStats.getPostsByUsers(), 0.01);
        Assert.assertEquals(300, forumStats.getCommentsByUsers(), 0.01);
        Assert.assertEquals(1.2, forumStats.getCommentsByPosts(), 0.01);
    }

    @Test
    public void testForNoUsers() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics forumStats = new ForumStatistics();
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(1000);
        when(statsMock.usersNames()).thenReturn(Arrays.asList());
        //When
        forumStats.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(0, forumStats.getPostsByUsers(), 0.01);
        Assert.assertEquals(0, forumStats.getCommentsByUsers(), 0.01);
        Assert.assertEquals(1, forumStats.getCommentsByPosts(), 0.01);
    }

    @Test
    public void testForHundredUsers() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        ForumStatistics forumStats = new ForumStatistics();
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(1000);
        ArrayList<String> userNamesList = new ArrayList<String>();
        for(int i = 0; i < 100; i++) {
            userNamesList.add("abc");
        }
        when(statsMock.usersNames()).thenReturn(userNamesList);
        //When
        forumStats.calculateAdvStatistics(statsMock);
        //Then
        Assert.assertEquals(10, forumStats.getPostsByUsers(), 0.01);
        Assert.assertEquals(10, forumStats.getCommentsByUsers(), 0.01);
        Assert.assertEquals(1, forumStats.getCommentsByPosts(), 0.01);
    }
}
