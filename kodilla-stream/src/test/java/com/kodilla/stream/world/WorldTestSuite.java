package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    World world;

    @Before
    public void setUp() throws Exception {

        world = new World();
    }

    @Test
    public void testGetPeopleQuantity() {

        //Given
        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("358000000");
        //when
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(expectedWorldPeopleQuantity, worldPeopleQuantity);

    }
}
