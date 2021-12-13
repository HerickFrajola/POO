import Clientes.Cliente;

public class SistemaPrincipal {
        public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente();
            cliente1.setNome("Herick");
            cliente1.setEndereco("Av. sem nome, Nº 5450");
            cliente1.setCpf("1217838791");
            cliente1.setIdade(22);
            System.out.println("  ");
            System.out.println(cliente1.getNome());
            System.err.println(cliente1.getEndereco());
            System.err.println(cliente1.getCpf());
            System.err.println(cliente1.getIdade());
            cliente1.validaCPF(cliente1.getCpf());

        Cliente cliente2 = new Cliente();
            cliente1.setNome("Jenyffer");
            cliente1.setEndereco("Rua 32 Nº 37");
            cliente1.setCpf("5225848699");
            cliente1.setIdade(19);
            System.out.println("  ");
            System.out.println(cliente1.getNome());
            System.err.println(cliente1.getEndereco());
            System.err.println(cliente1.getCpf());
            System.err.println(cliente1.getIdade());
            cliente1.validaCPF(cliente1.getCpf());


            

    }
}
