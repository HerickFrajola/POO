package Exercicio11;

import javax.swing.JOptionPane;

public class Exercicio11 {
    
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) throws Exception {

        String janela;
        int x;

        janela = JOptionPane.showInputDialog(null, "Infrome quantos termos quer que apareça: ", "Sequência Fibonacci", JOptionPane.INFORMATION_MESSAGE);
        x = Integer.parseInt(janela);

		for (int i = 0; i < x; i++) {
            System.out.print( Exercicio11.fibo(i) + "\t");
        }

    }

}   
