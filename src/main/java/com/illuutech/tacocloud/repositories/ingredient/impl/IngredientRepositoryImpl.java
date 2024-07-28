package com.illuutech.tacocloud.repositories.ingredient.impl;

import com.illuutech.tacocloud.domains.entities.Ingredients;
import com.illuutech.tacocloud.repositories.ingredient.IngredientRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public class IngredientRepositoryImpl implements IngredientRepository {
    private final JdbcTemplate jdbcTemplate;

    public IngredientRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterable<Ingredients> findAll() {
        return null;
    }

    @Override
    public Optional<Ingredients> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Ingredients save(Ingredients ingredient) {
        return null;
    }
}
