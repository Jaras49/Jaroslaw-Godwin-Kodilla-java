package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite
{
    @Before
    public void before()
    {
        System.out.println("Test Case: begin");
    }
    @After
    public void after()
    {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(new ArrayList<Integer>());
        ArrayList<Integer> temp = new ArrayList<>();
        //Then
        System.out.println("Testing empty list " );
        Assert.assertArrayEquals(temp.toArray(), result.toArray());
    }
    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> in = new ArrayList<>();
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        in.add(5);
        in.add(6);
        in.add(7);
        in.add(8);
        in.add(9);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);

        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(in);

        //Then
        System.out.println("Testing normal list");
        Assert.assertArrayEquals(expectedResult.toArray(), result.toArray());
    }
}
