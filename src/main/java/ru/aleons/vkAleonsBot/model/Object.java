package ru.aleons.vkAleonsBot.model;

public class Object {
    int id;
    long date;
    int out;
    int user_id;
    int read_state;
    String title; //"id":10,"date":1539519833,"out":0,"user_id":6329091,"read_state":0,"title":"","body":"c"
    String body;

    public Object() {
    }

    public Object(int id, long date, int out, int user_id, int read_state, String title, String body) {
        this.id = id;
        this.date = date;
        this.out = out;
        this.user_id = user_id;
        this.read_state = read_state;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRead_state() {
        return read_state;
    }

    public void setRead_state(int read_state) {
        this.read_state = read_state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
