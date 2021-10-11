package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedorResponsavel {

    //Instanciando lista de clientes de forma estática para acessar ela ao redor do código.
    public static List<VendedorResponsavel> vendedoresResponsaveis = new ArrayList<>();

    //Método para cadastrar todos os vendedores. Faz conjunto com o método de mesmo nome no Sistema.
    public static VendedorResponsavel cadastrarVendedorResponsavel(String nome, String email, String cpf)throws Exception{
        validarEmail(email);

        verificarEmailJaCadastrado(email);
        verificarCPFJaCadastrado(cpf);

        VendedorResponsavel vendedorResonsavel = new VendedorResponsavel(nome, email, cpf);
        vendedoresResponsaveis.add(vendedorResonsavel);
        return vendedorResonsavel;
    }

    // Verificação de email se contem @.
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email do vendedor inválido.");
        }
    }

    // Verificação de email se já foi cadastrado.
    public static void verificarEmailJaCadastrado(String email)throws Exception{
        for (VendedorResponsavel referencia : vendedoresResponsaveis){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Email do vendedor já cadastrado no sistema.");
            }
        }
    }

    // Verificação de CPF se já foi cadastrado.
    public static void verificarCPFJaCadastrado(String cpf)throws Exception{
        for (VendedorResponsavel referencia : vendedoresResponsaveis){
            if (referencia.getCpf().equalsIgnoreCase(cpf)){
                throw new Exception("CPF do vendedor já cadastrado no sistema.");
            }
        }
    }

    // Pesquisar todos os vendedores cadastrados no sistema utilizando o email dele percorrendo a lista de vendedores.
    public static VendedorResponsavel pesquisarVendedorPorEmail(String email)throws Exception{
        for (VendedorResponsavel referencia : vendedoresResponsaveis){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                return referencia;
            }
        }
        throw new Exception("Email do vendedor não cadastrado no sistema.");
    }

    // Exibir a lista completa de vendedores.
    public static void exibirVendedores(){
        vendedoresResponsaveis.forEach(System.out::println);
    }

    // Pesquisar todas as vendas feitas por vendedores utilizando o EMAIL dele percorrendo a lista de vendedores.
    public static void pesquisarVendasVendedor(String email)throws Exception{
        List<Venda> vendasRegist = new ArrayList<>();

        for (Venda referencia : ServicoVenda.vendas) {

            // Percorrendo a lista de Vendedores dentro da lista de Vendas para comparar EMAIL.
            if (referencia.getVendResponsavel().getEmail().equalsIgnoreCase(email)) {
                vendasRegist.add(referencia);
                System.out.println(referencia);
            }
        }if (vendasRegist.isEmpty()){
            throw new Exception("Venda não encontrada ou email inválido.");
        }
    }
}
