package com.assignment.vikingline.models;

import org.jspecify.annotations.NonNull;

public record Item (
    @NonNull String name,
    @NonNull int quantity
) implements NamedObject {
    public String getObjectName() {
        return name;
    }
}
