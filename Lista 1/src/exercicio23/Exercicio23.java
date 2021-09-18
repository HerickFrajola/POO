package exercicio23;

import javax.swing.JOptionPane;

public class Exercicio23 {

    public static void main(String[] args) throws Exception{

        int a, b, c, x1, x2;
        int delta;
        String janela;
        
        janela = JOptionPane.showInputDialog(null, "Informe A: ", "Equação 2º grau ", JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(janela);

        janela = JOptionPane.showInputDialog(null, "Informe B: ", "Equação 2º grau ", JOptionPane.INFORMATION_MESSAGE);
        b = Integer.parseInt(janela);

        janela = JOptionPane.showInputDialog(null, "Informe C: ", "Equação 2º grau ", JOptionPane.INFORMATION_MESSAGE);
        c = Integer.parseInt(janela);

        if((a != 0)&&(b!= 0)&&(c!= 0)){
            
            delta = (b*b) - 4 * a * c;
            if(delta <=-1 ) {

                JOptionPane.showMessageDialog(null, "Não existe raiz", "Equação 2º grau", JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(delta == 0){
                   
                    JOptionPane.showMessageDialog(null, "Raiz unica", "Equação 2º grau", JOptionPane.INFORMATION_MESSAGE);
                
                }else{

                    x1 = (-b + delta)/2*a;
                    x2 = (-b - delta)/2*a;

                    JOptionPane.showMessageDialog(null, "X' "+ x1 + "\n" + "X''"+ x2 + "\n", "Equação 2º grau", JOptionPane.INFORMATION_MESSAGE);
                                        
                }
            }

        }
    }            
}