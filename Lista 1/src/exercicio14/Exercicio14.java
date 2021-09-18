package exercicio14;

import javax.swing.JOptionPane;

public class Exercicio14 {
    
    public static void main(String[] args) throws Exception{

        double numero;
        double raiz;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe o Número: ", "Potenciação ", JOptionPane.INFORMATION_MESSAGE);
        numero = Double.parseDouble(janela);

        if( numero > 0); {

            numero = numero * numero;
            raiz = Math.sqrt(numero);
            
            JOptionPane.showMessageDialog(null, "Numero ao quadrado: " + numero + "\n" + "Raiz quadrada: " + raiz, "Potenciação", JOptionPane.INFORMATION_MESSAGE);

        }
        
    }
}