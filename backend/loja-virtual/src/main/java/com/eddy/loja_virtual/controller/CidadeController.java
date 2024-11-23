package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.model.Cidade;
import com.eddy.loja_virtual.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping("/")
    public List<Cidade> getAll() {
        return cidadeService.getAll();
    }

    @PostMapping("/")
    public Cidade insert(@RequestBody Cidade cidade) {
        return cidadeService.insert(cidade);
    }

    @PutMapping("/")
    public Cidade update(@RequestBody Cidade cidade) {
        return cidadeService.update(cidade);
    }

    @DeleteMapping("/{id}")
    public List<Cidade> delete(@PathVariable("id") Long id) {
        return cidadeService.delete(id);
    }
}
