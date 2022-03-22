package com.myshop.myshop.service;

import com.myshop.myshop.model.Invoice;

import java.util.List;
import java.util.Optional;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

public interface InvoiceService {
    Optional<Invoice> findById(Long id) throws Exception;

    List<Invoice> findAll() throws Exception;
}
