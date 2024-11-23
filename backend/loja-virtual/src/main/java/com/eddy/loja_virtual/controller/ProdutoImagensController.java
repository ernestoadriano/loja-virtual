package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.ProdutoImagens;
import com.eddy.loja_virtual.service.ProdutoImagensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/produtoimagens")
public class ProdutoImagensController {

    @Autowired
    private ProdutoImagensService produtoImagensService;

    @GetMapping("/")
    public List<ProdutoImagens> getAll() {
        return produtoImagensService.getAll();
    }

    @PostMapping("/")
    public ProdutoImagens insert(@RequestParam("idProduto") Long idProduto, @RequestParam("file") MultipartFile file) {
        return produtoImagensService.insert(idProduto, file);
    }

    @PutMapping("/")
    public ProdutoImagens update(@RequestBody ProdutoImagens produtoImagens) {
        return produtoImagensService.update(produtoImagens);
    }

    @DeleteMapping("/{id}")
    public List<ProdutoImagens> delete(@PathVariable("id") Long id) {
        return produtoImagensService.delete(id);
    }
}
