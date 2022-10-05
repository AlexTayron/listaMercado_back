/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alextayron.appmercado.controller;

import br.com.alextayron.appmercado.model.Produto;
import br.com.alextayron.appmercado.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author alextayron
 */
@RestController
public class ProdutoController {
    
    @Autowired
    private IProdutoService service;
    
    @PostMapping("/produtos")
    public ResponseEntity<Produto> cadastrarNovo(@RequestBody Produto novo){
        Produto prod = service.criarNovoProduto(novo);
        if (prod != null){
            return ResponseEntity.status(201).body(prod);
        }
        return ResponseEntity.badRequest().build();
    }
}
