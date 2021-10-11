package br.com.zup;

public class Cliente {
    private String nome;
    private String email;
    private String cpf;

    public Cliente(String nome, String email, String cpf) {
        this.email = email;
        this.cpf = cpf;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome do Consumidor: "+nome);
        retorno.append("\nEmail do Consumidor: "+email);
        retorno.append("\nCPF do Consumidor: "+cpf+"\n");
        return retorno.toString();
   }
}
