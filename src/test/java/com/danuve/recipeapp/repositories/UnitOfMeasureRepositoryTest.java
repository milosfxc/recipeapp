package com.danuve.recipeapp.repositories;

import com.danuve.recipeapp.domain.UnitOfMeasure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryTest {
    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;
    @Test
    void findByDescription() {
        Optional<UnitOfMeasure> uomRepository = unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", uomRepository.get().getDescription());
    }
}