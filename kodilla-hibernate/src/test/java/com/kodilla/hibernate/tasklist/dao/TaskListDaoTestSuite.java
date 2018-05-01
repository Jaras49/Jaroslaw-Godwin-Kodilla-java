package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("toDoTestTask", "toDoTasks");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(name);

        //Then
        assertEquals(1, readTasks.size());

        //CleanUp
        taskListDao.delete(readTasks.get(0).getId());
    }
}