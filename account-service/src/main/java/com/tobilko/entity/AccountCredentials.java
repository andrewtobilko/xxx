package com.tobilko.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Credentials {

    private String login;
    private String password;

}
