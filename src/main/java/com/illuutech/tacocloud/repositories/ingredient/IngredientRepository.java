package com.illuutech.tacocloud.repositories.ingredient;

import com.illuutech.tacocloud.domains.entities.Ingredients;

import java.util.Optional;

public interface IngredientRepository {
    Iterable<Ingredients> findAll();
    Optional<Ingredients> findById(String id);
    Ingredients save(Ingredients ingredient);
}
