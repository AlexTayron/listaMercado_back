package br.com.alextayron.appmercado.service;

import java.util.List;

import br.com.alextayron.appmercado.model.Produto;

public interface IProdutoService {
	public Package criarNovoProduto( Produto prod );
	public List<Produto> listarTodos();
	public List<Produto> buscarPorPalavraChave(String Key);
	public Produto buscarPorId(Integer id);
}
