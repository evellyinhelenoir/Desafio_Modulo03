package br.com.zup;

public class Venda {
    Cliente cliente;
    VendedorResponsável vendResponsavel;
    double valor;
    String dataRegistro;

    public Venda(Cliente cliente, VendedorResponsável vendResponsavel, double valor, String dataRegistro) {
        this.cliente = cliente;
        this.vendResponsavel = vendResponsavel;
        this.valor = valor;
        this.dataRegistro = dataRegistro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public VendedorResponsável getVendResponsavel() {
        return vendResponsavel;
    }

    public void setVendResponsavel(VendedorResponsável vendResponsavel) {
        this.vendResponsavel = vendResponsavel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
