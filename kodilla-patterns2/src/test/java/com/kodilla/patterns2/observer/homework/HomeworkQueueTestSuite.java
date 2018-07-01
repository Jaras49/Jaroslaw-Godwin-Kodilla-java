package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkQueueTestSuite {

    @Test
    public void testHomeworkQueue() {

        //Given
        HomeworkQueue jarekQueue = new HomeworkQueue("Jarek");
        HomeworkQueue andrzejQueue = new HomeworkQueue("Andrzej");
        HomeworkQueue mirekQueue = new HomeworkQueue("Mirek");
        HomeworkQueue mietekQueue = new HomeworkQueue("Mietek");

        Mentor testMentor = new Mentor("Test");
        Mentor mentor = new Mentor("Mentor");

        jarekQueue.registerObserver(testMentor);
        andrzejQueue.registerObserver(testMentor);
        mietekQueue.registerObserver(testMentor);
        mirekQueue.registerObserver(mentor);

        //When
        jarekQueue.addHomeworkToCheck(new Homework("Observer Pattern", "testBody"));
        andrzejQueue.addHomeworkToCheck(new Homework("Streams", "testBody"));
        mirekQueue.addHomeworkToCheck(new Homework("Sudoku", "testBody"));
        mietekQueue.addHomeworkToCheck(new Homework("Postman", "testBody"));

        //Then
        assertEquals(3, testMentor.getUpdateCount());
        assertEquals(1, mentor.getUpdateCount());
    }
}