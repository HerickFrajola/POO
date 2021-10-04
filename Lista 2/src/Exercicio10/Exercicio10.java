package Exercicio10;

import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) throws Exception{

        String janela;
        int x = 3;
        int z = 5;
        int res = 0;
        
        janela = JOptionPane.showInputDialog(null, "Informe a Optção desajada:" + "\n" + "1 Para Console" + "\n"+ "2 Para janela" , "Opção", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);
        
        if (x==1) {
   
            for(int i = 0; i < 1000; i++){
                if(i % x == 0 || i % z == 0){
                    res += i;
                }
            }
    
            System.out.println("Resultado da somas dos números: " + res);   
        }
        
        else {

            for(int i = 0; i < 1000; i++){
                if(i % x == 0 || i % z == 0){
                    res += i;
                }
            }
                        
            JOptionPane.showMessageDialog(null, "Resultado da soma dos divisores: " + res, "Soma dos divisores", JOptionPane.INFORMATION_MESSAGE);
               
        }
        
    }
    
}