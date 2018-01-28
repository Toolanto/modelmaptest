package org.gryffindor.study;

public class Email {

    private String email;
    private String name;

    public Email() {}

    public Email(String email, String name) {

        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
