/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnhan.serviceIF;

import com.quangnhan.entity.OrdersEntity;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IOrdersService {
    List<OrdersEntity> getAllOrders();
    OrdersEntity getById(int orderId);
}
