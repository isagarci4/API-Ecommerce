package br.edu.unasp.services;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.unasp.model.Produto;
import br.edu.unasp.model.repository.ProdutoRepository;

public class ProdutoService {
    
    @Autowired
	private ProdutoRepository repository;
	
	public Iterable<Produto> getProdutos(){
		return repository.findAll();
	}
	
	public void createProduto(Produto produto) {
		repository.save(produto);
	}
	
	public Produto getProduto(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void updateProduto(Produto produto) {
		repository.save(produto);
	}
	
	public void deleteProduto(Produto produto) {
		repository.delete(produto);
	}

}
