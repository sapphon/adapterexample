package org.sapphon.adapterexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public long id;

    public String name;

    public String jobRole;

    public boolean isDisabled;

    public float yearlySalary;

}