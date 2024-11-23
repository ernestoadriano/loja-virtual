package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.Pessoa;
import com.eddy.loja_virtual.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/")
    public List<Pessoa> getAll() {
        return pessoaService.getAll();
    }

    @PostMapping("/")
    public Pessoa insert(@RequestBody Pessoa pessoa) {
        return pessoaService.insert(pessoa);
    }

    @PutMapping("/")
    public Pessoa update(@RequestBody Pessoa pessoa) {
        return pessoaService.update(pessoa);
    }

    @DeleteMapping("/{id}")
    public List<Pessoa> delete(@PathVariable("id") Long id) {
        return pessoaService.delete(id);
    }
}
