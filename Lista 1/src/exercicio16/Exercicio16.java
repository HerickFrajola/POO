package exercicio16;

import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void main(String[] args) throws Exception{

        double porcentagem;
        Double empresa;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe o estado desejado: " + "\n" +  "MG Minas Gerais" + "\n" +  "SP São Paulo"+  "\n" +  "RJ rio de Janeiro"+ "\n" +  "MS Mato Grosso do Sul", "Taxas por Estado" , JOptionPane.INFORMATION_MESSAGE);

        switch(janela){
            case "MG":

                janela = JOptionPane.showInputDialog(null, "Informe o valor do produto", "Taxas por estado", JOptionPane.INFORMATION_MESSAGE);
                empresa = Double.parseDouble(janela);

                porcentagem = empresa + empresa/0.07;

                JOptionPane.showMessageDialog(null, "MG escolhido:" + "\n" + "Valor do produto:" + porcentagem, "Taxas por Estado", JOptionPane.INFORMATION_MESSAGE);
            
            case "SP":

                janela = JOptionPane.showInputDialog(null, "Informe o valor do produto", "Taxas por estado", JOptionPane.INFORMATION_MESSAGE);
                empresa = Double.parseDouble(janela);

                porcentagem = empresa + empresa/0.12;

                JOptionPane.showMessageDialog(null, "SP escolhido:" + "\n" + "Valor do produto:" + porcentagem, "Taxas por Estado", JOptionPane.INFORMATION_MESSAGE);
            
            case "RJ":
            
                janela = JOptionPane.showInputDialog(null, "Informe o valor do produto", "Taxas por estado", JOptionPane.INFORMATION_MESSAGE);
                empresa = Double.parseDouble(janela);

                porcentagem = empresa + empresa/0.15;

                JOptionPane.showMessageDialog(null, "RJ escolhido:" + "\n" + "Valor do produto:" + porcentagem, "Taxas por Estado", JOptionPane.INFORMATION_MESSAGE);

            case "MS":

                janela = JOptionPane.showInputDialog(null, "Informe o valor do produto", "Taxas por estado", JOptionPane.INFORMATION_MESSAGE);
                empresa = Double.parseDouble(janela);

                porcentagem = empresa + empresa/0.08;

                JOptionPane.showMessageDialog(null, "MS escolhido:" + "\n" + "Valor do produto:" + porcentagem, "Taxas por Estado", JOptionPane.INFORMATION_MESSAGE);

            default:

                JOptionPane.showMessageDialog(null, "Nenhum Estado Escolhido!!", "Taxas por Estado", JOptionPane.INFORMATION_MESSAGE);


        }
        
    }
    
}