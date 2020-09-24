
package com.quangnhan.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private int orderId;
    @Column(name = "orderDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate orderDate;
    private String customerName;
    @ManyToMany
    @JoinTable(name = "FK_odd_pro",
            joinColumns = @JoinColumn(name = "FK_ORDER"),
            inverseJoinColumns = @JoinColumn(name ="FK_PRODUCT"))
    List<ProductsEntity> listProducts;
    public OrdersEntity() {
    }

    public List<ProductsEntity> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<ProductsEntity> listProducts) {
        this.listProducts = listProducts;
    }
    
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
}
