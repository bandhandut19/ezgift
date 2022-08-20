package com.ezgift.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezgift.entities.Order;

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
