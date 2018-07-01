package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements HomeworkObservable {

    private final String studentName;
    private final List<Homework> homeworks;
    private final List<HomeworkObserver> observers;

    public HomeworkQueue(String studentName) {
        this.studentName = studentName;
        homeworks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addHomeworkToCheck(Homework homework) {
        homeworks.add(homework);
        notifyObservers();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Homework> getHomeworks() {
        return homeworks;
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }
}
