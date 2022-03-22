package com.myshop.myshop.service.impl;

import com.myshop.myshop.model.PurchaseOrder;
import com.myshop.myshop.repository.PurchaseOrderRepository;
import com.myshop.myshop.service.PurchaseOrderService;
import com.myshop.myshop.web.dto.PurchaseOrderDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    private PurchaseOrderRepository purchaseOrderRepository;

    public PurchaseOrderServiceImpl(PurchaseOrderRepository purchaseOrderRepository) {
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    @Override
    public PurchaseOrder save(PurchaseOrderDto productDto) {
        PurchaseOrder purchaseOrder = new PurchaseOrder(productDto.getProductName(),
                productDto.getProductDescription(), productDto.getQuantity(), productDto.getUnitPrice(),
                productDto.getTotalAmount(), productDto.getGrandTotal());

        return purchaseOrderRepository.save(purchaseOrder);
    }

    @Override
    public Optional<PurchaseOrder> findById(Long id) throws Exception {
        return purchaseOrderRepository.findById(id);
    }

    @Override
    public List<PurchaseOrder> findAll() throws Exception {
        return purchaseOrderRepository.findAll();
    }
}
