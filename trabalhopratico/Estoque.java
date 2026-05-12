/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopratico;

public class Estoque {

    private static int contador = 1;

    private int idEstoque;
    private int quantidade;
    private int estoqueMinimo;

    public Estoque(int quantidade, int estoqueMinimo) {
        this.idEstoque = contador++;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente.");
        }
    }

    public void atualizarEstoque(int novaQuantidade, int novoMinimo) {
        this.quantidade = novaQuantidade;
        this.estoqueMinimo = novoMinimo;
    }

    public void exibirInfo() {
        System.out.println("ID: " + idEstoque);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Estoque Mínimo: " + estoqueMinimo);
    }
}