package com.bn.crud.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_aluno")
public class Estudantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    private Integer idade;

    public Estudantes(long id, String nome, String email, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
