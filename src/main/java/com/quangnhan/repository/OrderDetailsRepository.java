
package com.quangnhan.repository;

import com.quangnhan.entity.OrderDetailsEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetailsEntity, Integer>{
    List<OrderDetailsEntity> findByOrderId(int orderId);
}
