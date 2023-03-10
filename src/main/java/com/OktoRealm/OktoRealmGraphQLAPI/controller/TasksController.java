
package com.OktoRealm.OktoRealmGraphQLAPI.controller;

import com.OktoRealm.OktoRealmGraphQLAPI.model.Tasks;
import com.OktoRealm.OktoRealmGraphQLAPI.repository.TasksRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TasksController {

    public final TasksRepository tasksRepository;

    public TasksController(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    // @SchemaMapping(typeName = "Query", value = "allTasks")
    @QueryMapping
    Iterable<Tasks> allTasks() {
        return tasksRepository.findAll();
    }
}

