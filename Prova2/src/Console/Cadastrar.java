package Console;
import java.util.Scanner;


public class Cadastrar extends Pessoa{
	
	Scanner leitor = new Scanner(System.in);
	
	public Cadastrar() {
		int opcao = 0;
			
		while(opcao != 3) {
		System.out.println(" |        Empregos SA       |\n");
		System.out.println(" |      Área de Cadastro    |");
		System.out.println(" |1 - Cadastrar             |");
		System.out.println(" |2 - Chegar Cadastro       |");
		System.out.println(" |3 - Sair                  |");
		opcao = leitor.nextInt();
		
			if(opcao ==1) {
				cadastro();
			}else {
				if(opcao ==2){
					checaCadastro();					
				}
			}
		}		
	}
	
	private void cadastro(){
				
		System.out.println("Cadastro!");
		System.out.println("Informe o Nome:\n");
		String nome = leitor.next();
		
		System.out.println("Informe o cpf:\n");
		String cpf  = leitor.next();
		
		System.out.println("Informe o Telefone:\n");
		String telefone = leitor.next();
		
		System.out.println("Cadastrado com sucesso!");
		
				
		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
	}
		
	private void checaCadastro(){
		
		System.out.println("Checar Cadastro\n");
		
		if (this.getNome() == null) {
			System.out.println("Nenhum cadastro encontrado!\n");
			
		}else {
			
			System.out.println("Nome: "+ this.getNome()+"\n");
			
			System.out.println("Cpf: "+ this.getCpf()+"\n");
			
			System.out.println("Telefone: "+ this.getTelefone()+"\n");
		}
			
	}
	
	
}
