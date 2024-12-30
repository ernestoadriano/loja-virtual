package com.eddy.loja_virtual.service;

import com.eddy.loja_virtual.dto.PessoaClienteRequestDTO;
import com.eddy.loja_virtual.model.Pessoa;
import com.eddy.loja_virtual.repository.PessoaClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PessoaClienteService {

    @Autowired
    private PessoaClienteRepository pessoaRepository;

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    /*@Autowired
    private EmailService emailService;*/

    /*public Pessoa registar(PessoaClienteRequestDTO pessoaClienteRequestDTO) {
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);
        pessoa.setDataCriacao(new Date());
        Pessoa objectoNovo = pessoaRepository.saveAndFlush(pessoa);
        permissaoPessoaService.vincularPessoaPermissaoCliente(objectoNovo);
       emailService.sendEmailText(objectoNovo.getEmail(), "Cadastro", "O registo na loja foi realizado " +
                "com sucesso. Em breve você receberá a senha de acesso por e-mail!");
        return objectoNovo;
    }*/
}
