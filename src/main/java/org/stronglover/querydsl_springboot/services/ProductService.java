package org.stronglover.querydsl_springboot.services;

import org.stronglover.querydsl_springboot.entity.Product;
import org.stronglover.querydsl_springboot.entity.QProduct;
import org.stronglover.querydsl_springboot.repository.ProductRepo;

import java.util.List;

public class ProductService {
    private ProductRepo productRepo;

    /*public List<User> findByName(String name) {
        QUser user = QUser.user;
        return (List<User>) userRepository.findAll(user.name.eq(name));
    }*/

    public List<Product> findByName(String name) {
        QProduct product = QProduct.product;
        return (List<Product>) productRepo.findAll(product.name.eq(name));
    }

}
