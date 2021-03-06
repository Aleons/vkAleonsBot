package ru.aleons.vkAleonsBot.model;

public class Message {
    private String type;
    private Object object;
    private int group_id;
    private String secret;

    public Message() {
    }

    public Message(String type, Object object, int group_id, String secret) {
        this.type = type;
        this.object = object;
        this.group_id = group_id;
        this.secret = secret;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
