package com.se.group2.demo.infopoint;

import com.fasterxml.jackson.annotation.JsonProperty;


public class InfoPoint {

    private int id;
    private User user;
    private InfoPoint predecessor;
    private String message;

    /*
     See User.java.
     JsonProperty can also be used directly in constructor.
     */
    public InfoPoint(@JsonProperty("id") int id, @JsonProperty("user") User test, @JsonProperty("predecessor") InfoPoint predecessor,
                     @JsonProperty("message") String message) {
        this.id = id;
        this.user = test;
        this.predecessor = predecessor;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(@JsonProperty("id") int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(@JsonProperty("user") User user) {
        this.user = user;
    }

    public InfoPoint getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(@JsonProperty("predecessor") InfoPoint predecessor) {
        this.predecessor = predecessor;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(@JsonProperty("message") String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return "Id: " + this.id +
                "\n Test: " + this.user.toString() +
                "\n Message: " + this.message +
                "\n Predecessor {\n\t" + this.predecessor +
                "}";
    }
}
