package exercicio1;
import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) throws Exception {

        int numero;
        int contador1, contador2;
        String pergunta;
        
        pergunta = JOptionPane.showInputDialog(null, "Informe um número: ", "Exercíco", JOptionPane.INFORMATION_MESSAGE);
        numero = Integer.parseInt(pergunta);
        
        contador1 = numero + 1;
        contador2 = numero - 1;

        JOptionPane.showMessageDialog(null, "Número Sucessor:" + contador1 + "\n" + "Número Antecessor:" + contador2 , "Exercício 1", JOptionPane.INFORMATION_MESSAGE);
    }
    
}