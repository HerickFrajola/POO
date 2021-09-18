package exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) throws Exception{

        float kmH;
        float ms;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe a velocidade em Km/h", "Conversor de KM/h para M/s", JOptionPane.INFORMATION_MESSAGE);
        kmH = Float.parseFloat(janela);
        
        ms = 10*(kmH / 36);
            
        JOptionPane.showMessageDialog(null, "KM/h em M/s: " + ms, "Conversor de KM/h para M/s", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}