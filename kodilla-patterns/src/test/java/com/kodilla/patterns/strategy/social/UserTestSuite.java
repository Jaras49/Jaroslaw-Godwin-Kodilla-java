package com.kodilla.patterns.strategy.social;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {
    private User user1;
    private User user2;
    private User user3;

    @Before
    public void setUp() throws Exception {
        user1 = new Millenials("Andrzej");
        user2 = new YGeneration("Marcin");
        user3 = new ZGeneration("Tadek");
    }

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        //When
        String post1 = user1.sharePost();
        String post2 = user2.sharePost();
        String post3 = user3.sharePost();

        //Then
        assertEquals("new Tweet", post1);
        assertEquals("new Post", post2);
        assertEquals("new Snap", post3);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        user1.setSocialPublisher(new FacebookPublisher());
        user2.setSocialPublisher(new FacebookPublisher());
        user3.setSocialPublisher(new FacebookPublisher());

        //When
        String post1 = user1.sharePost();
        String post2 = user2.sharePost();
        String post3 = user3.sharePost();

        //When
        assertEquals("new Post", post1);
        assertEquals("new Post", post2);
        assertEquals("new Post", post3);
    }
}
