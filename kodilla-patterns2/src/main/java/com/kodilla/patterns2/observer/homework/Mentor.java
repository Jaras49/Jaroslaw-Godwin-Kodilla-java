package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
        updateCount = 0;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println("Student " + homeworkQueue.getStudentName() + " has finished his homework and it is" +
                " ready to be checked" );
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
