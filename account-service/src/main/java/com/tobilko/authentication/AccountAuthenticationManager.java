package com.tobilko.authentication;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class AccountAuthenticationManager implements AuthenticationManager {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if (authentication instanceof AccountAuthentication) {
            return validateAuthentication((AccountAuthentication) authentication);
        }
        // todo : replace the class with a fulfilled message
        throw new AuthenticationServiceException("");
    }

    private AccountAuthentication validateAuthentication(AccountAuthentication authentication) {
        // todo : implement
        return authentication;
    }

}
