public class ContaCorrente {
    String nome;
    int numeroConta;
    int agencia;
    boolean vejaSaldo;
    
    public void saldo() {
        if (vejaSaldo == true) {
            System.out.println("Seu saldo é de: R$100,00");
        }
        else if (vejaSaldo == false) {
            System.out.println("A conta está aativa");
        }
    }

    public void status() {
        System.out.println("Nome do titula: " + this.nome);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Numero da conta: " + this.numeroConta);
        
    }
  
}
