package com.eddy.loja_virtual.dto;

import com.eddy.loja_virtual.model.Pessoa;
import org.springframework.beans.BeanUtils;


public class PessoaClienteRequestDTO {

    private String nome;

    private String bi;

    private String email;

    private String endereco;

    public Pessoa converter(PessoaClienteRequestDTO pessoaClienteRequestDTO) {
        Pessoa pessoa = new Pessoa();

        BeanUtils.copyProperties(pessoaClienteRequestDTO, pessoa);

        return pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
