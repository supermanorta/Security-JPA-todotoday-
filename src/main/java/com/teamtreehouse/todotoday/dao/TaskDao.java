package com.teamtreehouse.todotoday.dao;

import com.teamtreehouse.todotoday.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends CrudRepository<Task, Long> {

    public Task findOne(Long id);
}
