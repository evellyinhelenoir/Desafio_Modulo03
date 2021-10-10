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
    public static Cliente cadastrarClientes()throws Exception{
        String nome = capturarDados("Digite o nome do Cliente.").nextLine();
        String email = capturarDados("Digite o email do Cliente.").nextLine();
        String cpf = capturarDados("Digite o CPF do Cliente.").nextLine();
        return ServicoCliente.cadastrarClientes(nome, email, cpf);
    }
    public static VendedorResponsável cadastrarVendedorResponsavel() throws Exception{
        String nome = capturarDados("Digite o nome do Vendedor Responsável.").nextLine();
        String email = capturarDados("Digite o email do Vendedor Responsável.").nextLine();
        String cpf = capturarDados("Digite o CPF do Vendedor Responsável.").nextLine();
        return ServicoVendedorResponsavel.cadastrarVendedorResponsavel(nome, email, cpf);
    }
}
