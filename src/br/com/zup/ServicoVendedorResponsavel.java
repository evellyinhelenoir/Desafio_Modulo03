package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedorResponsavel {
    public static List<VendedorResponsável> vendedoresResponsaveis = new ArrayList<>();

    public static VendedorResponsável cadastrarVendedorResponsavel(String nome, String email, String cpf)throws Exception{
        validarEmail(email);

        verificarEmailJaCadastrado(email);
        verificarCPFJaCadastrado(cpf);

        VendedorResponsável vendedorResonsavel = new VendedorResponsável(nome, email, cpf);
        vendedoresResponsaveis.add(vendedorResonsavel);
        return vendedorResonsavel;
    }
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email inválido.");
        }
    }
    public static void verificarEmailJaCadastrado(String email)throws Exception{
        for (VendedorResponsável referencia : vendedoresResponsaveis){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Email já cadastrado no sistema.");
            }
        }
    }
    public static void verificarCPFJaCadastrado(String cpf)throws Exception{
        for (VendedorResponsável referencia : vendedoresResponsaveis){
            if (referencia.getCpf().equalsIgnoreCase(cpf)){
                throw new Exception("CPF já cadastrado no sistema.");
            }
        }
    }
    public static VendedorResponsável pesquisarVendedorPorEmail(String email)throws Exception{
        for (VendedorResponsável referencia : vendedoresResponsaveis){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                return referencia;
            }
        }
        throw new Exception("Email não cadastrado no sistema.");
    }
    public static void exibirVendedores(){
        for (VendedorResponsável referencia : vendedoresResponsaveis){
                System.out.println(referencia);
        }
    }
}
