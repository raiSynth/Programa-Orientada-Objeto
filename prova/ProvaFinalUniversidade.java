/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.prova;

public abstract class ProvaFinalUniversidade {

    protected double notaProvaFinal;
    protected double pesoProvaFinal;
    protected boolean realizouProva;
    protected ProvaUniversidade provaUniversidade;

    public ProvaFinalUniversidade(ProvaUniversidade provaUniversidade) {
        this.provaUniversidade = provaUniversidade;
    }

    public abstract boolean habilitadoRealizarProva();

    public void setNotaProvaFinal(double nota) {
        this.notaProvaFinal = nota;
        this.realizouProva = true;
    }
}
