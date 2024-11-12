package com.ark.simplytodo.entity;

import com.ark.simplytodo.enums.TodoTaskStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Data
public class TodoTask {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static int idCounter = 0 ;

    @Setter(AccessLevel.NONE)
    private int id = idCounter++;
    private String title;
    private String description;

    private TodoTaskStatus status = TodoTaskStatus.NOT_STARTED;
    private Date dueDate;
    private Date createdAt = Date.from(java.time.Instant.now());


}
