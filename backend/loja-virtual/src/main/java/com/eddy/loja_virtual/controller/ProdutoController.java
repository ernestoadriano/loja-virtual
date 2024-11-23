package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.Produto;
import com.eddy.loja_virtual.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/")
    public List<Produto> getAll() {
        return produtoService.getAll();
    }

    @PostMapping("/")
    public Produto insert(@RequestBody Produto produto) {
        return produtoService.insert(produto);
    }

    @PutMapping("/")
    public Produto update(@RequestBody Produto produto) {
        return produtoService.update(produto);
    }

    @DeleteMapping("/{id}")
    public List<Produto> delete(@PathVariable("id") Long id) {
        return produtoService.delete(id);
    }
}
