package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    private TaskList toDolist;
    @Autowired
    private TaskList inProgressList;
    @Autowired
    private TaskList doneList;

    @Bean
    public Board getBoard(){
        return new Board(toDolist, inProgressList, doneList);
    }

    @Bean
    @Scope("prototype")
    public TaskList getList(){
        return new TaskList();
    }
}
