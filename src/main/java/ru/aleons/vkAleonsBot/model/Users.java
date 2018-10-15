package ru.aleons.vkAleonsBot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Users {
    @JsonProperty("response")
    List<Response> response;

    public List<Response> getResponses() {
        return response;
    }

    public void setResponses(List<Response> responses) {
        this.response = responses;
    }
}
