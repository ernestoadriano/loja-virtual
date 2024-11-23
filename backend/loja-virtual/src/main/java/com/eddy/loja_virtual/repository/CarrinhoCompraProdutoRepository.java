package com.eddy.loja_virtual.repository;


import com.eddy.loja_virtual.model.CarrinhoCompraProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoCompraProdutoRepository extends JpaRepository<CarrinhoCompraProduto, Long> {
}
