package exercicio9;

import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) throws Exception{

        double hipotenusa;
        float valorA;
        float valorB;
        double resultado;
        String janela;

        janela =  JOptionPane.showInputDialog(null, "Informe o valor de A: ", "Calculo da área do triangulo", JOptionPane.INFORMATION_MESSAGE);
        valorA = Float.parseFloat(janela);

        janela =  JOptionPane.showInputDialog(null, "Informe o valor de B: ", "Calculo da área do triangulo", JOptionPane.INFORMATION_MESSAGE);
        valorB = Float.parseFloat(janela);

        hipotenusa = (valorA*valorA) + (valorB*valorB);
        resultado = Math.sqrt(hipotenusa);


        JOptionPane.showMessageDialog(null, "Área do Triangulo: " + resultado, "Calculo da área do triangulo", JOptionPane.INFORMATION_MESSAGE);

    }
}    