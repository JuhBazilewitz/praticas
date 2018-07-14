package br.com.unicred.praticas;

public class ControleExecucao {

    public static void main(String[] args) {
        
        ContaCorrente objContaLeonardo;
        objContaLeonardo = new ContaCorrente("1234-5");
        
        ContaCorrente objContaThiago = new ContaCorrente("5544-8");
        
        System.out.println("Instanciamos contas.");
        
        String numero = objContaLeonardo.getNumeroConta();
        
        System.out.println("Numero da conta: " + numero);
        
        System.out.println(ContaCorrente.getQdtContas());
        
    }
}
