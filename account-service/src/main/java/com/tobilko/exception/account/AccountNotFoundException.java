package com.tobilko.exception.account;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ResponseStatus(code = NOT_FOUND, reason = "The requested account couldn't be found!")
public class AccountNotFoundException extends RuntimeException {}
