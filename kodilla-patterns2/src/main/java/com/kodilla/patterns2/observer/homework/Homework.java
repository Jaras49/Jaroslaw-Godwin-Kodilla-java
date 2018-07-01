package com.kodilla.patterns2.observer.homework;

public class Homework {

    private final String name;
    private final String body;

    public Homework(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }
}
