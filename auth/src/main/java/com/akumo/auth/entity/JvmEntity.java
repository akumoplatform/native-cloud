package com.akumo.auth.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class JvmEntity {

    @Id
    private int id;
}
