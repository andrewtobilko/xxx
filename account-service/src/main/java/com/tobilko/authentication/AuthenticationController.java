package com.tobilko.authentication;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
// todo : status
public class AuthenticationController {

    private final @NonNull AuthenticationService service;

    @GetMapping(path = "authenticate")
    public void authenticate() {
        service.authenticate();
    }

    @PostMapping(path = "invalidate")
    public void invalidate() {
        service.invalidate();
    }

}
