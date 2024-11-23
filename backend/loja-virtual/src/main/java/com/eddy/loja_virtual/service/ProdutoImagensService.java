package com.eddy.loja_virtual.service;


import com.eddy.loja_virtual.model.Produto;
import com.eddy.loja_virtual.model.ProdutoImagens;
import com.eddy.loja_virtual.repository.ProdutoImagensRepository;
import com.eddy.loja_virtual.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

@Service
public class ProdutoImagensService {

    @Autowired
    private ProdutoImagensRepository produtoImagensRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoImagens> getAll() {
        return produtoImagensRepository.findAll();
    }

    public ProdutoImagens insert(Long id, MultipartFile file) {
        Produto produto = produtoRepository.findById(id).get();
        ProdutoImagens produtoImagens = new ProdutoImagens();
        try {
            if (!file.isEmpty()) {
                byte[] bytes = file.getBytes();
                String fileName = String.valueOf(produto.getId()) + file.getOriginalFilename();
                Path caminho = Paths
                        .get("c:/imagens/" + fileName);
                Files.write(caminho, bytes);
                produtoImagens.setNome(fileName);
                produtoRepository.saveAndFlush(produto);
            }
        } catch (MultipartException | IOException e) {
            System.out.println(e.getMessage());
        }
        produtoImagens.setProduto(produto);
        produtoImagens.setDataCriacao(new Date());
        return produtoImagensRepository.saveAndFlush(produtoImagens);
    }

    public ProdutoImagens update(ProdutoImagens produtoImagens) {
        produtoImagens.setDataAtualizacao(new Date());
        return produtoImagensRepository.saveAndFlush(produtoImagens);
    }

    public List<ProdutoImagens> delete(Long id) {
        ProdutoImagens produtoImagens = produtoImagensRepository.findById(id).get();
        produtoImagensRepository.delete(produtoImagens);
        return getAll();
    }
}
