package com.tobilko.entity;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

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

    @NonNull
    @Length
    private String password;

}
