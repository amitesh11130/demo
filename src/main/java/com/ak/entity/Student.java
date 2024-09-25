package com.ak.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student extends User {
    public Student(String name, int id) {
        super(name, id);
    }
}