/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnhan.service;

import com.quangnhan.entity.OrderDetailsEntity;
import com.quangnhan.entity.OrdersEntity;
import com.quangnhan.entity.ProductsEntity;
import com.quangnhan.repository.OrdersRepository;
import com.quangnhan.serviceIF.IOrdersService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrdersService implements IOrdersService{
    @Autowired
    private OrdersRepository ordersRP;
    @Autowired
    private OrderDetailsService odDetailSV;
    @Autowired ProductsService prdSV;
    @Override
    public List<OrdersEntity> getAllOrders() {
        return (List<OrdersEntity>) ordersRP.findAll();
    }

    @Override
    public OrdersEntity getById(int orderId) {
        Optional<OrdersEntity> order = ordersRP.findById(orderId);
        OrdersEntity orderEtt = order.isPresent()?order.get():null;
        List<OrderDetailsEntity> listOrderDetal = odDetailSV.getById(orderId);
        List<ProductsEntity> listProduct = new ArrayList<>();
        for (OrderDetailsEntity orderDetailsEntity : listOrderDetal) {
            listProduct.add(prdSV.getById(orderDetailsEntity.getProId()));
        }
         orderEtt.setListProducts(listProduct);
        return orderEtt;
    }
    
}
