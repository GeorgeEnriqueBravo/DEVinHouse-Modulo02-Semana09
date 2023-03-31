package org.devinhouse.ex05ao10.exercicio.models;

import jakarta.persistence.*;

@Entity(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    @ManyToOne
    private Categoria categoria;
}
