package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        context.getBean(Board.class).addToDo("toDo");
        context.getBean(Board.class).addInProgress("inProgress");
        context.getBean(Board.class).addDone("done");

        //When
        List<String> tasksToDo = context.getBean(Board.class).getToDoList().getTasks();
        List<String> tasksInProgress = context.getBean(Board.class).getInProgressList().getTasks();
        List<String> tasksDone = context.getBean(Board.class).getDoneList().getTasks();

        //Then
        assertEquals(Arrays.asList("toDo"), tasksToDo);
        assertEquals(Arrays.asList("inProgress"), tasksInProgress);
        assertEquals(Arrays.asList("done"), tasksDone);
    }
}
