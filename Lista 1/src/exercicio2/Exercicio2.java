package exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args)throws Exception{

    int numero1, numero2, numero3;
    int resultado;
    String janela;

    janela = JOptionPane.showInputDialog(null,"Primeiro Número:", "Informe os Números", JOptionPane.INFORMATION_MESSAGE);
    numero1 = Integer.parseInt(janela);

    janela = JOptionPane.showInputDialog(null,"Segundo Número:", "Informe os Números", JOptionPane.INFORMATION_MESSAGE);
    numero2 = Integer.parseInt(janela);
    
    janela = JOptionPane.showInputDialog(null,"Triangulo Número:", "Informe os Números", JOptionPane.INFORMATION_MESSAGE);
    numero3 = Integer.parseInt(janela);

    resultado = numero1 + numero2 + numero3;

    JOptionPane.showMessageDialog(null, "Resultado: " + resultado , "Resultado" , JOptionPane.INFORMATION_MESSAGE);
    

    }
    
}