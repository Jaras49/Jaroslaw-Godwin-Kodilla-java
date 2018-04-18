package com.kodilla.patterns.factory.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaskFactoryTestSuite {
    private TaskFactory taskFactory;

    @Before
    public void setUp() throws Exception {
        taskFactory = new TaskFactory();
    }

    @Test
    public void shouldMakeTasks() {
        //Given

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);

        //Then
        assertEquals("Driving task", drivingTask.getTaskName());
        assertEquals("Painting task", paintingTask.getTaskName());
        assertEquals("Shopping task", shoppingTask.getTaskName());
    }

    @Test
    public void shouldExecuteTasks() {
        //Given
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);

        //When
        drivingTask.executeTask();
        paintingTask.executeTask();
        shoppingTask.executeTask();

        //Then
        assertTrue(drivingTask.isTaskExecuted());
        assertTrue(paintingTask.isTaskExecuted());
        assertTrue(shoppingTask.isTaskExecuted());
    }
}
