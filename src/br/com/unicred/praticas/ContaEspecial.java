package br.com.unicred.praticas;

public class ContaEspecial extends ContaCorrente{

    private double limite;
    
    public ContaEspecial(String numeroConta, double limite) {
        super(numeroConta);
        this.limite = limite;
    }

}
