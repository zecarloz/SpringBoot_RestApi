package com.api.produto.repositorio;

import com.api.produto.modelo.ProdutoModelo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo,Integer> {
	//listar todos os produtos
	List<ProdutoModelo>findAll();
	
	//Pesquisar por codigo
	ProdutoModelo findByCodigo(int codigo);
	
	//remover produto
	void delete(ProdutoModelo produto);
	
	//Cadastrar /alterar produto
	<ProdMod extends ProdutoModelo> ProdMod save(ProdMod produto);
	
}
