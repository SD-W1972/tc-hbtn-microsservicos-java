package com.example.jpa_h2_demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.lang.Long;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private int idade;
    private String email;

    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference
    private List<Telefone> telefones;

    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference
    private  List<Endereco> enderecos;

    public Cliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefones = new ArrayList<>();
        this.enderecos = new ArrayList<>();
    }

    public Cliente(){
        this.telefones = new ArrayList<>();
        this.enderecos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefones=" + telefones +
                ", enderecos=" + enderecos +
                '}';
    }
}
