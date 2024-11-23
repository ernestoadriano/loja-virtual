package com.eddy.loja_virtual.service;


import com.eddy.loja_virtual.model.CarrinhoCompraProduto;
import com.eddy.loja_virtual.repository.CarrinhoCompraProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarrinhoCompraProdutoService {

    @Autowired
    private CarrinhoCompraProdutoRepository compraProdutoRepository;

    public List<CarrinhoCompraProduto> getAll() {
        return compraProdutoRepository.findAll();
    }

    public CarrinhoCompraProduto insert(CarrinhoCompraProduto compraProduto) {
        compraProduto.setDataCriacao(new Date());
        return compraProdutoRepository.saveAndFlush(compraProduto);
    }

    public CarrinhoCompraProduto update(CarrinhoCompraProduto compraProduto) {
        compraProduto.setDataAtualizacao(new Date());
        return compraProdutoRepository.saveAndFlush(compraProduto);
    }

    public List<CarrinhoCompraProduto> delete(Long id) {
        CarrinhoCompraProduto compraProduto = compraProdutoRepository.findById(id).get();
        compraProdutoRepository.delete(compraProduto);
        return getAll();
    }
}
