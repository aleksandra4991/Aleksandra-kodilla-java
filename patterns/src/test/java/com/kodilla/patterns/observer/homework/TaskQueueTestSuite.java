package com.kodilla.patterns.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate(){

        //Given
        Student student1 = new Student("Patryk Makowski");
        Student student2 = new Student("Julia Wrona");
        Student student3 = new Student("Aleksandra Radzikowska");

        Mentor mentor1 = new Mentor ("Monika Pawłowska");
        Mentor mentor2 = new Mentor ("Sebastian Kruk");

        student1.becomeObserver(mentor1);
        student2.becomeObserver(mentor2);
        student3.becomeObserver(mentor2);

        Task task1 = new Task(1, "task1");
        Task task2 = new Task(2, "task2");
        Task task3 = new Task(3, "task3");


        //When
        student1.addDoneTask(task1);
        student2.addDoneTask(task2);
        student3.addDoneTask(task3);


        //Then
        assertEquals(1, mentor1.getUpdateCounter());
        assertEquals(2, mentor2.getUpdateCounter());

    }
}
