package com.crudcomfront.crud.repository;

import com.crudcomfront.crud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}