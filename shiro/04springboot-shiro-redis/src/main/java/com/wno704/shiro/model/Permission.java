package com.wno704.shiro.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Permission implements Serializable {
    private static final long serialVersionUID = -5440372534300871434L;
    private Integer id;
    private String url;
    private String name;
}
