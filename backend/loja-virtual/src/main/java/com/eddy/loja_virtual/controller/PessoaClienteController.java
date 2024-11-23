package com.eddy.loja_virtual.controller;

import com.eddy.loja_virtual.dto.PessoaClienteRequestDTO;
import com.eddy.loja_virtual.model.Pessoa;
import com.eddy.loja_virtual.service.PessoaClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
public class PessoaClienteController {

    @Autowired
    private PessoaClienteService pessoaClienteService;

    @PostMapping("/")
    public Pessoa insert(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO) {
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);
        return pessoaClienteService.registar(pessoaClienteRequestDTO);
    }
}
