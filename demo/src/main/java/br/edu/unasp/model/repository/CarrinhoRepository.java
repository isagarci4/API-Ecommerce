package br.edu.unasp.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.unasp.model.Carrinho;

@Repository
public interface CarrinhoRepository extends CrudRepository<Carrinho, Integer>  {
    
}
