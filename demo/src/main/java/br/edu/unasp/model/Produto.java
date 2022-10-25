package br.edu.unasp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

@Entity(name="PRODUTO")
public class Produto {
    
    @Id
	@GeneratedValue
    private Integer id;
    private String nome;
    private String descricao;
    private Float valor;
    private MultipartFile imagem;

    public Produto(){
        super();
    }

    public Produto(Integer id, String nome, String descricao, Float valor, MultipartFile imagem){
        super();

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.imagem = imagem;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;

    }

    public Float getValor(){
        return valor;
    }

    public void setValor(Float valor){
        this.valor = valor;
    }

    public MultipartFile getImagem(){
        return imagem;
    }

    public void setImagem(MultipartFile imagem){
        this.imagem = imagem;
    }
}
