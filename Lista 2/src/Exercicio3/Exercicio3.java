package Exercicio3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) throws Exception{

        String janela;
        int x;

        janela = JOptionPane.showInputDialog(null, "Informe a Opção desajada:" + "\n" + "1 Para Console" + "\n"+ "2 Para janela" , "Opção", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);
        
        if (x==1) {
            
            int numero;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o número desejado: ");
            numero = leitor.nextInt();
            System.out.println("");
            
            for (int y = 1; y <= numero; y++, y++) {
                System.out.println(y);
                
                
            }    
               
        }
        
        else {
            janela = JOptionPane.showInputDialog(null, "Informe o número desejado: ", "Número Ímpares", JOptionPane.INFORMATION_MESSAGE);
            x = Integer.parseInt(janela);

            for (int y = 1; y<= x; y++, y++){

                JOptionPane.showMessageDialog(null, "Números Ímpares: " + y,"Números Ípares", JOptionPane.INFORMATION_MESSAGE);

            }   
        
        }
        
    }
    

}