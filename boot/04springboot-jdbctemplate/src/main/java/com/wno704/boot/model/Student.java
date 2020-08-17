package com.wno704.boot.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Student implements Serializable {
    private static final long serialVersionUID = -339516038496531943L;
    private int sno;
    private String name;
    private String sex;
}

