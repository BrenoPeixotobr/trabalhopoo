package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backend.Endereco;
import backend.Funcionario;
import backend.Telefone;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Tela_cadastra_fun extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textEmail;
	private JTextField textRG;
	private JTextField textTelefone;
	private JTextField textRua;
	private JTextField textBairro;
	private JTextField textNumero;
	private JTextField textComp;
	private JTextField txtcidade;
	private JTextField texuf;
	private JTextField textcep;
	private ArrayList<Telefone> tel= new ArrayList<Telefone>();
	private String aux;
	private Boolean t;
	private Telefone telefone1 = new Telefone();
	private Endereco ende1;
	private Funcionario f1;
	

	private String nome;
	private String cpf;
	private String rg;
	private String email;
	private String rua;
	private String bairro;
	private String comp;
	private String cidade;
	private int n;
	private String cep;
	private String cargo;
	private String uf;
	private JTextField texUF;
	private boolean confere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_cadastra_fun frame = new Tela_cadastra_fun();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public  boolean vazio(JTextField A){
		if(A.getText().trim().isEmpty()==true)
			return true;
		else
			return false;
		
		
	}
	
	public Tela_cadastra_fun() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 539, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(12, 0, 507, 332);
		contentPane.add(panel);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(12, 12, 165, 19);
		panel.add(textNome);
		
		textCPF = new JTextField();
		textCPF.setColumns(10);
		textCPF.setBounds(189, 12, 146, 19);
		panel.add(textCPF);
		
		JLabel label = new JLabel("CPF");
		label.setBounds(189, 31, 70, 15);
		panel.add(label);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(189, 64, 146, 19);
		panel.add(textEmail);
		
		JLabel label_1 = new JLabel("RG");
		label_1.setBounds(12, 83, 70, 15);
		panel.add(label_1);
		
		textRG = new JTextField();
		textRG.setColumns(10);
		textRG.setBounds(12, 64, 146, 19);
		panel.add(textRG);
		
		JLabel label_2 = new JLabel("Email");
		label_2.setBounds(189, 83, 70, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Nome");
		label_3.setBounds(12, 31, 70, 15);
		panel.add(label_3);
		
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(12, 114, 128, 19);
		panel.add(textTelefone);
		
		JCheckBox chZap = new JCheckBox("Zap");
		chZap.setBounds(148, 112, 60, 23);
		panel.add(chZap);
		
		JLabel label_4 = new JLabel("Telefone");
		label_4.setBounds(12, 137, 70, 15);
		panel.add(label_4);
		
		Button Adicionar = new Button("Adicionar");
		Adicionar.setForeground(Color.WHITE);
		Adicionar.setBackground(Color.DARK_GRAY);
		Adicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aux=textTelefone.getText().toString();	
				 if(chZap.isSelected()){
					 t=true;
					 textTelefone.setText("");
					 chZap.setSelected(false);
					 
					 }
				 else{
					 t=false;
					 textTelefone.setText("");				 
					 }
				 telefone1.setNumero(aux);
				 telefone1.setZap(t);
				 tel.add(telefone1);
			}
		});
		Adicionar.setBounds(206, 110, 86, 23);
		panel.add(Adicionar);
		
		textRua = new JTextField();
		textRua.setColumns(10);
		textRua.setBounds(12, 164, 165, 19);
		panel.add(textRua);
		
		JLabel label_5 = new JLabel("Rua");
		label_5.setBounds(12, 184, 70, 15);
		panel.add(label_5);
		
		textBairro = new JTextField();
		textBairro.setColumns(10);
		textBairro.setBounds(367, 164, 114, 19);
		panel.add(textBairro);
		
		JLabel label_6 = new JLabel("Bairro");
		label_6.setBounds(367, 184, 70, 15);
		panel.add(label_6);
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(189, 164, 60, 19);
		panel.add(textNumero);
		
		JLabel label_7 = new JLabel("N");
		label_7.setBounds(189, 184, 70, 15);
		panel.add(label_7);
		
		textComp = new JTextField();
		textComp.setColumns(10);
		textComp.setBounds(261, 164, 63, 19);
		panel.add(textComp);
		
		JLabel label_8 = new JLabel("Comp.");
		label_8.setBounds(261, 184, 70, 15);
		panel.add(label_8);
		
		txtcidade = new JTextField();
		txtcidade.setText("Montes Claros");
		txtcidade.setColumns(10);
		txtcidade.setBounds(12, 211, 114, 19);
		panel.add(txtcidade);
		
		JLabel label_9 = new JLabel("Cidade");
		label_9.setBounds(12, 228, 70, 15);
		panel.add(label_9);
		
		texuf = new JTextField();
		texuf.setText("MG");
		texuf.setColumns(10);
		texuf.setBounds(136, 211, 41, 19);
		panel.add(texuf);
		
		JLabel label_10 = new JLabel("UF");
		label_10.setBounds(138, 228, 70, 15);
		panel.add(label_10);
		
		textcep = new JTextField();
		textcep.setText("39400-000");
		textcep.setColumns(10);
		textcep.setBounds(189, 211, 114, 19);
		panel.add(textcep);
		
		JLabel label_11 = new JLabel("CEP");
		label_11.setBounds(189, 228, 70, 15);
		panel.add(label_11);
		
		JComboBox cbfuncionaro = new JComboBox();
		cbfuncionaro.setBackground(Color.WHITE);
		cbfuncionaro.setModel(new DefaultComboBoxModel(new String[] {"Maquiador(a)", "Cabeleireiro(a)", "Manicure", "Depelidor(a)"}));
		cbfuncionaro.setBounds(380, 9, 117, 24);
		panel.add(cbfuncionaro);
		
		JButton button = new JButton("Enivar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					n =Integer.parseInt(textNumero.getText().toString());
					confere=false;
				}
				catch(NumberFormatException a)
				{
					 confere=true;
				}
				
				 if(vazio(textNome)||vazio(textComp)||vazio(textRG)||vazio(textCPF)||vazio(textRua)||vazio(textBairro)||vazio(textcep)||vazio(txtcidade)||vazio(texuf)||vazio(textEmail)){
					 JOptionPane.showMessageDialog(null,"Existem Campos Vazios");
				 }
				 else if(confere)
				 {
					 JOptionPane.showMessageDialog(null,"Número Invalido");
				 }
				 else if(tel.isEmpty())
				 {
					 JOptionPane.showMessageDialog(null, "Nenhum numero inserido!");
				 }
				 
				 else{
				 cargo= cbfuncionaro.getSelectedItem().toString();
				 nome=textNome.getText();
				 comp = textComp.getText().toString();
				 rg=textRG.getText().toString();
				 cpf=textCPF.getText().toString();
				 rua = textRua.getText().toString();
				 bairro=textBairro.getText().toString();
				 cep=textcep.getText().toString();
				 cidade=txtcidade.getText().toString();
				 uf=texuf.getText().toString();
				 email=textEmail.getText().toString();
				 ende1 = new Endereco(rua, comp, n, bairro, cidade, cep, uf);
			
				 f1 = new Funcionario(nome,cpf,rg,email,ende1,tel,cargo);
				 JOptionPane.showMessageDialog(null,"Usuario Inserdo com sucesso!");
				 
				 textNome.setText("");
				 textComp.setText("");
				 textRG.setText("");
				 textCPF.setText("");
				 textRua.setText("");
				 textBairro.setText("");
				 textcep.setText("39400-00");
				 txtcidade.setText("Montes Claros");
				 texuf.setText("MG");
				 textEmail.setText("");
				 textNumero.setText("");
				 
				 }	
				
				
			}
		});
		button.setBounds(380, 270, 117, 25);
		panel.add(button);
		
	}
}
