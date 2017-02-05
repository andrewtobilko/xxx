package com.tobilko;

import com.tobilko.entity.Account;
import com.tobilko.entity.AccountCredentials;
import com.tobilko.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountService {

    public static void main(String[] args) {
        SpringApplication.run(AccountService.class, args);
    }

    @Bean
    public ApplicationRunner run(@Autowired AccountRepository repository) {
        return args -> {
            Account account = new Account(new AccountCredentials("a", "b"));

            repository.save(account);

        };
    }

}
