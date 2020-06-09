package com.akumo.auth.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class AppEntity {

    @Id
    private int id;

    @OneToMany
    private List<JvmEntity> jvms;

}
