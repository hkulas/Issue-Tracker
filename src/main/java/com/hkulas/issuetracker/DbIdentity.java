package com.hkulas.issuetracker;

import javax.persistence.*;

@MappedSuperclass
abstract class DbIdentity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
