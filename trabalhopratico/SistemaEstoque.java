/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopratico;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEstoque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Estoque> estoques = new ArrayList<>();
        ArrayList<Categoria> categorias = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===============================");
            System.out.println("      SISTEMA DE ESTOQUE      ");
            System.out.println("===============================");

            System.out.println("\n--- ESTOQUE ---");
            System.out.println("1 - Cadastrar Estoque");
            System.out.println("2 - Listar Estoques");
            System.out.println("3 - Atualizar Estoque");
            System.out.println("4 - Remover Estoque");

            System.out.println("\n--- CATEGORIA ---");
            System.out.println("5 - Cadastrar Categoria");
            System.out.println("6 - Listar Categorias");
            System.out.println("7 - Atualizar Categoria");
            System.out.println("8 - Remover Categoria");

            System.out.println("\n--- PRODUTOS ---");
            System.out.println("9 - Cadastrar Produto");
            System.out.println("10 - Listar Produtos");
            System.out.println("11 - Atualizar Produto");
            System.out.println("12 - Remover Produto");

            System.out.println("\n0 - Sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                //ESTOQUE

                case 1:
                    System.out.print("Quantidade: ");
                    int qtd = Integer.parseInt(sc.nextLine());

                    System.out.print("Estoque mínimo: ");
                    int min = Integer.parseInt(sc.nextLine());

                    estoques.add(new Estoque(qtd, min));
                    System.out.println("Estoque cadastrado!");
                    break;

                case 2:
                    for (Estoque e : estoques) {
                        e.exibirInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 3:
                    System.out.print("Digite ID do Estoque: ");
                    int idEst = Integer.parseInt(sc.nextLine());

                    for (Estoque e : estoques) {
                        if (e.getIdEstoque() == idEst) {
                            System.out.print("Nova quantidade: ");
                            int novaQtd = Integer.parseInt(sc.nextLine());
                            System.out.print("Novo mínimo: ");
                            int novoMin = Integer.parseInt(sc.nextLine());
                            e.atualizarEstoque(novaQtd, novoMin);
                            System.out.println("Estoque atualizado!");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite ID do Estoque: ");
                    int idEstRem = Integer.parseInt(sc.nextLine());
                    estoques.removeIf(e -> e.getIdEstoque() == idEstRem);
                    System.out.println("Estoque removido!");
                    break;

                //CATEGORIA

                case 5:
                    System.out.print("Nome Categoria: ");
                    categorias.add(new Categoria(sc.nextLine()));
                    System.out.println("Categoria cadastrada!");
                    break;

                case 6:
                    for (Categoria c : categorias) {
                        c.exibirInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 7:
                    System.out.print("Digite ID da Categoria: ");
                    int idCat = Integer.parseInt(sc.nextLine());

                    for (Categoria c : categorias) {
                        if (c.getIdCategoria() == idCat) {
                            System.out.print("Novo nome: ");
                            c.atualizarCategoria(sc.nextLine());
                            System.out.println("Categoria atualizada!");
                        }
                    }
                    break;

                case 8:
                    System.out.print("Digite ID da Categoria: ");
                    int idCatRem = Integer.parseInt(sc.nextLine());
                    categorias.removeIf(c -> c.getIdCategoria() == idCatRem);
                    System.out.println("Categoria removida!");
                    break;

                //PRODUTO

                case 9:
                    if (categorias.isEmpty() || estoques.isEmpty()) {
                        System.out.println("Cadastre ao menos uma categoria e um estoque primeiro!");
                        break;
                    }

                    System.out.print("Nome Produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = Double.parseDouble(sc.nextLine());

                    System.out.println("Escolha ID da Categoria:");
                    categorias.forEach(c -> System.out.println("ID: " + c.getIdCategoria() + " - " + c.getNomeCategoria()));
                    int idCategoria = Integer.parseInt(sc.nextLine());

                    System.out.println("Escolha ID do Estoque:");
                    estoques.forEach(e -> System.out.println("ID: " + e.getIdEstoque()));
                    int idEstoque = Integer.parseInt(sc.nextLine());

                    Categoria categoriaEscolhida = null;
                    Estoque estoqueEscolhido = null;

                    for (Categoria c : categorias)
                        if (c.getIdCategoria() == idCategoria)
                            categoriaEscolhida = c;

                    for (Estoque e : estoques)
                        if (e.getIdEstoque() == idEstoque)
                            estoqueEscolhido = e;

                    if (categoriaEscolhida != null && estoqueEscolhido != null) {
                        produtos.add(new Produto(nome, descricao, preco, categoriaEscolhida, estoqueEscolhido));
                        System.out.println("Produto cadastrado!");
                    } else {
                        System.out.println("Categoria ou Estoque inválido.");
                    }
                    break;

                case 10:
                    for (Produto p : produtos) {
                        p.exibirInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 11:
                    System.out.print("Digite ID do Produto: ");
                    int idProd = Integer.parseInt(sc.nextLine());

                    for (Produto p : produtos) {
                        if (p.getId() == idProd) {
                            System.out.print("Novo nome: ");
                            String novoNome = sc.nextLine();
                            System.out.print("Nova descrição: ");
                            String novaDesc = sc.nextLine();
                            System.out.print("Novo preço: ");
                            double novoPreco = Double.parseDouble(sc.nextLine());
                            p.atualizarProduto(novoNome, novaDesc, novoPreco);
                            System.out.println("Produto atualizado!");
                        }
                    }
                    break;

                case 12:
                    System.out.print("Digite ID do Produto: ");
                    int idProdRem = Integer.parseInt(sc.nextLine());
                    produtos.removeIf(p -> p.getId() == idProdRem);
                    System.out.println("Produto removido!");
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}