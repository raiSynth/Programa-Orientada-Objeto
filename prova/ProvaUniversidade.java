/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade.prova;


public abstract class ProvaUniversidade {

    protected double av1;
    protected double av2;
    protected double av3;

    protected double pesoAv1;
    protected double pesoAv2;
    protected double pesoAv3;

    protected double mediaMinima;
    protected boolean realizouProvaFinal;

    public ProvaUniversidade(double av1, double av2, double av3) {
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }

    public abstract double calcularMedia();

    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }

    // Getters
    public double getAv1() { return av1; }
    public double getAv2() { return av2; }
    public double getAv3() { return av3; }

    public void setAv1(double av1) { this.av1 = av1; }
    public void setAv2(double av2) { this.av2 = av2; }
    public void setAv3(double av3) { this.av3 = av3; }
}
