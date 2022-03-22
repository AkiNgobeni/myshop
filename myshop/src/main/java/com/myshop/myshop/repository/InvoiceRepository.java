package com.myshop.myshop.repository;

import com.myshop.myshop.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
}
