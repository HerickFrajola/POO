package Exercicio4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) throws Exception{

        String janela;
        int x;

        janela = JOptionPane.showInputDialog(null, "Informe a Optção desajada:" + "\n" + "1 Para Console" + "\n"+ "2 Para janela" , "Opção", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);
        
        if (x==1) {
            
            int numero;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o número desejado: ");
            numero = leitor.nextInt();
            System.out.println("");

            for (int y = 1; y <= 5 ; y++) {
                System.out.println((y * numero));
                
            }    
               
        }
        
        else {
            janela = JOptionPane.showInputDialog(null, "Informe o número desejado: ", "Número Multiplos", JOptionPane.INFORMATION_MESSAGE);
            x = Integer.parseInt(janela);

            for (int y = 1; y <= 5 ; y++){
                int resultado = y * x;
                JOptionPane.showMessageDialog(null, "Números multiplos: " +  resultado,"Números Multiplos", JOptionPane.INFORMATION_MESSAGE);

            }   
        
        }
        
    }
    
}