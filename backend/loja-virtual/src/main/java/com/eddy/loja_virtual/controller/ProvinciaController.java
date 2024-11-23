package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.Provincia;
import com.eddy.loja_virtual.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/provincia")
public class ProvinciaController {

    @Autowired
    private ProvinciaService provinciaService;

    @GetMapping("/")
    public List<Provincia> buscarTodos() {
        return provinciaService.buscarTodos();
    }

    @PostMapping("/")
    public Provincia inserir(@RequestBody Provincia provincia) {
        return provinciaService.inserir(provincia);
    }

    @PutMapping("/")
    public Provincia alterar(@RequestBody Provincia provincia) {
        return provinciaService.alterar(provincia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        provinciaService.excluir(id);
        return ResponseEntity.ok().build();
    }
}

