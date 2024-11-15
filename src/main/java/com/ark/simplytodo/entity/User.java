package com.ark.simplytodo.entity;


import com.ark.simplytodo.annotation.Phone;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @Phone
    private String phone;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @OneToMany
    List<TodoTask> tasks = new ArrayList<TodoTask>();


}
