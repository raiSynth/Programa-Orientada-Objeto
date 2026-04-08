/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    
    public Carro(String marca, String modelo, int ano, Motor motor){
        super(marca, modelo, ano, motor); //Construtor da superclasse
    }
    
    public void abrirPortas(){
        System.out.println("Abrindo as " + numeroPortas + " portas ");
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
    

