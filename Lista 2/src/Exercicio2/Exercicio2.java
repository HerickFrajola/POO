package Exercicio2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio2 {

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

            for (int y = numero; y >= 0; y--) {
                System.out.println(y);
                
            }    
               
        }
        
        else {
            janela = JOptionPane.showInputDialog(null, "Informe o número desejado: ", "Número Decrescente", JOptionPane.INFORMATION_MESSAGE);
            x = Integer.parseInt(janela);

            for (int y = x; y >= 0; y--){

                JOptionPane.showMessageDialog(null, "Números decrescentes: " + y,"Números Decrescentes", JOptionPane.INFORMATION_MESSAGE);

            }   
        
        }
        
    }
    

}