package org.gryffindor.study;

import java.util.UUID;

public class UserDto {

    private String name;
    private EmailDto email;
    private UUID id;

    public UserDto() {}

    public UserDto(String name, EmailDto email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public EmailDto getEmail() {
        return email;
    }

    public UUID getID() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(EmailDto email) {
        this.email = email;
    }
}
