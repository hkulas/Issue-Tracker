package com.hkulas.issuetracker;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name="ISSUE")
public class DbIssue extends DbIdentity{

    private String name;

}
