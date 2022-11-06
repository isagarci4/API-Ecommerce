package br.edu.unasp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="CARRINHO")
public class Carrinho {
    
    @Id
	@GeneratedValue
    private Integer id;
    private String produto;
    private Float preco;
    private Integer quantidade;
    private String imagem;

    public Carrinho(){
        super();
    }

    public Carrinho(Integer id, String produto, Float preco, Integer quantidade, String imagem){
        super();

        this.id = id;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imagem = imagem;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getProduto(){
        return produto;
    }

    public void setProduto(String produto){
        this.produto = produto;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
