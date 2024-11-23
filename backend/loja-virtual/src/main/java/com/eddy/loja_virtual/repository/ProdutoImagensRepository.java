package com.eddy.loja_virtual.repository;

import com.eddy.loja_virtual.model.ProdutoImagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long> {
}
