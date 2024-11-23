package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.CarrinhoCompraProduto;
import com.eddy.loja_virtual.service.CarrinhoCompraProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrinho_compra_produto")
public class CarrinhoCompraProdutoController {

    @Autowired
    private CarrinhoCompraProdutoService compraProdutoService;

    @GetMapping("/")
    public List<CarrinhoCompraProduto> getAll() {
        return compraProdutoService.getAll();
    }

    @PostMapping("/")
    public CarrinhoCompraProduto insert(CarrinhoCompraProduto compraProduto) {
        return compraProdutoService.insert(compraProduto);
    }

    @PutMapping("/")
    public CarrinhoCompraProduto update(CarrinhoCompraProduto compraProduto) {
        return compraProdutoService.update(compraProduto);
    }

    @DeleteMapping("/{id}")
    public List<CarrinhoCompraProduto> delete(@PathVariable("id") Long id) {
        return compraProdutoService.delete(id);
    }
}
