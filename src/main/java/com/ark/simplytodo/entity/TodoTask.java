package com.ark.simplytodo.entity;

import com.ark.simplytodo.enums.TodoTaskStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



import java.util.Date;
import java.util.Set;

@Data
@Entity
public class TodoTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;
    private TodoTaskStatus status = TodoTaskStatus.NOT_STARTED;
    private Date dueDate;
    private Date createdAt = Date.from(java.time.Instant.now());
    private Set<String> tags;

    public void setTitle(String title){
        if(title == null || title.isEmpty())
            throw new IllegalArgumentException("Title cannot be null or empty, please provide a valid title.");
        this.title = title;
    }
}

