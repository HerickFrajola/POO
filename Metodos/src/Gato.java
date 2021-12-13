public class Gato {
    String apelido;
    String pelo;
    String cor;
    int idade;
    float peso;
    boolean arrepiado;
    boolean miando;

    public void bravo() {
        if (arrepiado == true){
            System.out.println("O gato " + this.apelido + " está bravo ");
        }
        
        else if (arrepiado == false) {
            System.out.println("O gato " + this.apelido + " está calmo");
        }
    }

    public void fome() {
        if (miando == true) {
            System.out.println("O gato " + this.apelido + " está com fome");
        }

        else {
            System.out.println("O gato " + this.apelido + " está cheio");
        }
    }
    
    public void status() {
        System.out.println("O nome do gato é " + this.apelido);
        System.out.println("O jeito do pelo do é: " + this.pelo);
        System.out.println("A cor do pelo é: " + this.cor);
        System.out.println("A idade de " + this.apelido + " é de: " + this.idade + " anos");
        System.out.println(this.apelido + " pesa: " + this.peso);

        
    }
  
}
