package Exercicio8;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) throws Exception{

        String janela;
        int numero;
        int x;
        
        janela = JOptionPane.showInputDialog(null, "Informe a Optção desajada:" + "\n" + "1 Para Console" + "\n"+ "2 Para janela" , "Opção", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);
        
        if (x==1) {
            
            
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o número desejado: ");
            numero = leitor.nextInt();
            System.out.println("");

            for (int i = 1; i <= numero; i++) {
            
                if (numero % i == 0) {
                System.out.println(numero + " é divizivel por " + i);
                }
                
            }    
               
        }
        
        else {
            janela = JOptionPane.showInputDialog(null, "Informe o número desejado: ", "Número Divisisveis", JOptionPane.INFORMATION_MESSAGE);
            numero = Integer.parseInt(janela);

            for (int i = 1; i <= numero; i++) {
            
                if (numero % i == 0) {
                JOptionPane.showMessageDialog(null, numero + " é divizivel por " + i, "Números Divisiveis", JOptionPane.INFORMATION_MESSAGE);
                }
            }   
        
        }
        
    }
    
}