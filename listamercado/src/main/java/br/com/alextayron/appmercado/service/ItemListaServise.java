/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.alextayron.appmercado.service;

import br.com.alextayron.appmercado.model.ItemLista;


/**
 *
 * @author alextayron
 */
public interface ItemListaServise {
    public ItemLista inserirItem(ItemLista novo);
    public ItemLista alterarItem(ItemLista item);
    public void removerItem(Integer numSeq);
}
