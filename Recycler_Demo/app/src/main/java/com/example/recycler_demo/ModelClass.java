package com.example.recycler_demo;

public class ModelClass {

    private int resource ;
    private String text;
    private String body;

    public ModelClass(int resource, String text, String body) {
        this.resource = resource;
        this.text = text;
        this.body = body;
    }

    public int getResource() {
        return resource;
    }

    public String getText() {
        return text;
    }

    public String getBody() {
        return body;
    }

    /*public ModelClass(int resource, String text, String body) {
        this.resource = resource;
        this.text = text;
        this.body = body;
    }

    public int getResource() {
        return resource;
    }

    public String getText() {
        return text;
    }

    public String getBody() {
        return body;
    }*/
}
