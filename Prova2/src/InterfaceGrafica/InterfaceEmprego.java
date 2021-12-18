package InterfaceGrafica;

//import java.awt.EventQueue;

import javax.swing.*;

import Console.Pessoa;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class InterfaceEmprego extends Pessoa {
	
	private JFrame janela;
	private JTextField nomeEmp;
	private JTextField vagasEmp;
	private JTextField nomeCadastro;
	private JTextField cpfCadastro;
	private JTextField telefoneCadastro;
	private String nomeEmpresa = null;
	private String vagasEmpresa = null;
	private String nomeCad = null;
	private String cpfCad = null;
	private String telefoneCad = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		InterfaceEmprego window = new InterfaceEmprego();
		window.janela.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public InterfaceEmprego() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		janela = new JFrame();
		janela.setTitle("Empregos SA");
		janela.setBounds(100, 100, 432, 291);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().setLayout(null);
			
		
		JTabbedPane paneEmpresa = new JTabbedPane(JTabbedPane.TOP);
		paneEmpresa.setBounds(0, 0, 457, 254);
		janela.getContentPane().add(paneEmpresa);
		
		JPanel empresaP = new JPanel();
		
		paneEmpresa.addTab("Empresa", empresaP);
		empresaP.setLayout(null);
		
		JLabel labelNomeEmpresa =new JLabel("Nome da Empresa");
		labelNomeEmpresa.setBounds(10, 62, 122, 22);
		empresaP.add(labelNomeEmpresa);
		
		nomeEmp = new JTextField();
		nomeEmp.setBounds(132, 63, 200, 20);
		empresaP.add(nomeEmp);
		nomeEmp.setColumns(10);
		
		JLabel lblVagasDeCargo = new JLabel("Vagas de Cargo");
		lblVagasDeCargo.setBounds(10, 123, 122, 22);
		empresaP.add(lblVagasDeCargo);
		
		vagasEmp = new JTextField();
		vagasEmp.setColumns(10);
		vagasEmp.setBounds(132, 124, 200, 20);
		empresaP.add(vagasEmp);
		
				
		JButton buttonCadEmpresa = new JButton("Cadastrar");
		buttonCadEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nomeEmpresa = nomeEmp.getText();
				setEmpresa(nomeEmpresa);
				vagasEmpresa = vagasEmp.getText();
				setArea(vagasEmpresa);
				
				//System.out.println(getEmpresa());
				//System.out.println(getArea());
			}
		});
		buttonCadEmpresa.setBounds(159, 173, 148, 23);
		empresaP.add(buttonCadEmpresa);
		
		JPanel vagas = new JPanel();
		paneEmpresa.addTab("Vagas", null, vagas, null);
		vagas.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Checar Vagas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomeEmpresa==null) {
					JTextPane txtpn = new JTextPane();
					txtpn.setText("Nenhuma Vaga de emprego!!");
					txtpn.setBounds(93, 36, 203, 20);
					vagas.add(txtpn);
				}else { 
					JTextPane txtpn = new JTextPane();
					txtpn.setText("Empresa "+nomeEmpresa);
					txtpn.setBounds(93, 36, 203, 20);
					vagas.add(txtpn);
					
					JTextPane txtpn_1 = new JTextPane();
					txtpn_1.setText(" Vaga: "+vagasEmpresa);
					txtpn_1.setBounds(93, 64, 203, 20);
					vagas.add(txtpn_1);
					
				}
				
			}
		});
		btnNewButton_2.setBounds(93, 90, 203, 42);
		vagas.add(btnNewButton_2);
			
				
		JPanel panelCadastroPessoal = new JPanel();
		paneEmpresa.addTab("Cadastro Pessoal", null, panelCadastroPessoal, null);
		panelCadastroPessoal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 38, 69, 14);
		panelCadastroPessoal.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 90, 69, 14);
		panelCadastroPessoal.add(lblCpf);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 142, 69, 14);
		panelCadastroPessoal.add(lblTelefone);
		
		nomeCadastro = new JTextField();
		nomeCadastro.setBounds(98, 35, 205, 20);
		panelCadastroPessoal.add(nomeCadastro);
		nomeCadastro.setColumns(10);
		
		cpfCadastro = new JTextField();
		cpfCadastro.setColumns(10);
		cpfCadastro.setBounds(98, 87, 205, 20);
		panelCadastroPessoal.add(cpfCadastro);
		
		telefoneCadastro = new JTextField();
		telefoneCadastro.setColumns(10);
		telefoneCadastro.setBounds(98, 139, 205, 20);
		panelCadastroPessoal.add(telefoneCadastro);
		
		JButton buttonCadPessoal = new JButton("Cadastrar");
		buttonCadPessoal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nomeCad = nomeCadastro.getText();
				setNome(nomeCad);
				cpfCad = cpfCadastro.getText();
				setCpf(cpfCad);
				telefoneCad = telefoneCadastro.getText();
				setTelefone(telefoneCad);
				
								
				//System.out.println(getNome());
				//System.out.println(getCpf());
				//System.out.println(getTelefone());
			}
		});
		buttonCadPessoal.setBounds(118, 180, 156, 23);
		panelCadastroPessoal.add(buttonCadPessoal);
		
		JPanel panelChecarCadastro = new JPanel();
		paneEmpresa.addTab("Checar Cadastro", null, panelChecarCadastro, null);
		panelChecarCadastro.setLayout(null);
		
		JButton btnNewButton_2_1 = new JButton("Checar Cadastro");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nomeCad==null) {
					JTextPane txtpn = new JTextPane();
					txtpn.setText("Nenhum nome encontrado");
					txtpn.setBounds(90, 38, 204, 20);
					panelChecarCadastro.add(txtpn);
				}else {
					JTextPane txtpn = new JTextPane();
					txtpn.setText("Nome: "+nomeCad);
					txtpn.setBounds(90, 38, 204, 20);
					panelChecarCadastro.add(txtpn);
				}
				if(cpfCad==null) {
					JTextPane textPane_1 = new JTextPane();
					textPane_1.setText("Nenhum nome encontrado");
					textPane_1.setBounds(90, 69, 204, 20);
					panelChecarCadastro.add(textPane_1);
				}else {
					JTextPane textPane_1 = new JTextPane();
					textPane_1.setText("CPF: "+cpfCad);
					textPane_1.setBounds(90, 69, 204, 20);
					panelChecarCadastro.add(textPane_1);
				}
				if(telefoneCad==null) {
					JTextPane textPane_2 = new JTextPane();
					textPane_2.setText("Nenhum nome encontrado");
					textPane_2.setBounds(90, 100, 204, 20);
					panelChecarCadastro.add(textPane_2);
				}else {
					JTextPane textPane_2 = new JTextPane();
					textPane_2.setText("Telefone: "+telefoneCad);
					textPane_2.setBounds(90, 100, 204, 20);
					panelChecarCadastro.add(textPane_2);
				}
			}
		});
		btnNewButton_2_1.setBounds(90, 131, 204, 40);
		panelChecarCadastro.add(btnNewButton_2_1);
		
		JTextPane txtpnAsas = new JTextPane();
		txtpnAsas.setBounds(90, 38, 204, 20);
		panelChecarCadastro.add(txtpnAsas);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(90, 69, 204, 20);
		panelChecarCadastro.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(90, 100, 204, 20);
		panelChecarCadastro.add(textPane_2);
		
		JPanel panelSair = new JPanel();
		paneEmpresa.addTab("Sair", null, panelSair, null);
		panelSair.setLayout(null);
		
		JButton buttonSair = new JButton("Sair");
		buttonSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		buttonSair.setBounds(127, 56, 151, 60);
		panelSair.add(buttonSair);
		
		
	}
}
