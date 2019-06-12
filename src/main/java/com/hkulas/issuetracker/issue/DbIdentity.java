package com.hkulas.issuetracker;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
abstract class DbIdentity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
