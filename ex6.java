/* 6. Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a
receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga
imposto de 7% sobre este salário.*/

import java.util.Scanner; //impotando classe Scanner

public class ex6 {
    public static void main(String[] args) { // inicio do programa
        Scanner sc = new Scanner(System.in); // cria um objeto scanner para ler dados
        float sal, salreceber, grat, imp; //daclara variaveis

        // mostra mensagem e ler o valor digitado
        System.out.print("Digite o salario:");
        sal = sc.nextFloat();
        // Calcula a gratificacao
        grat = sal * 5 / 100;
        // Calcula o imposto
        imp = sal * 7 / 100;
        // Calcula o salario a receber
        salreceber = sal + grat - imp;
        System.out.print("Salario a receber:=" + salreceber);
        sc.close();

    }
}
