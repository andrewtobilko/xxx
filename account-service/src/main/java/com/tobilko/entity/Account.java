package com.tobilko.entity;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Credentials credentials;

}
