package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.Permissao;
import com.eddy.loja_virtual.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissao")
public class PermissaoController {

    @Autowired
    private PermissaoService permissaoService;

    @GetMapping("/")
    public List<Permissao> getAll() {
        return permissaoService.getAll();
    }

    @PostMapping("/")
    public Permissao insert(@RequestBody Permissao permissao) {
        return permissaoService.insert(permissao);
    }

    @PutMapping("/")
    public Permissao update(@RequestBody Permissao permissao) {
        return permissaoService.update(permissao);
    }

    @DeleteMapping("/{id}")
    public List<Permissao> delete(@PathVariable("id") Long id) {
        return permissaoService.delete(id);
    }
}
