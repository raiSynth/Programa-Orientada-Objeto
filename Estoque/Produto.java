/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estoque;

/**
 *
 * @author raissa
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantEmEstoque;
    
    public Produto(String nome, double preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.quantEmEstoque = quant;
    }
    
    public void exibirinfo(){
        System.out.println("Nome do produto:" + nome);
        System.out.println("Nome do produto:" + preco);
        System.out.println("Nome do produto:" + quantEmEstoque);
        
    }
    
    public void addEstoque( int quant){
        quantEmEstoque +=quant;
    }
    
    public void remover(int quant){
        quantEmEstoque -= quant;
    }
    
}
