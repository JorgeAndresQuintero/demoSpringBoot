package com.se.group2.demo.infopoint;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    /*
    @JsonProperty tells that the id value might be read from a JSONObject's name property.
    This allows automatic instantiation of JSON objects to Java objects.
    In other words, through the annotation Sprin knows that after creating an User object, it should call User.setId and
    feed the JSON value as argument.
     */
    public void setId(@JsonProperty("name") String id) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(@JsonProperty("password") String password) {
        this.password = password;
    }

    public String toString(){
        return " Name: " + this.name +
                "\n Password: " + this.password;

    }
}
