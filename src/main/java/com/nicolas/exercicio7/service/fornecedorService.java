package com.nicolas.exercicio7.service;

import com.nicolas.exercicio7.models.Fornecedor;
import com.nicolas.exercicio7.repository.fornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class fornecedorService {

    @Autowired
    private fornecedorRepository repository;

    public Fornecedor Criar(Fornecedor fornecedor){
        return repository.save(fornecedor);
    }

    public List<Fornecedor> listar(){
        return repository.findAll();
    }

    public Fornecedor findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public void  deleteById(Long id){
        repository.deleteById(id);
    }
}
