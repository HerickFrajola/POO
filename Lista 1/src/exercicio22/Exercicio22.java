package exercicio22;

import javax.swing.JOptionPane;

public class Exercicio22 {

    public static void main(String[] args) throws Exception{

        float numero;
        String janela;
        
        janela = JOptionPane.showInputDialog(null, "Informe um número: ", "Divisor de 3 ou 5" , JOptionPane.INFORMATION_MESSAGE);
        numero = Float.parseFloat(janela);

        if ((numero % 5 == 0) && (numero % 3 == 0)){

            JOptionPane.showMessageDialog(null, "Divisivel por 3 e 5: " + numero, "Divisor de 3 ou 5", JOptionPane.INFORMATION_MESSAGE);
        
        }else{
            if (numero % 3 == 0) {
            
            JOptionPane.showMessageDialog(null, "Divisivel por 3: " + numero, "Divisor de 3 ou 5", JOptionPane.INFORMATION_MESSAGE);
            }else{
                if (numero % 5 == 0) {
                
                JOptionPane.showMessageDialog(null, "Divisivel por 5: " + numero, "Divisor de 3 ou 5", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        
    }
    
}