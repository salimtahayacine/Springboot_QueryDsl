package org.stronglover.querydsl_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.stronglover.querydsl_springboot.entity.Product;
import org.stronglover.querydsl_springboot.entity.User;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long>, QuerydslPredicateExecutor<Product> {

}
