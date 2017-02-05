package com.tobilko.entity;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class AccountCredentials {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private @NonNull String login;
    private @NonNull String password;

}
