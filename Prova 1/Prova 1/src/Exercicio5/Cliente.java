package Exercicio5;

import java.util.Scanner;

    public class Cliente {
            
        public void Cadastro() {
            
            int opcao = 3;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Deseja cadastrar um Cliente?");
            System.out.println("      Opção     \n"+" 1 --> SIM   \n"+ " 0 --> NÃO   \n" );
            opcao = leitor.nextInt();

            while(opcao == 1){
                System.out.print("Informe quantos clientes ira cadastrar:");
                int num = leitor.nextInt();

                String []nome = new String[num];
                String []email = new String[num];
                int []cpf = new int [num];
                String []endereço = new String[num];

                for (int i = 0; i < num; i ++){
                    System.out.println("\n"+"Numero do cadastro:"+i+"\n");
                    System.out.println("Informe o Nome: ");
                    nome[i] = leitor.next();
                    System.out.println("Informe o Email: ");
                    email[i] = leitor.next();
                    System.out.println("Informe o CPF: ");
                    cpf[i] = leitor.nextInt();
                    System.out.println("Informe o Endereço: ");
                    endereço[i] = leitor.next();
                                       
                }
            break;
            }
    }
}