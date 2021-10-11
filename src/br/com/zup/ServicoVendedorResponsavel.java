package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedorResponsavel {
    public static List<VendedorResponsavel> vendedoresResponsaveis = new ArrayList<>();

    public static VendedorResponsavel cadastrarVendedorResponsavel(String nome, String email, String cpf)throws Exception{
        validarEmail(email);

        verificarEmailJaCadastrado(email);
        verificarCPFJaCadastrado(cpf);

        VendedorResponsavel vendedorResonsavel = new VendedorResponsavel(nome, email, cpf);
        vendedoresResponsaveis.add(vendedorResonsavel);
        return vendedorResonsavel;
    }
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email do vendedor inválido.");
        }
    }
    public static void verificarEmailJaCadastrado(String email)throws Exception{
        for (VendedorResponsavel referencia : vendedoresResponsaveis){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Email do vendedor já cadastrado no sistema.");
            }
        }
    }
    public static void verificarCPFJaCadastrado(String cpf)throws Exception{
        for (VendedorResponsavel referencia : vendedoresResponsaveis){
            if (referencia.getCpf().equalsIgnoreCase(cpf)){
                throw new Exception("CPF do vendedor já cadastrado no sistema.");
            }
        }
    }
    public static VendedorResponsavel pesquisarVendedorPorEmail(String email)throws Exception{
        for (VendedorResponsavel referencia : vendedoresResponsaveis){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                return referencia;
            }
        }
        throw new Exception("Email do vendedor não cadastrado no sistema.");
    }
    public static void exibirVendedores(){
        vendedoresResponsaveis.forEach(System.out::println);
    }
    public static void pesquisarVendasVendedor(String email)throws Exception{
        for (Venda referencia : ServicoVenda.vendas){
            if (referencia.getVendResponsavel().getEmail().equalsIgnoreCase(email)){
                System.out.println(referencia);
            }
        }throw new Exception("Vendedor ou venda não encontrada.");
    }
}
