package com.ezgift.overallrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezgift.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Override
    List<Order> findAll();
    @Override
    Order getReferenceById(Integer id);
    @Override
    void deleteById(Integer id);
    @Override
    void deleteAllByIdInBatch(Iterable<Integer> ids);
}

