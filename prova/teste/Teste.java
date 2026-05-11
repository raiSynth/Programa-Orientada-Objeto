/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.prova.teste;

import com.mycompany.universidade.prova.*;

public class Teste {

    public static void main(String[] args) {

        ProvaUniversidade provaUcb = new ProvaUCB(6.0, 7.0, 8.0);
        ProvaUniversidade provaFafifo = new ProvaFafifo(5.0, 6.0, 4.0);

        System.out.println("===== UCB =====");
        System.out.println("Média: " + provaUcb.calcularMedia());
        System.out.println("Situação: " + 
            (provaUcb.aprovado() ? "Aprovado" : "Reprovado"));

        System.out.println("\n===== FAFIFO =====");
        System.out.println("Média: " + provaFafifo.calcularMedia());
        System.out.println("Situação: " + 
            (provaFafifo.aprovado() ? "Aprovado" : "Reprovado"));
    }
}