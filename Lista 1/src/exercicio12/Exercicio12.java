package exercicio12;

import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) throws Exception{

        float numero1, numero2;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe o Primeiro Número: ", "Maior número informado", JOptionPane.INFORMATION_MESSAGE);
        numero1 = Float.parseFloat(janela);
        
        janela = JOptionPane.showInputDialog(null, "Informe o Segundo Número: ", "Maior número informado", JOptionPane.INFORMATION_MESSAGE);
        numero2 = Float.parseFloat(janela);

        if (numero1 > numero2) {

            JOptionPane.showMessageDialog(null, "Maior número: " + numero1, "Maior número informado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "Maior número: " + numero2, "Maior número informado", JOptionPane.INFORMATION_MESSAGE);

            }else {
                JOptionPane.showMessageDialog(null, "Números iguais: " + numero1 +" e "+ numero2, "Maior número informado", JOptionPane.INFORMATION_MESSAGE); 
            }
        }   
    }   
}
    
