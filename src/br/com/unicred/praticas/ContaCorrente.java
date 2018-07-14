package br.com.unicred.praticas;

public class ContaCorrente {

    protected String numeroConta;
    private double saldo;
    private String titular;
    private static int qtdContas;
    
    public ContaCorrente(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
        qtdContas++;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public static int getQdtContas() {
        return qtdContas;
    }
}
