/* 5. Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e
mostre o valor do aumento e o novo salário.*/

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        System.out.println("Digite o valor do salario:"); // Recebe o valor do salario

        Scanner entrada = new Scanner(System.in);

        float salario = entrada.nextFloat();

        System.out.println("Digite o percentual do aumento:"); // Recebe o percentual de aumento

        float percentual = entrada.nextFloat();

        float aumento = salario * (percentual / 100); // Calcula percentual para que se converta em porcentgagem

        float novosalario = salario + aumento; // Calcula novo salario

        System.out.printf("O valor do aumento é:" + aumento); // Imprime valor do aumento,em ate 2 casa decimais
                                                                    // apos a virgula

        System.out.println("O novo salario é:" + novosalario);

        entrada.close();

    }
}