package com.example.jpa_h2_demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

import java.lang.Long;


@Entity
@JsonPropertyOrder({"id", "ddd", "numero", "cliente"})
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String DDD;
    private String numero;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @JsonBackReference
    private Cliente cliente;

    public Telefone(String DDD, String numero, Cliente cliente) {
        this.DDD = DDD;
        this.numero = numero;
        this.cliente = cliente;
    }

    public Telefone(){}

    public Long getId() {
        return id;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "id=" + id +
                ", DDD='" + DDD + '\'' +
                ", numero=" + numero +
                ", cliente=" + cliente +
                '}';
    }
}
