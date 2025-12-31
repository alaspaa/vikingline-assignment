package com.assignment.vikingline.models;

import org.jspecify.annotations.NonNull;

public record Person(
        @NonNull String name
) implements NamedObject {

    public String getObjectName() {
        return name;
    }
}
