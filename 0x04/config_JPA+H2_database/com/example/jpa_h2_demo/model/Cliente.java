package com.example.jpa_h2_demo.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private int idade;
    private String email;

    @OneToMany
    private List<Telefone> telefoneList;

    @OneToMany
    private  List<Endereco> enderecoList;

    public Cliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefoneList = new ArrayList<>();
        this.enderecoList = new ArrayList<>();
    }

    public Cliente(){
        this.telefoneList = new ArrayList<>();
        this.enderecoList = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
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

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefoneList=" + telefoneList +
                ", enderecoList=" + enderecoList +
                '}';
    }
}
