package Exercicio7;

import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) throws Exception {
        
        String janela;
        double resultado = 0.0;
        double numero;
        
        JOptionPane.showMessageDialog(null, " Informe 10 númnero ", "Soma de 10 Núnmeros", JOptionPane.INFORMATION_MESSAGE);
        
        for (int i = 1;i <= 10; i++) {

            janela = JOptionPane.showInputDialog(null, "Informe um número", "Soma de 10 Números", JOptionPane.INFORMATION_MESSAGE);
            numero = Double.parseDouble(janela);

            resultado += numero;  
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado , "Soma de 10 Números", JOptionPane
        .INFORMATION_MESSAGE);
    
    }

    
}