package com.illuutech.tacocloud.controllers.home;

import com.illuutech.tacocloud.jdbc.JdbcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final JdbcRepository repository;
    @GetMapping
    public String index() throws SQLException {
        repository.setUser();
        return "index";
    }
}

