package exercicio7;

import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) throws Exception{

        double premio = 780000;
        double ganhador1, ganhador2, ganhador3;

        ganhador1 = (premio*0.46);
        ganhador2 = (premio*0.32);
        ganhador3 = (premio - ganhador1 - ganhador2);
                
        JOptionPane.showMessageDialog(null, "Ganhador 1: R$ " + ganhador1 + "\n" + "Ganhador 2: R$ " + ganhador2 + "\n" + "Ganhador 3: R$ " + ganhador3 + "\n",  "Vencedores do Premio", JOptionPane.INFORMATION_MESSAGE);
       
    }
}