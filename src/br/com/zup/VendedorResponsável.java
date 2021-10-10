package br.com.zup;

public class VendedorResponsável {
    private String nome;
    private String email;
    private String cpf;

    public VendedorResponsável(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Vendedor Responsável: "+nome);
        retorno.append("Email do Vendedor Responsável: "+email);
        retorno.append("CPF do Vendedor Responsável: "+cpf);
        return retorno.toString();
    }
}
