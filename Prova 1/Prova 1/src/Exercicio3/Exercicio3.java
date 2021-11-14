package Exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String args[]) {

        String aux="Valores que são iguais:\n";
        int indice;
        int[] vetor = new int[10];
        int aux2;
        
        for(int i=0;i<10;i++) {
        vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º valor"));
        }
        
        for (int i=0;i<10;i++) {
            aux2=vetor[i];
            indice=i;
            for (int j=0;j<10;j++) {
                if(vetor[j]==aux2 && indice != j) {
                        //igual=vetor[j+1];
                    aux+=aux2+"\n";
                }//if
            }//fim do 2 for
                
            }//fim do for
        JOptionPane.showMessageDialog(null, aux);
    }
        
}
