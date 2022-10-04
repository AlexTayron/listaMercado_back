/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.alextayron.appmercado.repo;

import br.com.alextayron.appmercado.model.Lista;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alextayron
 */
public interface ListaRepo extends CrudRepository<Lista, Integer>{
    
}
