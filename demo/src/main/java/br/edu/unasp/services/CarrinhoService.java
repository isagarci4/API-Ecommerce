package br.edu.unasp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unasp.model.Carrinho;
import br.edu.unasp.model.repository.CarrinhoRepository;
@Service
public class CarrinhoService {
    
    @Autowired
	private CarrinhoRepository repository;
	
	public Iterable<Carrinho> getCarrinho(){
		return repository.findAll();
	}
	
	public void createCarrinho(Carrinho carrinho) {
		repository.save(carrinho);
	}
	
	public Carrinho getCarrinho(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	public void updateCarrinho(Carrinho carrinho) {
		repository.save(carrinho);
	}
	
	public void deleteCarrinho(Carrinho carrinho) {
		repository.delete(carrinho);
	}

}
