package com.ark.simplytodo.entity;

import com.ark.simplytodo.annotation.Phone;
import com.ark.simplytodo.enums.TodoTaskStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;



import java.util.Date;
import java.util.Set;

@Data
@Entity
public class TodoTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "title can't be null")
    private String title;
    private String description;

    private TodoTaskStatus status=TodoTaskStatus.NOT_STARTED;

    private Date dueDate;

    @NotNull(message = "created date can't be null")
    private Date createdAt= Date.from(java.time.Instant.now());

    private Set<String> tags;

    @Phone
    private String phone;


}
