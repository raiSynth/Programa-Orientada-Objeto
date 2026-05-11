/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.prova;

public class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade);
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return !provaUniversidade.aprovado();
    }

    public double calcularNovaMedia() {

        if (!habilitadoRealizarProva()) {
            return provaUniversidade.calcularMedia();
        }

        double soma =
            provaUniversidade.getAv1() +
            provaUniversidade.getAv2() +
            notaProvaFinal;

        return soma / 3;
    }
}
