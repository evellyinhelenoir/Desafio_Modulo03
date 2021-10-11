package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    public static List<Cliente> clientes = new ArrayList<>();

    public static Cliente cadastrarClientes(String nome, String email, String cpf)throws Exception{
        validarEmail(email);

        verificarEmailJaCadastrado(email);
        verificarCPFJaCadastrado(cpf);

        Cliente cliente = new Cliente(nome, email, cpf);
        clientes.add(cliente);
        return cliente;
    }
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email do cliente inválido.");
        }
    }
    public static void verificarEmailJaCadastrado(String email)throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Email do cliente já cadastrado no sistema.");
            }
        }
    }
    public static void verificarCPFJaCadastrado(String cpf)throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getCpf().equalsIgnoreCase(cpf)){
                throw new Exception("CPF do cliente já cadastrado no sistema.");
            }
        }
    }
    public static Cliente pesquisarClientePorEmail(String email)throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                return referencia;
            }
        }
        throw new Exception("Email do cliente não cadastrado no sistema.");
    }
    public static void exibirClientes(){
        clientes.forEach(System.out::println);
    }
    public static void pesquisarComprasCliente(String cpf)throws Exception{
        for (Venda referencia : ServicoVenda.vendas){
            if (referencia.getCliente().getCpf().equalsIgnoreCase(cpf)){
                System.out.println(referencia);
            }
        }throw new Exception("Compra não encontrada ou cpf inválido.");
    }
}
