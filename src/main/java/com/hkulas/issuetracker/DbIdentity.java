package com.hkulas.issuetracker;

import javax.persistence.*;

@Entity
abstract class DbIdentity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
