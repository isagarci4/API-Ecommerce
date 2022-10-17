package br.edu.unasp.model;

import org.springframework.web.multipart.MultipartFile;

public class Produto {
        
    private Long id;
    private String nome;
    private String descricao;
    private Double valor;
    private MultipartFile imagem;

    public Produto(){
        super();
    }

    public Produto(Long id, String nome, String descricao, Double valor, MultipartFile imagem){
        super();

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.imagem = imagem;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
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

    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public MultipartFile getImagem(){
        return imagem;
    }

    public void setImagem(MultipartFile imagem){
        this.imagem = imagem;
    }
}
