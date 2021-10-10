package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedorResponsavel {
    public static List<VendedorResponsável> vendedoresResponsaveis = new ArrayList<>();

    public static VendedorResponsável cadastrarVendedorResponsavel(String nome, String email, String cpf){
        VendedorResponsável vendedorResonsavel = new VendedorResponsável(nome, email, cpf);
        vendedoresResponsaveis.add(vendedorResonsavel);
        return vendedorResonsavel;
    }
}
