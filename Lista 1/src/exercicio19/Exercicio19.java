package exercicio19;

import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) throws Exception{

        int x;
        int y;
        int z;
        double geometrica, ponderada, aritmetica;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe X: ", "X Y Z ", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);

        janela = JOptionPane.showInputDialog(null, "Informe Y: ", "X Y Z ", JOptionPane.INFORMATION_MESSAGE);
        y = Integer.parseInt(janela);

        janela = JOptionPane.showInputDialog(null, "Informe Z: ", "X Y Z ", JOptionPane.INFORMATION_MESSAGE);
        z = Integer.parseInt(janela);

        if((x >=0)&&(y>=0)&&(z>=0)){

            geometrica = x*y*z;
            ponderada = (x+2*y+3*z)/6;
            aritmetica = (x+y+z)/3;

            JOptionPane.showMessageDialog(null, "Média Geométrica" + geometrica +"\n"+ "Média Ponderada" + ponderada +"\n"+ "Média Aritmética" + aritmetica , "Média X Y Z", JOptionPane.INFORMATION_MESSAGE);
        
        }else{
            JOptionPane.showMessageDialog(null, "Algum numero não inteiro informado", "X Y Z", JOptionPane.INFORMATION_MESSAGE);
        }      
        
    }
    
}