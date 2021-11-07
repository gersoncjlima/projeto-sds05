package com.gersoncjlima.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gersoncjlima.dsvendas.entites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
