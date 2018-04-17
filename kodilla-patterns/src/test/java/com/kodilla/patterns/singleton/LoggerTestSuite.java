package com.kodilla.patterns.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {

    private Logger logger;

    @Before
    public void setUp() throws Exception {
        logger = new Logger();
    }

    @Test
    public void shouldGetLastLog() {

        //Given
        logger.log("sup");

        //When
        String lastLog = logger.getLastLog();

        //Then
        assertEquals("sup", lastLog);
    }
}
