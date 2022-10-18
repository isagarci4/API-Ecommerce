package br.edu.unasp.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.unasp.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long>  {
    
}
