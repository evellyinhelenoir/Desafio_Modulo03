package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    public static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVendas(double valor, String dataRegsitro, String emailCliente, String emailVendedor)throws Exception{
       Cliente cliente = ServicoCliente.pesquisarClientePorEmail(emailCliente);
       VendedorResponsavel vendedorResponsavel = ServicoVendedorResponsavel.pesquisarVendedorPorEmail(emailVendedor);
       Venda venda = new Venda(cliente, vendedorResponsavel, valor, dataRegsitro);
       vendas.add(venda);
       return venda;
    }
    public static void exibirVendas(){
        for (Venda referencia : vendas){
            System.out.println(referencia);
        }
    }

}
