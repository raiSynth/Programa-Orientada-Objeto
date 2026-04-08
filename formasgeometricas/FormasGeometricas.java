/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formasgeometricas;

public class FormasGeometricas {
    protected String cor;

    public FormasGeometricas(String cor) {
        this.cor = cor;
    }

    public void exibirCor() {
        System.out.println("A cor da forma é: " + cor);
    }
    
    // Métodos que serão especializados nas subclasses
    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }
}

