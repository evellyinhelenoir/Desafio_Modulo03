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
            throw new Exception("Email inválido.");
        }
    }
    public static void verificarEmailJaCadastrado(String email)throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Email já cadastrado no sistema.");
            }
        }
    }
    public static void verificarCPFJaCadastrado(String cpf)throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getCpf().equalsIgnoreCase(cpf)){
                throw new Exception("CPF já cadastrado no sistema.");
            }
        }
    }
    public static Cliente pesquisarClientePorEmail(String email)throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                return referencia;
            }
        }
        throw new Exception("Email não cadastrado no sistema.");
    }
    public static void exibirClientes(){
        for (Cliente referencia : clientes){
            System.out.println(referencia);
        }
    }
}
