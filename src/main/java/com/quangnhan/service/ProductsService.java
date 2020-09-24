/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnhan.service;

import com.quangnhan.entity.ProductsEntity;
import com.quangnhan.repository.ProductsRepository;
import com.quangnhan.serviceIF.IProductsService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService implements IProductsService{
    @Autowired
    private ProductsRepository prdRP;

    @Override
    public ProductsEntity getById(int productId) {
        Optional<ProductsEntity> lProducts = prdRP.findById(productId);
        return lProducts.isPresent()?lProducts.get():null;
    }
    
}
