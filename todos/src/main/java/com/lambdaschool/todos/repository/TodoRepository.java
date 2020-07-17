package com.lambdaschool.todos.repository;


import com.lambdaschool.todos.models.Todos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todos, Long> {
}
