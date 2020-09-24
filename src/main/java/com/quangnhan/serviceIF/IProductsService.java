/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnhan.serviceIF;

import com.quangnhan.entity.ProductsEntity;

/**
 *
 * @author ADMIN
 */
public interface IProductsService {
    ProductsEntity getById(int productId);
}
