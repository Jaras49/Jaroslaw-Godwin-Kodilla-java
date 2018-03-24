package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {


    @Test

    public void testGetAverage(){

        //Given
        int [] numbers = {1,2,3,4,5,6};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(3.5, result, 0);
    }
}