package Exercicio9;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) throws Exception{

        String janela;
        int numero;
        int resultado = 0;
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
                    resultado += i;
                    System.out.println("resultado da soma dos divisores: " + resultado);
                }
                
            }    
               
        }
        
        else {
            janela = JOptionPane.showInputDialog(null, "Informe o número desejado: ", "Soma dos divisores", JOptionPane.INFORMATION_MESSAGE);
            numero = Integer.parseInt(janela);

            for (int i = 1; i <= numero; i++) {
            
                if (numero % i == 0) {
                    resultado += i;
                    JOptionPane.showMessageDialog(null, "Resultado da soma dos divisores: " + resultado, "Soma dos divisores", JOptionPane.INFORMATION_MESSAGE);
                }
            }   
        
        }
        
    }
    
}