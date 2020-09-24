/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangnhan.controller;

import com.quangnhan.entity.OrdersEntity;
import com.quangnhan.service.OrdersService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @GetMapping(value = "list")
    public String listOrder(HttpServletRequest request, Model theModel) {
        List<OrdersEntity> listOrders = ordersService.getAllOrders();
        theModel.addAttribute("listOrders", listOrders);
        return "list-orders";
    }
    @GetMapping("detail")
    public String listDetail(@RequestParam("orderId") int theId,Model theModel) {
        OrdersEntity order = ordersService.getById(theId);
        theModel.addAttribute("order", order);
        return "list-orders";
    }
}
