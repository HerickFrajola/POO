package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception{
        
        Scanner leitor  = new Scanner(System.in);
        double [][] matriz = new double[5][5];
        double resultado1 = 0.0;
        double resultado2 = 0.0;
        double resultado3 = 0.0;
        double resultado4 = 0.0;
        double resultado5 = 0.0;
        int coluna = 0;
        int linha = 0;
             

        for (int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j ++){
                System.out.println("Informe o valor: ");
                matriz[i][j] = leitor.nextInt();
                resultado1 = resultado1 + matriz[i][j];
            }
        }
        while(linha < 5 && coluna < 5){
            
            resultado2 = resultado2 + matriz[linha][coluna];
            linha++;
            coluna++;
        }
        
        resultado3 = matriz[4][4]+matriz[3][3]+matriz[2][2]+matriz[1][1]+matriz[0][0];
        
        resultado4 = resultado1 - resultado2;
        resultado5 = (resultado2 + resultado3) - +matriz[2][2];

        System.out.println("Resultado do valor da diagonal principal: " + resultado2);
        System.out.println("Resultado do valor da diagonal secundaria: " + resultado3);
        System.out.println("Resultado dos valores das diagonais: "+ resultado5);
        System.out.println("Soma dos valores restantes: " + resultado4);
            
    }
}