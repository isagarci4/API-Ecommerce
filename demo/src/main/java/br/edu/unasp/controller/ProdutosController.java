package br.edu.unasp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unasp.model.Produto;
import br.edu.unasp.services.ProdutoService;

@RestController
public class ProdutosController {

    @Autowired
	private ProdutoService produtoService;
	

	@GetMapping("/produtos")
	public ResponseEntity<Iterable<Produto>> getProdutos(){
		return ResponseEntity.ok().body(produtoService.getProdutos());
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> getProduto(@PathVariable Integer id){
		return ResponseEntity.ok().body(produtoService.getProduto(id));
	}
	
	@PostMapping("/produtos")
	public ResponseEntity<Void> adicionarProduto(@RequestBody Produto produto){
		produtoService.createProduto(produto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PutMapping("/produtos")
	public ResponseEntity<Void> atualizarProduto(@RequestBody Produto produto){
		produtoService.updateProduto(produto);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/produtos/{id}")
	public ResponseEntity<Void> apagarProduto(@PathVariable Integer id){
		var produto = produtoService.getProduto(id);
		produtoService.deleteProduto(produto);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
