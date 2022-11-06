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

import br.edu.unasp.model.Carrinho;
import br.edu.unasp.services.CarrinhoService;

@RestController
public class CarrinhoController {

    @Autowired
	private CarrinhoService carrinhoService;
	

	@GetMapping("/carrinho")
	public ResponseEntity<Iterable<Carrinho>> getCarrinho(){
		return ResponseEntity.ok().body(carrinhoService.getCarrinho());
	}
	
	@GetMapping("/carrinho/{id}")
	public ResponseEntity<Carrinho> getCarrinho(@PathVariable Integer id){
		return ResponseEntity.ok().body(carrinhoService.getCarrinho(id));
	}
	
	@PostMapping("/carrinho")
	public ResponseEntity<Void> adicionarCarrinho(@RequestBody Carrinho carrinho){
		carrinhoService.createCarrinho(carrinho);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PutMapping("/carrinho")
	public ResponseEntity<Void> atualizarCarrinho(@RequestBody Carrinho carrinho){
		carrinhoService.updateCarrinho(carrinho);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/carrinho/{id}")
	public ResponseEntity<Void> apagarCarrinho(@PathVariable Integer id){
		var carrinho = carrinhoService.getCarrinho(id);
		carrinhoService.deleteCarrinho(carrinho);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
