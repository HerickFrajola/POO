package Console;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
			
		int op = 0;
		while(op != 3) {
			System.out.println(" |        Empregos SA       |");
			System.out.println(" |1 - Procurar Emprego      |");
			System.out.println(" |2 - Cadastrar             |");
			System.out.println(" |3 - Sair                  |");
			op = leitor.nextInt();
			
			if(op == 1) {
				Emprego emprego = new Emprego();	
				System.out.println(emprego);
			}
			if(op == 2) {
				Cadastrar cadastrar = new Cadastrar();	
				System.out.println(cadastrar);
			}
			
		}
	}
	
}
