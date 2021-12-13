public class App {
    public static void main(String[] args) throws Exception {
        
        Gato gato1 = new Gato();
            gato1.apelido = "Boca Aberta";
            gato1.pelo = "Liso";
            gato1.cor = "Preto com peito branco";
            gato1.idade = 3;
            gato1.peso = 3.3f;
            gato1.status();
            gato1.arrepiado = false;
            gato1.miando = true;

        System.out.println("Caneta");

        Caneta caneta1 = new Caneta();
            caneta1.cor = "Azul";
            caneta1.marca = "Bic";
            caneta1.ponta = 0.5f;
            caneta1.tampada = false;
            caneta1.status();

        System.out.println("Carro");

        Carro carro1 = new Carro();
            carro1.aro = 16;
            carro1.cor = "Prata";
            carro1.modelo = "Onix";
            carro1.velocidade = 0f;
            carro1.motor = true;
            carro1.ligado();
            carro1.status();

        System.out.println("Conta corrente");

        ContaCorrente conta1 = new ContaCorrente();
            conta1.agencia = 0106;
            conta1.nome = "Herick";
            conta1.numeroConta = 34251;
            conta1.vejaSaldo = true;
            conta1.status();
            conta1.saldo();
        
    }
}