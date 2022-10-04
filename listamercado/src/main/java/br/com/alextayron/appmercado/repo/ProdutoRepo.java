package br.com.alextayron.appmercado.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.alextayron.appmercado.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{
	
}
