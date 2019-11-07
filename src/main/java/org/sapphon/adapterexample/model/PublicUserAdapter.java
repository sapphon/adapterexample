package org.sapphon.adapterexample.model;

public class PublicUserAdapter {

    public long id;
    public String name;
    public String jobRole;

    public PublicUserAdapter(User input) {
        this.id = input.id;
        this.name = input.name;
        this.jobRole = input.jobRole;
    }
}
