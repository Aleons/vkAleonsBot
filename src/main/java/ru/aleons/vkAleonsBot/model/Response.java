package ru.aleons.vkAleonsBot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Response {
    @JsonProperty("id")
    long id;
    @JsonProperty("first_name")
    String firstNameame;
    @JsonProperty("last_name")
    String lastName;

    public String getFirstName() {
        return firstNameame;
    }

    public void setFirstName(String first_name) {
        this.firstNameame = first_name;
    }
}
