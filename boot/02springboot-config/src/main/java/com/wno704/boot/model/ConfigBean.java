package com.wno704.boot.model;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="wno704.blog")
public class ConfigBean {
    private String name;

    private String title;

    private String wholeTitle;

    public String getWholeTitle(){
        return  this.wholeTitle;
    }
    public void setWholeTitle(String wholeTitle){
        this.wholeTitle = wholeTitle;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}
