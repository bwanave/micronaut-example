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
        ZonedDateTime today = ZonedDateTime.now();
        Todo micronautTodo = new Todo("Micronaut", "Learn Micronaut", today.plusDays(10));
        Todo reactTodo = new Todo("React", "Learn React", today.plusDays(20));
        return List.of(micronautTodo, reactTodo);
    }
}
