package exercicio10;

import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) throws Exception{

        float soma, soma2;
        float subtracao, subtracao2;
        float multiplicacao, multiplicacao2;
        float dividir, dividir2;
        float resultado;
        String janela;
        String opcao;
        
        janela = JOptionPane.showInputDialog(null, "Escolha a Operação desejada: " + "\n" +  "\n" + "SOMA para Soma" + "\n" + "\n" +  "SUB para subtração"+ "\n" + "\n" +  "MULT para Multiplicação"+ "\n" + "\n" +  "DIV para Divisão", "Calculadora" , JOptionPane.INFORMATION_MESSAGE);
            
        switch (janela){
                case "SOMA" :
                
                opcao = JOptionPane.showInputDialog(null, "Soma escolhida" + "\n"+ "\n" + "Informe o primeiro Número", "Soma", JOptionPane.INFORMATION_MESSAGE);
                soma = Float.parseFloat(opcao);

                opcao = JOptionPane.showInputDialog(null, "Informe o Segundo Número", "Soma", JOptionPane.INFORMATION_MESSAGE);
                soma2 = Float.parseFloat(opcao);

                resultado = (soma + soma2);

                JOptionPane.showMessageDialog(null, "Resulado da soma: " + resultado, "Soma", JOptionPane.INFORMATION_MESSAGE);

                break;            
                

                case "SUB" :
                
                opcao = JOptionPane.showInputDialog(null, "Subtração escolhida" + "\n"+ "\n" + "Informe o primeiro Número", "Subtração", JOptionPane.INFORMATION_MESSAGE);
                subtracao = Float.parseFloat(opcao);

                opcao = JOptionPane.showInputDialog(null, "Informe o Segundo Número", "Subtração", JOptionPane.INFORMATION_MESSAGE);
                subtracao2 = Float.parseFloat(opcao);

                resultado = (subtracao - subtracao2);

                JOptionPane.showMessageDialog(null, "Resulado da soma: " + resultado, "Soma", JOptionPane.INFORMATION_MESSAGE);

                break;            


                case "MULT": 
                
                opcao = JOptionPane.showInputDialog(null, "Multiplicação escolhida" + "\n"+ "\n" + "Informe o primeiro Número", "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
                multiplicacao = Float.parseFloat(opcao);

                opcao = JOptionPane.showInputDialog(null, "Informe o Segundo Número", "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
                multiplicacao2 = Float.parseFloat(opcao);

                resultado = (multiplicacao * multiplicacao2);

                JOptionPane.showMessageDialog(null, "Resulado da Multiplicação: " + resultado, "Multiplicação", JOptionPane.INFORMATION_MESSAGE);

                break;
          

                case "DIV" :
                
                opcao = JOptionPane.showInputDialog(null, "DIvisão escolhida" + "\n"+ "\n" + "Informe o primeiro Número", "Divisão", JOptionPane.INFORMATION_MESSAGE);
                dividir = Float.parseFloat(opcao);

                opcao = JOptionPane.showInputDialog(null, "Informe o Segundo Número", "Divisão", JOptionPane.INFORMATION_MESSAGE);
                dividir2 = Float.parseFloat(opcao);

                resultado = (dividir / dividir2);

                JOptionPane.showMessageDialog(null, "Resulado da Divisão: " + resultado, "Divisão", JOptionPane.INFORMATION_MESSAGE);

                break;
            }


        }
}