package com.wno704.boot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Account implements Serializable {
    private static final long serialVersionUID = -6309732882044872299L;
    int no;
    String account;
    String name;
    String password;
    String accountType;
    String tel;
}
