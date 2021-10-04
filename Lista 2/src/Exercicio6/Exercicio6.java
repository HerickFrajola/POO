package Exercicio6;

import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) throws Exception{

        String janela;
        int x;

        janela = JOptionPane.showInputDialog(null, "Informe a Opção desajada:" + "\n" + "1 Para Console" + "\n"+ "2 Para janela" , "Opção", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);
        
        if (x==1) {
            
            for (int y = 10; y >= 0; y--) {
                System.out.println(y);
                
            }    
               
        }
        
        else {
          
            for (int y = 10; y >= 0; y--){

                JOptionPane.showMessageDialog(null, "Números decrescentes: " + y,"Números Decrescentes", JOptionPane.INFORMATION_MESSAGE);

            }   
        
        }
        
    }
    

}