package com.teamtreehouse.todotoday.service;

import com.teamtreehouse.todotoday.model.Task;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface TaskService {
    Iterable<Task> findAll();
    Task findOne(Long id);
    void toggleComplete(Long id);
    void save(Task task);
//    Task findOneById(Long id);
}
