package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    //Instanciando lista de clientes de forma estática para acessar ela ao redor do código.
    public static List<Cliente> clientes = new ArrayList<>();

    //Método para cadastrar todos os clientes. Faz conjunto com o método de mesmo nome no Sistema.
    public static Cliente cadastrarClientes(String nome, String email, String cpf)throws Exception{
        validarEmail(email);

        verificarEmailJaCadastrado(email);
        verificarCPFJaCadastrado(cpf);

        Cliente cliente = new Cliente(nome, email, cpf);
        clientes.add(cliente);
        return cliente;
    }

    // Verificação de email se contem @.
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email do cliente inválido.");
        }
    }

    // Verificação de email se já foi cadastrado.
    public static void verificarEmailJaCadastrado(String email)throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Email do cliente já cadastrado no sistema.");
            }
        }
    }

    // Verificação de CPF se já foi cadastrado.
    public static void verificarCPFJaCadastrado(String cpf)throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getCpf().equalsIgnoreCase(cpf)){
                throw new Exception("CPF do cliente já cadastrado no sistema.");
            }
        }
    }

    // Pesquisar todos os clientes cadastrados no sistema utilizando o email dele percorrendo a lista de clientes.
    public static Cliente pesquisarClientePorEmail(String email)throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                return referencia;
            }
        }
        throw new Exception("Email do cliente não cadastrado no sistema.");
    }

    // Exibir a lista completa de clientes.
    public static void exibirClientes(){
        clientes.forEach(System.out::println);
    }

    // Pesquisar todas as compras feitas pelo cliente utilizando o CPF dele percorrendo a lista de clientes.
    public static void pesquisarComprasCliente(String cpf)throws Exception{
        List<Venda> comprasRegist = new ArrayList<>();

        // Percorrendo a lista de Clientes dentro da lista de Vendas para comparar CPF.
        for (Venda referencia : ServicoVenda.vendas){
            if (referencia.getCliente().getCpf().equalsIgnoreCase(cpf)){
                comprasRegist.add(referencia);
                System.out.println(referencia);
            }
        }if (comprasRegist.isEmpty()){
            throw new Exception("Compra não encontrada ou CPF inválido.");
        }
    }
}
