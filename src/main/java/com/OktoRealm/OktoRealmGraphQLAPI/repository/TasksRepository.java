package com.OktoRealm.OktoRealmGraphQLAPI.repository;

import com.OktoRealm.OktoRealmGraphQLAPI.model.Tasks;
import jakarta.annotation.PostConstruct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TasksRepository {

    private List<Tasks> tasks = new ArrayList<>();

    public List<Tasks> findAll() {
        return tasks;
    }

    public TasksRepository(){

    }
    @PostConstruct
    private void init() {
        tasks.add(new Tasks(1,"Josh","Long"));
        tasks.add(new Tasks(2,"Mark","Heckler"));
        tasks.add(new Tasks(3,"Greg","Turnquist"));
    }

}
