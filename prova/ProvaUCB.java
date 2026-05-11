/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.prova;

public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double av1, double av2, double av3) {
        super(av1, av2, av3);
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 1;
        this.mediaMinima = 7.0;
    }

    @Override
    public double calcularMedia() {
        return (av1 * pesoAv1 + av2 * pesoAv2 + av3 * pesoAv3) /
               (pesoAv1 + pesoAv2 + pesoAv3);
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }
}
