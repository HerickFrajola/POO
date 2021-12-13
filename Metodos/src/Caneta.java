public class Caneta {
    String cor;
    String marca;
    float ponta;
    boolean tampada;

    public void rabiscar() {
        if (tampada == true){
            System.out.println("A caneta está pronta para uso");
        }
        
        else if (tampada == false){
            System.out.println("Destampe a caneta primeiro");
        }
    }

    public void status(){
        System.out.println("A marca da caneta é: " + this.marca);
        System.out.println("A caneta é da cor: " + this.cor);
        System.out.println("A caneta possui a pomta de: " + this.ponta);

    }
    
}
