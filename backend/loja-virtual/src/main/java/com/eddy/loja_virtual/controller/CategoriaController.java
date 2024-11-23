package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.Categoria;
import com.eddy.loja_virtual.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/")
    public List<Categoria> getAll() {
        return categoriaService.getAll();
    }

    @PostMapping("/")
    public Categoria insert(@RequestBody Categoria categoria) {
        return categoriaService.insert(categoria);
    }

    @PutMapping("/")
    public Categoria update(@RequestBody Categoria categoria) {
        return categoriaService.update(categoria);
    }

    @DeleteMapping("/{id}")
    public List<Categoria> delete(@PathVariable("id") Long id) {
        return categoriaService.delete(id);
    }
}
