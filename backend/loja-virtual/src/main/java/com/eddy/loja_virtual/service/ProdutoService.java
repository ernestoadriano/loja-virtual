package com.eddy.loja_virtual.service;

import com.eddy.loja_virtual.model.Produto;
import com.eddy.loja_virtual.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    public Produto insert(Produto produto) {
        produto.setDataCriacao(new Date());
        return produtoRepository.saveAndFlush(produto);
    }

    public Produto update(Produto produto) {
        produto.setDataAtualizacao(new Date());
        return produtoRepository.saveAndFlush(produto);
    }

    public List<Produto> delete(Long id) {
        Produto produto = produtoRepository.findById(id).get();
        produtoRepository.delete(produto);
        return getAll();
    }
}
