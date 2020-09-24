/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnhan.service;

import com.quangnhan.entity.OrderDetailsEntity;
import com.quangnhan.repository.OrderDetailsRepository;
import com.quangnhan.serviceIF.IOrderdetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsService implements IOrderdetailsService{
    @Autowired
    private OrderDetailsRepository orDetailRP;
    @Override
    public List<OrderDetailsEntity> getById(int orderId) {
        return orDetailRP.findByOrderId(orderId);
    }
    
}
