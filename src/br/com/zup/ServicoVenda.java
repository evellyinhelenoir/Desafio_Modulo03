package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {

    //Instanciando lista de clientes de forma estática para acessar ela ao redor do código.
    public static List<Venda> vendas = new ArrayList<>();

    //Método para cadastrar todas as vendas/compras. Faz conjunto com o método de mesmo nome no Sistema.
    public static Venda cadastrarVendas(double valor, String dataRegsitro, String emailCliente, String emailVendedor)throws Exception{
       Cliente cliente = ServicoCliente.pesquisarClientePorEmail(emailCliente);
       VendedorResponsavel vendedorResponsavel = ServicoVendedorResponsavel.pesquisarVendedorPorEmail(emailVendedor);
       Venda venda = new Venda(cliente, vendedorResponsavel, valor, dataRegsitro);
       vendas.add(venda);
       return venda;
    }

    //Exibir a lista completa de vendas/compras
    public static void exibirVendas(){
        vendas.forEach(System.out::println);
    }
}
