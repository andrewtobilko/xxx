package com.tobilko.authentication;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AuthenticationService {

    private final @NonNull AccountAuthenticationManager manager;

    public void authenticate() {
        // todo :
    }

    public void invalidate() {
        // todo : invalidate a token [?]
    }

}
