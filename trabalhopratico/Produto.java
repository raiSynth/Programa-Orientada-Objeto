/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopratico;

public class Produto {

    private static int contador = 1;

    private int id;
    private String nome;
    private String descricao;
    private double preco;

    private Categoria categoria;
    private Estoque estoque;

    public Produto(String nome, String descricao, double preco,
                   Categoria categoria, Estoque estoque) {

        this.id = contador++;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void atualizarProduto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void exibirInfo() {

        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.printf("Preço: R$ %.2f%n", preco);

        System.out.println("Categoria: " + categoria.getNomeCategoria());
        System.out.println("Quantidade em Estoque: " + estoque.getQuantidade());
    }
}