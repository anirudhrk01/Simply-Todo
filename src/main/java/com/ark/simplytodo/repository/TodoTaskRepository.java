package com.ark.simplytodo.repository;

import com.ark.simplytodo.entity.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoTaskRepository  extends JpaRepository<TodoTask, Integer> {

    public TodoTask findById(int id);
    public void deleteById(int id);
    public TodoTask save(TodoTask todoTask);
    public List<TodoTask> findAll();

    @Query("SELECT t FROM TodoTask t WHERE t.status = 'COMPLETED'")
    List<TodoTask> findAllCompletedTask();

    // NAMED PARAMS can be used like like :keyword
    @Query("SELECT t FROM TodoTask t WHERE t.title LIKE %:keyword%")
    List<TodoTask> findByKeyword(String keyword);
    // observe we set keywordInDiscription as kw and used kw in query.
    @Query("select t from TodoTask t where t.title like %:kw%")
    List<TodoTask> findByKeywordDescription(@Param("kw") String keywordInDescription);

    //Numberd param can be used like ?1
    @Query("SELECT t FROM TodoTask t where t.status = ?1")
    List<TodoTask> findAllByStatus(String status);



}
