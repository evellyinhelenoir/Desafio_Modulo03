package br.com.zup;

import java.util.Scanner;

public class Sistema {
    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menuInicial(){
        System.out.println("\nBem vindo ao programa de organização de vendas!\n" +
                "Digite 1 para gerenciar as Vendas.\n" +
                "Digite 2 para gerenciar os Clientes.\n" +
                "Digite 3 para gerenciar os Vendedores.\n" +
                "Digite 4 para fechar e sair do programa.");
    }
}
