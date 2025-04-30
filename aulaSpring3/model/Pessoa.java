package com.example.projeto.model;
import java.lang.annotation.Inherited;
import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="pessoas")
public class Pessoa{

    @id
    @GeneratedValue(strategy = GenerationType.INDETITY)
    private Long id;

    private String nome;
    private Intenger idade;

    public Pessoa(){}

    public Pessoa(String nome, Intenger idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(Intenger idade) {
        this.idade = idade;
    }

    public Intenger getIdade() {
        return idade;
    }
}