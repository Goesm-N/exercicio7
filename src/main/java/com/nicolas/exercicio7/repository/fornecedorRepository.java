package com.nicolas.exercicio7.repository;

import com.nicolas.exercicio7.models.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface fornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
