package Exercicio5;

import javax.swing.JOptionPane;

public class Exxercicio5 {

    public static void main(String[] args) throws Exception{

        String janela;
        int resultado = 0;
        int x;

        janela = JOptionPane.showInputDialog(null, "Informe a Optção desajada:" + "\n" + "1 Para Console" + "\n"+ "2 Para janela" , "Opção", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);
        
        if (x==1) {
            
            System.out.println("");

            for (int y = 1; y <= 50 ; y++) {
                if (y % 2 == 0){
                    resultado += y;
                    System.out.println(resultado);
                }
                                
            }    
            
        }
        
        else {
            
            for (int y = 1; y <= 50 ; y++) {
                if (y % 2 == 0){
                    resultado += y;
                JOptionPane.showMessageDialog(null, "Números resultantes: " +  resultado,"Soma dos 50 primeiros Pares", JOptionPane.INFORMATION_MESSAGE);
                
                }
            }   
        
        }
        
    }

}