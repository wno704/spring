package com.wno704.boot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = -3395160384965332329L;
    private long id;
    private String name;
    private String desc;
}
