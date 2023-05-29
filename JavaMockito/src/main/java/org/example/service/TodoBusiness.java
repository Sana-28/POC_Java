package org.example.service;
import org.example.todoInter.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusiness {

    public TodoService doService;

    public TodoBusiness(TodoService doService) {
        this.doService = doService;
    }

    public List<String> getTodosforHibernate(String user) {

        List<String> hibernatelist = new ArrayList<>();
        List<String> Combinedlist = doService.getTodos(user);

        for (String todo : Combinedlist) {
            if (todo.contains("Hibernate")) {
                hibernatelist.add(todo);
            }
        }

        return hibernatelist;
    }
}