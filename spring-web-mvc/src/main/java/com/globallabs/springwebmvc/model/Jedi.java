package com.globallabs.springwebmvc.model;

import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullFields;

public class Jedi {
    @NonNull
    private String name;
    @NonNull
    private String lastName;

    public Jedi(final String name, final String lastname) {
        this.name = name;
        this.lastName = lastname;
    }

    public Jedi() {
    }

    public String getName() { return name; }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
