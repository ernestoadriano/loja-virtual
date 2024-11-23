package com.eddy.loja_virtual.service;

import com.eddy.loja_virtual.model.CarrinhoCompra;
import com.eddy.loja_virtual.repository.CarrinhoCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarrinhoCompraService {

    @Autowired
    private CarrinhoCompraRepository carrinhoCompraRepository;

    public List<CarrinhoCompra> getAll() {
        return carrinhoCompraRepository.findAll();
    }

    public CarrinhoCompra insert(CarrinhoCompra carrinhoCompra) {
        carrinhoCompra.setDataCriacao(new Date());
        return carrinhoCompraRepository.saveAndFlush(carrinhoCompra);
    }

    public CarrinhoCompra update(CarrinhoCompra carrinhoCompra) {
        carrinhoCompra.setDataAtualizacao(new Date());
        return carrinhoCompraRepository.saveAndFlush(carrinhoCompra);
    }

    public List<CarrinhoCompra> delete(Long id) {
        CarrinhoCompra carrinhoCompra = carrinhoCompraRepository.findById(id).get();
        carrinhoCompraRepository.delete(carrinhoCompra);
        return getAll();
    }
}
