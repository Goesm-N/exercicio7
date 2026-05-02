package com.nicolas.exercicio7.controller;

import com.nicolas.exercicio7.models.Fornecedor;
import com.nicolas.exercicio7.repository.fornecedorRepository;
import com.nicolas.exercicio7.service.fornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Fornecedor")
public class fornecedorController {

    @Autowired
    private fornecedorService fornecedorService;

    @PostMapping
    public Fornecedor Criar(@RequestBody Fornecedor fornecedor){
        return fornecedorService.Criar(fornecedor);
    }

    @GetMapping
    public List<Fornecedor> listar(){
        return fornecedorService.listar();
    }

    @GetMapping("/{id}")
    public Fornecedor buscar(@PathVariable Long id){
        return fornecedorService.findById(id);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        fornecedorService.deleteById(id);
    }

}
