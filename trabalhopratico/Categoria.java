/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopratico;

public class Categoria {

    private static int contador = 1;

    private int idCategoria;
    private String nomeCategoria;

    public Categoria(String nomeCategoria) {
        this.idCategoria = contador++;
        this.nomeCategoria = nomeCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void atualizarCategoria(String novoNome) {
        this.nomeCategoria = novoNome;
    }

    public void exibirInfo() {
        System.out.println("ID: " + idCategoria);
        System.out.println("Nome Categoria: " + nomeCategoria);
    }
}