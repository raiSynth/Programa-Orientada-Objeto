/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animais;

/**
 *
 * @author raissa
 */
    public class cachorro extends Animal {
    private String raca;

    public cachorro(String nome, int idade, String raca) {
        // O super chama o construtor do Animal
        super(nome, idade); 
        this.raca = raca;
    }

    // Método específico do cachorro
    public void latir() {
        System.out.println("O cachorro " + nome + " (" + raca + ") está latindo: Au Au!");
    }

    // Getters e Setters se precisar
    public void setRaca(String raca) {
        this.raca = raca;
    }
}

