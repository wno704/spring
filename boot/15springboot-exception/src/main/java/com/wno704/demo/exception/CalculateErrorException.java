package com.wno704.demo.exception;

public class CalculateErrorException extends RuntimeException{

    private static final long serialVersionUID = -1L;

    private String id;

    public CalculateErrorException(String id){
        super("calculate is error");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
