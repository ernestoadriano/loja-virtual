package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.Marca;
import com.eddy.loja_virtual.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping("/")
    public List<Marca> buscarTodos() {
        return marcaService.buscarTodos();
    }

    @PostMapping("/")
    public Marca inserir(@RequestBody Marca marca) {
        return marcaService.inserir(marca);
    }

    @PutMapping("/")
    public Marca atualizar(@RequestBody Marca marca) {
        return marcaService.atualizar(marca);
    }

    @DeleteMapping("/{id}")
    public List<Marca> delete(@PathVariable("id") Long id) {
        return marcaService.delete(id);
    }
}
