package com.wno704.boot.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = -2731598327208972274L;

    private Long id;
    private String name;
    private Integer age;
}
