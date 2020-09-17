package com.wno704.designpattern.behavioral.mediator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
