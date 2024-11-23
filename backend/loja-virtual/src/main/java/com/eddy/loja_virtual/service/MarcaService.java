package com.eddy.loja_virtual.service;

import com.eddy.loja_virtual.model.Marca;
import com.eddy.loja_virtual.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> buscarTodos() {
        return marcaRepository.findAll();
    }

    public Marca inserir(Marca marca) {
        marca.setDataCriacao(new Date());
        return marcaRepository.saveAndFlush(marca);
    }

    public Marca atualizar(Marca marca) {
        marca.setDataAtualizacao(new Date());
        return marcaRepository.saveAndFlush(marca);
    }

    public List<Marca> delete(Long id) {
        Marca marca = marcaRepository.findById(id).get();
        marcaRepository.delete(marca);
        return buscarTodos();
    }
}
