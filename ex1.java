/*1. Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses
números.*/

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // scanner lendo as entradas
        int n1, n2, n3, n4, soma; 

        System.out.print("Digite 4 numeros:");
         n1 = sc.nextInt();
         n2 = sc.nextInt();
         n3 = sc.nextInt();
         n4 = sc.nextInt();
         soma = n1 + n2 + n3 + n4;

        System.out.print("A soma é: =" + soma); // saida do resultado 

        sc.close(); // Fechando scanner 

    }
}