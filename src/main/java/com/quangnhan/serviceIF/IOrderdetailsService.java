/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnhan.serviceIF;

import com.quangnhan.entity.OrderDetailsEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ADMIN
 */
public interface IOrderdetailsService {
    List<OrderDetailsEntity> getById(int orderId);
}
