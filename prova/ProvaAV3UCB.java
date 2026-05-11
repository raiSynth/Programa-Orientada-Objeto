/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade);
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return true; // Pode fazer mesmo aprovado
    }

    public double calcularNovaMedia() {

        double av1 = provaUniversidade.getAv1();
        double av2 = provaUniversidade.getAv2();

        // Substitui menor nota entre AV1 e AV2
        if (notaProvaFinal > av1 && av1 <= av2) {
            av1 = notaProvaFinal;
        } else if (notaProvaFinal > av2) {
            av2 = notaProvaFinal;
        }

        // Média das duas maiores
        return (av1 + av2) / 2;
    }
}