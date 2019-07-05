package com.kodilla.patterns.observer.homework;

public interface Observable {

    void becomeObserver(Mentor mentor);

    void addDoneTask(Task task);

    void notifyObserver(Task task);
}