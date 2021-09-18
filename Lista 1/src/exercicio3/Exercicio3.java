package exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) throws Exception{

        int idade;
        int ano;
        int nascimento;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe a sua idade", "Calculo do ano de nascimento", JOptionPane.INFORMATION_MESSAGE);
        idade = Integer.parseInt(janela);

        janela = JOptionPane.showInputDialog(null, "Informe o nao atual", "Calculo do ano de nascimento", JOptionPane.INFORMATION_MESSAGE);
        ano = Integer.parseInt(janela);
    
        nascimento = ano - idade;

        JOptionPane.showMessageDialog(null, "Ano do Nascimento: " + nascimento , "Ano do nascimento ", JOptionPane.INFORMATION_MESSAGE);
    }
    
}