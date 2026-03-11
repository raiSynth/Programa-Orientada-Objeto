/*2. Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.*/

import java.util.Scanner; //impotando classe Scanner

public class ex2 { // criação da classe
    public static void main(String[] args) { // inicio do programa
        Scanner sc = new Scanner(System.in); // cria um objeto scanner para ler dados
        double x, y, z, media; // declara variaveis

        // mostra mensagem e ler o valor digitado
        System.out.print("Digite o primeiro número:");
        x = sc.nextDouble();
        System.out.print("Digite o segundo número:");
        y = sc.nextDouble();
        System.out.print("Digite o terceiro número:");
        z = sc.nextDouble();

        // calcula a media
        media = (x + y + z) / 3.0;
        System.out.print("Media =" + media);
        sc.close();
    }

}


