public class Carro {
    String modelo;
    String cor;
    int aro;
    float velocidade;
    boolean motor;

    public void ligado() {
        if (motor == true){
            System.out.println("O carro está ligado");
        }

        else if (motor == false){
            System.out.println("O carro está desligado");
        }

    }

    public void status() {
        System.out.println("O modelo do carro é: " + this.modelo);
        System.out.println("A cor do carro é: " + this.cor);
        System.out.println("O aro do carro é: " + this.aro);
        System.out.println("A velocidade é: " + this.velocidade);
        

    }
    
}
