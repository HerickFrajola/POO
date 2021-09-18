package exercicio17;

import javax.swing.JOptionPane;

public class Exercicio17 {

    public static void main(String[] args) throws Exception{

        int idade;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Informe a idade: ", "Classificação de Nadador", JOptionPane.INFORMATION_MESSAGE);
        idade = Integer.parseInt(janela);        
 
        if(idade < 5) {
            
            JOptionPane.showMessageDialog(null, "Nadador sem categoria", "Nadador", JOptionPane.INFORMATION_MESSAGE);
        }
  
        if((idade >= 5) && (idade <= 7)){
            
            JOptionPane.showMessageDialog(null, "Nadador Infantil A", "Nadador", JOptionPane.INFORMATION_MESSAGE);
        }
 
        if((idade >= 8) && (idade <= 10)){
            
            JOptionPane.showMessageDialog(null, "Nadador Infantil B", "Nadador", JOptionPane.INFORMATION_MESSAGE);
        }
 
        if((idade >= 11) && (idade <= 13)){

            JOptionPane.showMessageDialog(null, "Nadador Juvenil A", "Nadador", JOptionPane.INFORMATION_MESSAGE);
        }
 
        if((idade >= 14) && (idade <= 17)){
            
            JOptionPane.showMessageDialog(null, "Nadador Juvenil B", "Nadador", JOptionPane.INFORMATION_MESSAGE);
        }
 
        if(idade >= 18){

            JOptionPane.showMessageDialog(null, "Nadador Sênior", "Nadador", JOptionPane.INFORMATION_MESSAGE);
        }  

        
    }

  
    
} 