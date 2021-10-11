package br.com.zup;

import java.util.Scanner;

public class Sistema {

    // Métodos para receber input do usuário de forma eficiente.
    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    // Exibição de informações para o usuário.
    public static void menuInicial(){
        System.out.println("\nBem vindo ao programa de organização de vendas!\n" +
                "Digite 1 para gerenciar as Vendas.\n" +
                "Digite 2 para gerenciar os Clientes.\n" +
                "Digite 3 para gerenciar os Vendedores.\n" +
                "Digite 4 para fechar e sair do programa.\n");
    }

    // Exibição de informações para o usuário.
    public static void menuCliente(){
        System.out.println("\nDigite 1 para cadastrar um novo cliente.\n" +
                "Digite 2 para mostrar todos os clientes.\n" +
                "Digite 3 para mostrar todas as compras de um cliente.\n" +
                "Digite 4 para voltar.\n");
    }

    // Exibição de informações para o usuário.
    public static void menuVendedor(){
        System.out.println("\nDigite 1 para cadastrar um novo vendedor.\n" +
                "Digite 2 para mostrar todos os vendedores.\n" +
                "Digite 3 para mostrar pesquisar todas as vendas de um vendedor.\n" +
                "Digite 4 para voltar.\n");
    }

    // Exibição de informações para o usuário.
    public static void menuVendas(){
        System.out.println("\nDigite 1 para cadastrar uma nova venda.\n" +
                "Digite 2 para mostrar todas as vendas.\n" +
                "Digite 3 para voltar.");
    }

    // Método para cadastrar todos os clientes. Faz conjunto com o método de mesmo nome no Serviço Cliente.
    public static Cliente cadastrarClientes()throws Exception{
        String nome = capturarDados("Digite o nome do Cliente.").nextLine();
        String email = capturarDados("Digite o email do Cliente.").nextLine();
        String cpf = capturarDados("Digite o CPF do Cliente.").nextLine();
        return ServicoCliente.cadastrarClientes(nome, email, cpf);
    }

    // Método para cadastrar todos os vendedores. Faz conjunto com o método de mesmo nome no Serviço Vendedor Responsável.
    public static VendedorResponsavel cadastrarVendedorResponsavel() throws Exception{
        String nome = capturarDados("Digite o nome do Vendedor Responsável.").nextLine();
        String email = capturarDados("Digite o email do Vendedor Responsável.").nextLine();
        String cpf = capturarDados("Digite o CPF do Vendedor Responsável.").nextLine();
        return ServicoVendedorResponsavel.cadastrarVendedorResponsavel(nome, email, cpf);
    }

    // Método para cadastrar todas as vendas. Faz conjunto com o método de mesmo nome no Serviço Venda.
    public static Venda cadastrarVendas()throws Exception{
        double valor = capturarDados("Digite o valor da venda.").nextDouble();
        String dataRegistro = capturarDados("Digite a Data de Registro da venda.").nextLine();
        String emailCliente = capturarDados("Digite o email do Cliente.").nextLine();
        String emailVendedor = capturarDados("Digite o email do Vendedor Responsável.").nextLine();
        return ServicoVenda.cadastrarVendas(valor, dataRegistro,emailCliente,emailVendedor);
    }

    // Método de execução em loop boolean do programa.
    public static boolean executar()throws Exception{
        boolean loop = true;

        while (loop){
            menuInicial();
            int opcao = capturarDados("Digite a opção desejada.").nextInt();

            // Sessão de gerenciamento de todas as vendas.
            if (opcao == 1){

                boolean loopVendas = true;
                while (loopVendas){

                    menuVendas();
                    int opcaoVenda = capturarDados("Digite a opção desejada.").nextInt();

                    if (opcaoVenda == 1){
                        Venda venda = cadastrarVendas();
                        System.out.println(venda);

                    }else if (opcaoVenda == 2){
                        ServicoVenda.exibirVendas();

                    }else if (opcaoVenda == 3){
                        loopVendas = false;
                    }
                }

                // Sessão de gerenciamento de todos os clientes.
            }else if (opcao == 2){

                boolean loopCliente = true;
                while (loopCliente){

                    menuCliente();
                    int opcaoCliente = capturarDados("Digite a opção desejada.").nextInt();

                    if (opcaoCliente == 1){

                        Cliente cliente = cadastrarClientes();
                        System.out.println(cliente);

                    }else if (opcaoCliente == 2){
                        ServicoCliente.exibirClientes();

                    }else if (opcaoCliente == 3){
                        ServicoCliente.pesquisarComprasCliente(capturarDados("Digite o CPF do Cliente.").nextLine());

                    }else if (opcaoCliente == 4){
                        loopCliente = false;
                    }
                }

                // Sessão de gerenciamento de todos os vendedores.
            }else if (opcao == 3){

                boolean loopVendedores = true;
                while (loopVendedores){

                    menuVendedor();
                    int opcaoVendedores = capturarDados("Digite a opção desejada.").nextInt();

                    if (opcaoVendedores == 1){
                        VendedorResponsavel vendedor = cadastrarVendedorResponsavel();
                        System.out.println(vendedor);

                    }else if (opcaoVendedores == 2){
                        ServicoVendedorResponsavel.exibirVendedores();

                    }else if (opcaoVendedores == 3){
                        ServicoVendedorResponsavel.pesquisarVendasVendedor(capturarDados("Digite o email do Vendedor.").nextLine());

                    }else if (opcaoVendedores == 4){
                        loopVendedores = false;
                    }
                }

            // Finalizando o programa e exibindo mensagem de encerramento.
            }else if (opcao == 4){
                System.out.println("Obrigada por utilizar nossos serviços!");
                loop = false;
            }
        }return true;
    }
}
