package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
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
}
