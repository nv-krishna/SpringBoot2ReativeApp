package com.dev.springboot.reactive.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.dev.springboot.reactive.model.Invoice;

public interface InvoiceRepository extends ReactiveMongoRepository<Invoice, Integer>{

}
