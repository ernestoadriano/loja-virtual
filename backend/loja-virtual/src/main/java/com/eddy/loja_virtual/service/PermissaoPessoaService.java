package com.eddy.loja_virtual.service;

import com.eddy.loja_virtual.model.Permissao;
import com.eddy.loja_virtual.model.PermissaoPessoa;
import com.eddy.loja_virtual.model.Pessoa;
import com.eddy.loja_virtual.repository.PermissaoPessoaRepository;
import com.eddy.loja_virtual.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PermissaoPessoaService {

    @Autowired
    private PermissaoPessoaRepository permissaoPessoaRepository;

    @Autowired
    private PermissaoRepository permissaoRepository;

    public void vincularPessoaPermissaoCliente(Pessoa pessoa) {
        List<Permissao> permissaoList = permissaoRepository.findByNome("cliente");
        if (permissaoList.size() > 0) {
            PermissaoPessoa permissaoPessoa = new PermissaoPessoa();
            permissaoPessoa.setPessoa(pessoa);
            permissaoPessoa.setPermissao(permissaoList.get(0));
            permissaoPessoa.setDataCriacao(new Date());
            permissaoPessoaRepository.saveAndFlush(permissaoPessoa);
        }
    }
}
