package com.kat.recipe.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    public void setUp() {
        category = new Category();
    }

    @Test
    void getId() {

        Long idValue = 4L;

        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }
}