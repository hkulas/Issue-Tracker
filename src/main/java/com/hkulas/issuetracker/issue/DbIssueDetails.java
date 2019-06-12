package com.hkulas.issuetracker.issue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ISSUE_DESCRIPTION")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DbIssueDescription {

}
