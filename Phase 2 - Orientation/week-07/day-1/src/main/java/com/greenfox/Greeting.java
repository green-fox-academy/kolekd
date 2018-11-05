package com.greenfox;

import org.springframework.web.bind.annotation.RequestParam;

public class Greeting {

    long id;
    String content;

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getID(){
        return this.id;
    }

    public String getContent(){
        return this.content;
    }

}
