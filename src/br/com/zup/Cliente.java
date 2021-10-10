package br.com.zup;

public class Cliente {
    private String email;
    private String cpf;

    public Cliente(String email, String cpf) {
        this.email = email;
        this.cpf = cpf;
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
}
