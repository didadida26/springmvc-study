package com.zjn.springmvc.domain;

import lombok.Data;

@Data
public class User {
    private String username;
    private Integer age;
    private Address address;
}
