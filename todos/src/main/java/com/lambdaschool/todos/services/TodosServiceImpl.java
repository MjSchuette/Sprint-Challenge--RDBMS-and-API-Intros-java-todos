package com.lambdaschool.todos.services;


import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service(value = "todosService")
public class TodosServiceImpl implements TodosService {
    @Autowired
    TodoRepository todosRepos;

    @Transactional
    @Override
    public void markComplete(long todoid) {
        Todos todo = todosRepos.findById(todoid)
                .orElseThrow(() -> new EntityNotFoundException("Customer " + todoid + " Not Found"));
        todo.setCompleted(true);
        todosRepos.save(todo);
    }
}
