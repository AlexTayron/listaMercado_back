/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.alextayron.appmercado.repo;

import br.com.alextayron.appmercado.model.ItemLista;
import br.com.alextayron.appmercado.model.Produto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alextayron
 */
public interface ItemListaRepo extends CrudRepository<ItemLista, Integer>{
    public List<Produto> findAllByNomeContaining(String palavraChave);
}
