package org.gryffindor.study;

import java.util.UUID;

public class User {

    private final UUID id;

    private String name;

    private Email email;

    public User() {
        this.id = UUID.randomUUID();
    }
    public User(String name, Email email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
    }

    public UUID getID() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
