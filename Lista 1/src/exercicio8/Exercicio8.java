package exercicio8;

import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) throws Exception{

        double area;
        float raio;
        String janela;
        
        janela = JOptionPane.showInputDialog(null, "Informe o valor do Raio", "Área do círculo", JOptionPane.INFORMATION_MESSAGE);
        raio = Float.parseFloat(janela);

        area = Math.PI * (raio*raio);

        JOptionPane.showMessageDialog(null, "Área do Círculo: " + area , "Área do círculo", JOptionPane.INFORMATION_MESSAGE);

        
    }
    
}