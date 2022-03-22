package com.myshop.myshop.web;

import com.myshop.myshop.model.Invoice;
import com.myshop.myshop.service.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@RestController
@RequestMapping("api/invoice")
public class InvoiceController {


    private InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Invoice> get(@PathVariable Long id) throws Exception {
        Optional<Invoice> invoiceResponse = invoiceService.findById(id);
        return new ResponseEntity(invoiceResponse, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Invoice> getAll() throws Exception {
        List<Invoice> invoiceResponse = invoiceService.findAll();
        return new ResponseEntity(invoiceResponse, HttpStatus.OK);
    }
}
