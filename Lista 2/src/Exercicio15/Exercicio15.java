package Exercicio15;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio15 {

    public static void main(String[] args) throws Exception{

        String janela;
        int x, x1, x2, x3, x4, x5, x6;

        janela = JOptionPane.showInputDialog(null, "Informe a Opção desajada:" + "\n" + "1 Para Console" + "\n"+ "2 Para janela" , "Opção", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);
        
        if (x==1) {
                                         
            int numero1;
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Digite o número desejado: ");
            numero1 = leitor1.nextInt();
            System.out.println("");

            int numero2;
            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Digite o número desejado: ");
            numero2 = leitor2.nextInt();
            System.out.println("");

            int numero3;
            Scanner leitor3 = new Scanner(System.in);
            System.out.println("Digite o número desejado: ");
            numero3 = leitor3.nextInt();
            System.out.println("");

            int numero4;
            Scanner leitor4 = new Scanner(System.in);
            System.out.println("Digite o número desejado: ");
            numero4 = leitor4.nextInt();
            System.out.println("");

            int numero5;
            Scanner leitor5 = new Scanner(System.in);
            System.out.println("Digite o número desejado: ");
            numero5 = leitor5.nextInt();
            System.out.println("");

            int numero6;
            Scanner leitor6 = new Scanner(System.in);
            System.out.println("Digite o número desejado: ");
            numero6 = leitor6.nextInt();
            System.out.println("");
            
            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);
            System.out.println(numero4);
            System.out.println(numero5);
            System.out.println(numero6);                
               
        }else{
            janela = JOptionPane.showInputDialog(null, "Informe a Opção um número: ", "Ordem de Entrada", JOptionPane.INFORMATION_MESSAGE);
            x1 = Integer.parseInt(janela);

            janela = JOptionPane.showInputDialog(null, "Informe a Opção um número: ", "Ordem de Entrada", JOptionPane.INFORMATION_MESSAGE);
            x2 = Integer.parseInt(janela);

            janela = JOptionPane.showInputDialog(null, "Informe a Opção um número: ", "Ordem de Entrada", JOptionPane.INFORMATION_MESSAGE);
            x3 = Integer.parseInt(janela);

            janela = JOptionPane.showInputDialog(null, "Informe a Opção um número: ", "Ordem de Entrada", JOptionPane.INFORMATION_MESSAGE);
            x4 = Integer.parseInt(janela);

            janela = JOptionPane.showInputDialog(null, "Informe a Opção um número: ", "Ordem de Entrada" ,JOptionPane.INFORMATION_MESSAGE);
            x5 = Integer.parseInt(janela);

            janela = JOptionPane.showInputDialog(null, "Informe a Opção um número: ", "Ordem de Entrada", JOptionPane.INFORMATION_MESSAGE);
            x6 = Integer.parseInt(janela);

            JOptionPane.showMessageDialog(null, "1° Numero: " + x1 +"\n" + "2° Numero: " + x2 + "\n" + "3° Numero: " + x3 + "\n" + "4° Numero: " + x4 + "\n" + "5° Numero: " + x5 + "\n" + "6° Numero: " + x6 + "\n" , "Ordem de Entrada", JOptionPane.INFORMATION_MESSAGE);

        }

        
    }
    
}