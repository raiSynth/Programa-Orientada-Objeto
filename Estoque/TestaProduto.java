/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estoque;

/**
 *
 * @author raissa
 */
public class TestaProduto {

    public static void main(String[] args) {
     //criar dois produtos
     Produto p1 = new Produto("Monitor 24", 900, 10);
     Produto p2 = new Produto("CPU", 300, 25);
     Produto p3 = new Produto("Mouse",30.5, 50);
     
     //exibir info
     p1.exibirinfo();
     System.out.println("*******************");
     p2.exibirinfo();
     System.out.println("*******************");
     p3.exibirinfo();
     
    }
}
