/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.formasgeometricas;

public class Retangulo extends FormasGeometricas {
    private double base;
    private double altura;

    public Retangulo(String cor, double base, double altura) {
        super(cor); // Chama o construtor da superclasse [cite: 204, 210]
        this.base = base;
        this.altura = altura;
    }

    @Override // Sobrescrita de método [cite: 60, 166]
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

