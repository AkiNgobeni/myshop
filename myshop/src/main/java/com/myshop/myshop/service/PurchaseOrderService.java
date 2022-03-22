package com.myshop.myshop.service;

import com.myshop.myshop.model.PurchaseOrder;
import com.myshop.myshop.web.dto.PurchaseOrderDto;

import java.util.List;
import java.util.Optional;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

public interface PurchaseOrderService {
    PurchaseOrder save(PurchaseOrderDto productDto);

    Optional<PurchaseOrder> findById(Long id) throws Exception;

    List<PurchaseOrder> findAll() throws Exception;
}
