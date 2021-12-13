package Clientes;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;


    public boolean validaCPF(String cpf) {
        if(cpf.length() == 11) {
            if(cpf.equals("12345678910")) {
                System.out.println("CPF invlaido");
                return false;
            }

            else if (cpf.equals("11111111111")) {
                System.out.println("CPF invalido");
                return false;
            }else {
                System.out.println("CPF cadrastrado com sucesso");
                return true;
            }
            
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
       this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
