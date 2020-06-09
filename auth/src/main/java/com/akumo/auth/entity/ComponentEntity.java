package com.akumo.auth.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ComponentEntity {

    @Id
    private int id;
}
