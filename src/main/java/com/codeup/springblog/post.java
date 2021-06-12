package com.codeup.springblog;

public class post {

    private String title;
    private String body;

    public post(){};


    public post(String title, String body){
        this.title = title;
        this.body = body;
    };


    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
