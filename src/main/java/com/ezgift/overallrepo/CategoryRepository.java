package com.ezgift.overallrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezgift.model.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Override
    List<Category> findAll();
    @Override
    Category getReferenceById(Integer id);
    @Override
    void deleteById(Integer id);
    @Override
    void deleteAllByIdInBatch(Iterable<Integer> ids);
}