package com.eddy.loja_virtual.repository;


import com.eddy.loja_virtual.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long> {
}
