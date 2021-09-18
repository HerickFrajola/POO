package exercicio18;

import javax.swing.JOptionPane;

public class Exercicio18 {

    public static void main(String[] args) throws Exception {

        double altura;
        double peso;
        String janela;

        janela = JOptionPane.showInputDialog(null, "Tabela Altura", "Tabela Idade", JOptionPane.INFORMATION_MESSAGE);
        altura = Double.parseDouble(janela);
        
        janela = JOptionPane.showInputDialog(null, "Tabela Peso", "Tabela Idade", JOptionPane.INFORMATION_MESSAGE);
        peso = Double.parseDouble(janela);

        if(altura <= 1.20) {
            
            if(peso <= 60) {

                JOptionPane.showMessageDialog(null, "Categoria A", "Categorida de Idade/Peso", JOptionPane.INFORMATION_MESSAGE);

            }else{
                if((peso > 60)&&(peso <=90)) {

                    JOptionPane.showMessageDialog(null, "Categoria D", "Categorida de Idade/Peso", JOptionPane.INFORMATION_MESSAGE);

                }else{

                    JOptionPane.showMessageDialog(null, "Categoria G", "Categorida de Idade/Peso", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        }else{
            if((altura > 1.20)&&(altura <= 1.70)) {
            
                if(peso <= 60) {
    
                    JOptionPane.showMessageDialog(null, "Categoria B", "Categorida de Idade/Peso", JOptionPane.INFORMATION_MESSAGE);
    
                }else{
                    if((peso > 60)&&(peso <=90)) {
    
                        JOptionPane.showMessageDialog(null, "Categoria E", "Categorida de Idade/Peso", JOptionPane.INFORMATION_MESSAGE);
    
                    }else{
    
                        JOptionPane.showMessageDialog(null, "Categoria H", "Categorida de Idade/Peso", JOptionPane.INFORMATION_MESSAGE);
    
                    }
                }
            }else{
                if(altura > 1.70) {
            
                    if(peso <= 60) {
        
                        JOptionPane.showMessageDialog(null, "Categoria C", "Categorida de Idade/Peso", JOptionPane.INFORMATION_MESSAGE);
        
                    }else{
                        if((peso > 60)&&(peso <=90)) {
        
                            JOptionPane.showMessageDialog(null, "Categoria F", "Categorida de Idade/Peso", JOptionPane.INFORMATION_MESSAGE);
        
                        }else{
        
                            JOptionPane.showMessageDialog(null, "Categoria I", "Categorida de Idade/Peso", JOptionPane.INFORMATION_MESSAGE);
        
                        }
                    }
                }                   
            }
        }
    }
}

           