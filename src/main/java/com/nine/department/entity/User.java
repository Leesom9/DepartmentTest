package com.nine.department.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private long id;
    private String username;
    private String password;
}
