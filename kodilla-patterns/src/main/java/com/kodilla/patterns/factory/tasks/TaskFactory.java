package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public Task makeTask(final String taskType) {

        switch (taskType) {
            case DRIVING_TASK:
                return new DrivingTask("Driving task", "Gdańsk", "Audi TT");
            case PAINTING_TASK:
                return new PaintingTask("Painting task", "red", "wall");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping task", "milk", 2);

                default:
                    return null;
        }
    }
}
