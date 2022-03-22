package com.myshop.myshop.repository;


import com.myshop.myshop.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder,Long> {

}
