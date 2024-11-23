package com.eddy.loja_virtual.service;

import com.eddy.loja_virtual.model.Provincia;
import com.eddy.loja_virtual.repository.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProvinciaService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    public List<Provincia> buscarTodos() {
        return provinciaRepository.findAll();
    }

    public Provincia inserir(Provincia provincia) {
        provincia.setDataCriacao(new Date());
        return provinciaRepository.saveAndFlush(provincia);
    }

    public Provincia alterar(Provincia provincia) {
        provincia.setDataAtualizacao(new Date());
        return provinciaRepository.saveAndFlush(provincia);
    }

    public void excluir(Long id) {
        Provincia provincia = provinciaRepository.findById(id).get();
        provinciaRepository.delete(provincia);
    }
}
