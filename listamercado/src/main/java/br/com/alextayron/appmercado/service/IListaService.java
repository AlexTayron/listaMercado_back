/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.alextayron.appmercado.service;

import br.com.alextayron.appmercado.model.Lista;

/**
 *
 * @author alextayron
 */
public interface IListaService {
    public Lista criarNovaLista(Lista nova);
    public void removerLista(Integer id);
    public void fecharLista(Integer id);
    public void buscarPeloId(Integer id);    
}
