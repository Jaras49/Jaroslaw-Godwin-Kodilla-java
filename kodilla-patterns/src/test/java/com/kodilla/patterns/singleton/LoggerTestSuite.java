package com.kodilla.patterns.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {

    @Test
    public void shouldGetLastLog() {

        //Given
        Logger.getInstance().log("sup");

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        assertEquals("sup", lastLog);
    }
}
