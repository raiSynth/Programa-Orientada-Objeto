package com.mycompany.formasgeometricas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class app {
    public static void main(String[] args) {
        // Criando um Retângulo azul
        Retangulo ret = new Retangulo("Azul", 5.0, 3.0);
        ret.exibirCor();
        System.out.println("Área do Retângulo: " + ret.calcularArea());
        System.out.println("Perímetro do Retângulo: " + ret.calcularPerimetro());

        System.out.println("--------------------");

        // Criando um Círculo vermelho
        Circulo circ = new Circulo("Vermelho", 4.0);
        circ.exibirCor();
        System.out.println("Área do Círculo: " + circ.calcularArea());
        System.out.println("Perímetro do Círculo: " + circ.calcularPerimetro());
    }
}

