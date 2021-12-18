package Console;
import java.util.Scanner;

public class Emprego extends Pessoa{
	
	Scanner leitor = new Scanner(System.in);
	
	public Emprego() {
		
		int opcao = 0;
		
		while(opcao != 3) {
		System.out.println(" |        Empregos SA       |\n");
		System.out.println(" |      Área de Empregos    |");
		System.out.println(" |1 - Cadastrar Empresa     |");
		System.out.println(" |2 - Checar Vagas          |");
		System.out.println(" |3 - Sair                  |");
		opcao = leitor.nextInt();
			if(opcao ==1) {
				cadastrarEmprego();
			}else {
				if(opcao ==2){
					checarVagas();					
				}
			}
		}
				
	}
	
	
	public void cadastrarEmprego(){
		
		System.out.println("Cadastro de Empresa!");
		System.out.println("Informe a Empresa:\n");
		String empresa1 = leitor.next();
		
		
		System.out.println("Informe a Área:\n");
		String area1 = leitor.next();
		
				
		setEmpresa(empresa1);
		setArea(area1);
		
	}
		
	private void checarVagas(){
		
		System.out.println("Checar Vagas\n");
		
		if (this.getEmpresa() == null) {
			System.out.println("Nenhma Vaga de Emprego encontrado!\n");
			
		}else {
			
			System.out.println("Empresa: "+ this.getEmpresa()+"\n");
			
			System.out.println("Área: "+ this.getArea()+"\n");
			
		}
			
	}
		
	

}
