package com.myshop.myshop.service.impl;

import com.myshop.myshop.model.Invoice;
import com.myshop.myshop.repository.InvoiceRepository;
import com.myshop.myshop.service.InvoiceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@Service
public class InvoiceServiceImpl implements InvoiceService {
    private InvoiceRepository invoiceRepository;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Optional<Invoice> findById(Long id) throws Exception {
        return invoiceRepository.findById(id);
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }
}
