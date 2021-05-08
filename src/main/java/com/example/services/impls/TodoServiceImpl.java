package com.example.services.impls;

import com.example.models.Todo;
import com.example.services.TodoService;
import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;
import java.time.ZonedDateTime;
import java.util.List;

@Primary
@Singleton
public class TodoServiceImpl implements TodoService {

    @Override
    public List<Todo> getTodos() {
        Todo micronautTodo = new Todo("Micronaut", "Learn Micronaut", ZonedDateTime.now().plusDays(10));
        Todo reactTodo = new Todo("React", "Learn React", ZonedDateTime.now().plusDays(20));
        return List.of(micronautTodo, reactTodo);
    }
}
