package com.eddy.loja_virtual.repository;


import com.eddy.loja_virtual.model.PermissaoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PermissaoPessoaRepository extends JpaRepository<PermissaoPessoa, Long> {
}
