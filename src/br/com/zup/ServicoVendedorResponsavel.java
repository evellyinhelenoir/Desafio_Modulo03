package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedorResponsavel {
    public static List<VendedorResponsável> vendedoresResponsaveis = new ArrayList<>();

    public static VendedorResponsável cadastrarVendedorResponsavel(String nome, String email, String cpf)throws Exception{
        validarEmail(email);
        VendedorResponsável vendedorResonsavel = new VendedorResponsável(nome, email, cpf);
        vendedoresResponsaveis.add(vendedorResonsavel);
        return vendedorResonsavel;
    }
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email inválido.");
        }
    }
}
