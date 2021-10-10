package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    public static List<Cliente> clientes = new ArrayList<>();

    public static Cliente cadastrarClientes(String nome, String email, String cpf)throws Exception{
        validarEmail(email);
        Cliente cliente = new Cliente(nome, email, cpf);
        clientes.add(cliente);
        return cliente;
    }
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email inválido.");
        }
    }
}
