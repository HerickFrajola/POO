package exercicio6;

import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) throws Exception{

        float fahrenheit;
        float celcius;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe temperatuda em ºC: ", "Conversor de Temperatura", JOptionPane.INFORMATION_MESSAGE);
        celcius = Float.parseFloat(janela);
    
        fahrenheit = (celcius * 9/5)+32;

        JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: ºF" + fahrenheit,  "Conversor de Temperatura", JOptionPane.INFORMATION_MESSAGE);
    

    }
    
}