import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaração de variáveis
        String nome;
        String modelo;
        float tamanho;
        double preco;
        Integer quantidade;

        // Leitura de dados
        nome = JOptionPane.showInputDialog(null, "Digite o nome do produto: ", "Nome", JOptionPane.QUESTION_MESSAGE);
        modelo = JOptionPane.showInputDialog(null, "Digite o modelo do produto: ", "Modelo",
                JOptionPane.QUESTION_MESSAGE);
        String temp = JOptionPane.showInputDialog(null, "Digite o tamanho do produto: ", "Tamanho",
                JOptionPane.QUESTION_MESSAGE);
        tamanho = Float.parseFloat(temp);
        temp = JOptionPane.showInputDialog(null, "Digite o preço do produto: ", "Preço", JOptionPane.QUESTION_MESSAGE);
        preco = Double.parseDouble(temp);
        temp = JOptionPane.showInputDialog(null, "Digite a quantidade do produto: ", "Quantidade",
                JOptionPane.QUESTION_MESSAGE);
        quantidade = Integer.parseInt(temp);

        // Imprimir dados
        JOptionPane.showMessageDialog(null, "Nome do produto: " + nome, "Nome", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Modelo do produto: " + modelo, "Modelo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Tamanho do produto: " + tamanho, "Tamanho",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Preço do produto: " + preco, "Preço", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade do produto: " + quantidade, "Quantidade",
                JOptionPane.INFORMATION_MESSAGE);

    }
}