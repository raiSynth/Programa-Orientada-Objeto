/*3. Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média
ponderada.*/

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        System.out.println("Digite a primeira nota:");

        Scanner entrada = new Scanner(System.in); /* criando o scanner pra ler notas e pesos */

        float nota1 = entrada.nextFloat(); /* Aqui le somente a primeira nota */

        System.out.println("Digite a segunda nota:");

        float nota2 = entrada.nextFloat(); /* Aqui le somente a segunda nota */

        System.out.println("Digite a terceira nota:");

        float nota3 = entrada.nextFloat(); /* Aqui le somente a terceira nota */

        System.out.println("Digite o peso da nota 1"); /* Aqui abaixo vai ler todos os pesos de forma separada */

        float peso1 = entrada.nextFloat();

        System.out.println("Digite o peso da nota 2");

        float peso2 = entrada.nextFloat();

        System.out.println("Digite o peso da nota 3");

        float peso3 = entrada.nextFloat();

        float media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3); //calculo da media e pesos
        System.out.println("A média ponderada é:" + media);

        entrada.close(); /* Fechando o scanner */

    }
}
