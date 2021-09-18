package exercicio5;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) throws Exception{

        float dolar;
        float moeda;
        float resultado;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe a Cotação atual do Dólar: ", "Conversor de Moeda", JOptionPane.INFORMATION_MESSAGE);
        dolar = Float.parseFloat(janela);

        janela = JOptionPane.showInputDialog(null, "Informe a quantia em Real: ", "Conversor de Moeda", JOptionPane.INFORMATION_MESSAGE);
        moeda = Float.parseFloat(janela);

        resultado = dolar * moeda ;

        JOptionPane.showMessageDialog(null, "Conversão: R$" + resultado,  "Conversor de Moeda", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}