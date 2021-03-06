package com.kodilla.patterns.factory.tasks;

public interface Task {

    public void executeTask();

    String getTaskName();

    boolean isTaskExecuted();
}
