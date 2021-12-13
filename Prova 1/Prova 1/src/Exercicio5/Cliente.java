package Exercicio5;

import java.util.Scanner;

    public class Cliente {
            
        public void Cadastro() {
            
            int opcao1 = 3;
            int opcao2 = 3;
            Scanner leitor = new Scanner(System.in);

                System.out.println(" Deseja acessar a área de cadastro? ");
                System.out.println("      Opção     \n"+" 1 --> SIM   \n"+ " 0 --> NÃO   \n" );
                opcao2 = leitor.nextInt();

                    String []nome = new String[0];
                    String []email = new String[0];
                    int []cpf = new int [0];
                    String []endereco = new String[0];

                    System.out.println("1 = Adicionar um Cadastro!");
                    System.out.println("2 = Buscar um Cadastro!");
                    opcao1 = leitor.nextInt();
        
                if(opcao1 == 1){

                    System.out.print("Informe quantos clientes ira cadastrar:");
                    int num = leitor.nextInt();

                    while(opcao2 == 1){
                        
                        for (int i = 0; i < num; i ++){
                            System.out.println("\n"+"Numero do cadastro:"+i+"\n");
                            System.out.println("Informe o Nome: ");
                            nome[i] = leitor.next();
                            System.out.println("Informe o Email: ");
                            email[i] = leitor.next();
                            System.out.println("Informe o CPF: ");
                            cpf[i] = leitor.nextInt();
                            System.out.println("Informe o Endereço: ");
                            endereco[i] = leitor.next();
                                            
                        }
                    break;
                    }
                }else{
                int numCadastro = -1;
                //Scanner leitor = new Scanner(System.in);
                System.out.println("Informe o número de cadastro: ");
                numCadastro = leitor.nextInt();
        
                    System.out.println("Nome do cliente"+ nome[numCadastro]);
                    System.out.println("Email do cliente"+ email[numCadastro]);
                    System.out.println("CPF do cliente"+ cpf[numCadastro]);
                    System.out.println("Endereço do cliente"+ endereco[numCadastro]);                  
                    }
                }
            
                        
    }
