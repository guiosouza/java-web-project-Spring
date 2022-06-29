package com.guiosouza.projetowebbasico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guiosouza.projetowebbasico.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
