package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.CarrinhoCompra;
import com.eddy.loja_virtual.service.CarrinhoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrinho_compra")
public class CarrinhoCompraController {

    @Autowired
    private CarrinhoCompraService carrinhoCompraService;

    @GetMapping("/")
    public List<CarrinhoCompra> getAll() {
        return carrinhoCompraService.getAll();
    }

    @PostMapping("/")
    public CarrinhoCompra insert(@RequestBody CarrinhoCompra carrinhoCompra) {
        return carrinhoCompraService.insert(carrinhoCompra);
    }

    @PutMapping("/")
    public CarrinhoCompra update(@RequestBody CarrinhoCompra carrinhoCompra) {
        return carrinhoCompraService.update(carrinhoCompra);
    }

    @DeleteMapping("/{id}")
    public List<CarrinhoCompra> delete(@PathVariable("id") Long id) {
        return carrinhoCompraService.delete(id);
    }
}
