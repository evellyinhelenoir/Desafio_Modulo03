package br.com.zup;

public class Venda {
    Cliente cliente;
    VendedorResponsavel vendResponsavel;
    double valor;
    String dataRegistro;

    public Venda(Cliente cliente, VendedorResponsavel vendResponsavel, double valor, String dataRegistro) {
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

    public VendedorResponsavel getVendResponsavel() {
        return vendResponsavel;
    }

    public void setVendResponsavel(VendedorResponsavel vendResponsavel) {
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

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("--------------------");
        retorno.append("\nCliente: "+cliente);
        retorno.append("\nVendedor Responsável: "+vendResponsavel);
        retorno.append("\nValor da Venda: "+valor);
        retorno.append("\nData de Registro: "+dataRegistro+"\n");
        return retorno.toString();
    }
}
