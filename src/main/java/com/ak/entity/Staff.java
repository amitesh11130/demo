package com.ak.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Staff extends User {
    public Staff(String name, int id) {
        super(name, id);
    }
}