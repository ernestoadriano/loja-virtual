package com.eddy.loja_virtual.repository;


import com.eddy.loja_virtual.model.CarrinhoCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoCompraRepository extends JpaRepository<CarrinhoCompra, Long> {
}
