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
                "Digite 4 para fechar e sair do programa.\n");
    }
    public static void menuCliente(){
        System.out.println("Digite 1 para cadastrar um novo cliente.\n" +
                "Digite 2 para mostrar todos os clientes.\n" +
                "Digite 3 para voltar.\n");
    }
    public static void menuVendedor(){
        System.out.println("Digite 1 para cadastrar um novo vendedor.\n" +
                "Digite 2 para mostrar todos os vendedores.\n" +
                "Digite 3 para voltar.\n");
    }
    public static void menuVendas(){
        System.out.println("Digite 1 para cadastrar uma nova venda.\n" +
                "Digite 2 para mostrar todas as vendas.\n" +
                "Digite 3 para voltar.\n");
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
    public static Venda cadastrarVendas()throws Exception{
        double valor = capturarDados("Digite o valor da venda.").nextDouble();
        String dataRegistro = capturarDados("Digite a Data de Registro da venda.").nextLine();
        String emailCliente = capturarDados("Digite o email do Cliente.").nextLine();
        String emailVendedor = capturarDados("Digite o email do Vendedor Responsável.").nextLine();
        return ServicoVenda.cadastrarVendas(valor, dataRegistro,emailCliente,emailVendedor);
    }
    public static boolean executar()throws Exception{
        boolean loop = true;
        int opcao = capturarDados("Digite a opção desejada.").nextInt();
        while (loop){
            menuInicial();
            if (opcao == 1){

            }else if (opcao == 2){

                boolean loopCliente = true;
                int opcaoCliente = capturarDados("Digite a opção desejada.").nextInt();
                while (loopCliente){
                    menuCliente();
                    if (opcaoCliente == 1){
                        cadastrarClientes();
                    }else if (opcaoCliente == 2){
                        ServicoCliente.exibirClientes();
                    }else if (opcaoCliente == 3){
                        loopCliente = false;
                    }
                }

            }else if (opcao == 3){

                boolean loopVendedores = true;
                int opcaoVendedores = capturarDados("Digite a opção desejada.").nextInt();
                while (loopVendedores){
                    menuVendedor();
                    if (opcaoVendedores == 1){
                        cadastrarVendedorResponsavel();
                    }else if (opcaoVendedores == 2){
                        ServicoVendedorResponsavel.exibirVendedores();
                    }else if (opcaoVendedores == 3){
                        loopVendedores = false;
                    }
                }

            }else if (opcao == 4){
                System.out.println("Obrigada por utilizar nossos serviços!");
                loop = false;
            }
        }return true;
    }
}
