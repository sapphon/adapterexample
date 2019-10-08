package org.sapphon.adapterexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PublicUserAdapter {
    @Id
    public long id;
    public String name;
    public String jobRole;

    public PublicUserAdapter(User input) {
        this.id=input.id;
        this.name=input.name;
        this.jobRole=input.jobRole;
    }
}
