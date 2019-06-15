package com.kodillaspring.com.kodillaspring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(toDoList(), inProgressList(), doneList());
    }

    @Bean("toDoList")
    public TaskList toDoList() {
        ArrayList<String> toDoList = new ArrayList<String>();
        return new TaskList(toDoList);
    }


    @Bean("inProgressList")
    public TaskList inProgressList() {
        ArrayList<String> inProgressList = new ArrayList<String>();
        return new TaskList(inProgressList);
    }

    @Bean("doneList")
    public TaskList doneList() {
        ArrayList<String> doneList = new ArrayList<String>();
        return new TaskList(doneList);
    }
}
