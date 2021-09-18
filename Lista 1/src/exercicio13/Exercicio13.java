package exercicio13;

import javax.swing.JOptionPane;

public class Exercicio13 {

    public static void main(String[] args) throws Exception{

        double salario;
        double emprestimo;
        double resultado;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe o valor do salario: ", "Empréstimo", JOptionPane.INFORMATION_MESSAGE);
        salario = Double.parseDouble(janela);
        
        janela = JOptionPane.showInputDialog(null, "Informe o valor da parcela do Emprestimo: ", "Empréstimo", JOptionPane.INFORMATION_MESSAGE);
        emprestimo = Double.parseDouble(janela);
        
        resultado = salario * 0.20;
                
        if (resultado > emprestimo){

            JOptionPane.showMessageDialog(null, "Empréstimo não concedido", "Empréstimo", JOptionPane.INFORMATION_MESSAGE);

        }else{

            JOptionPane.showMessageDialog(null, "Empréstimo concedido", "Empréstimo", JOptionPane.INFORMATION_MESSAGE);

       }
        
    }
    
}