package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    public static List<Cliente> clientes = new ArrayList<>();

    public static Cliente cadastrarClientes(String nome, String email, String cpf){
        Cliente cliente = new Cliente(nome, email, cpf);
        clientes.add(cliente);
        return cliente;
    }
}
