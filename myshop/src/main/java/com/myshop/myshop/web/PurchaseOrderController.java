package com.myshop.myshop.web;


import com.myshop.myshop.model.PurchaseOrder;
import com.myshop.myshop.service.PurchaseOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@RestController
@RequestMapping("api/product")
public class PurchaseOrderController {

    private PurchaseOrderService purchaseOrderService;

    public PurchaseOrderController(PurchaseOrderService purchaseOrderService) {
        super();
        this.purchaseOrderService = purchaseOrderService;
    }

    @GetMapping("/purchase")
    public ResponseEntity<PurchaseOrder> getAll() throws Exception{
        List<PurchaseOrder> purchaseResponse  = purchaseOrderService.findAll();
        return new ResponseEntity(purchaseResponse, HttpStatus.OK);
    }

    @GetMapping("/purchase/{id}")
    public ResponseEntity<PurchaseOrder> get(@PathVariable Long id) throws Exception{
        Optional<PurchaseOrder> purchaseResponse  = purchaseOrderService.findById(id);
        return new ResponseEntity(purchaseResponse, HttpStatus.OK);
    }

}
