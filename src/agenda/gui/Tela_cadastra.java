package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.text.MaskFormatter;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOError;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import backend.Telefone;

import java.awt.List;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JCheckBox;
import java.awt.Button;
import java.awt.Font;

public class Tela_cadastra extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textEmail;
	private JTextField textRG;
	private ArrayList<Telefone> tel= new ArrayList<Telefone>();
	private String aux;
	private Boolean t;
	 private Telefone telefone1 = new Telefone();
    	 
    	 
  
    
	
	private String nome;
	private int cpf;
	private String rg;
	private String email;
	private JTextField textTelefone;
	private JTextField textRua;
	private JTextField textBairro;
	private JTextField textNumero;
	private JTextField textComp;
	private JTextField txtcidade;
	private JTextField texUF;
	private JTextField textCEP;
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_cadastra frame = new Tela_cadastra();
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
	public Tela_cadastra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(12, 12, 165, 19);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(189, 12, 146, 19);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(189, 31, 70, 15);
		contentPane.add(lblNewLabel);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(189, 64, 146, 19);
		contentPane.add(textEmail);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(12, 83, 70, 15);
		contentPane.add(lblRg);
		
		textRG = new JTextField();
		textRG.setColumns(10);
		textRG.setBounds(12, 64, 146, 19);
		contentPane.add(textRG);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(189, 83, 70, 15);
		contentPane.add(lblEmail);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 31, 70, 15);
		contentPane.add(lblNome);
		
		JSpinner selecaosexo = new JSpinner();
		selecaosexo.setModel(new SpinnerListModel(new String[] {"Masculino", "Femino", "Outro"}));
		selecaosexo.setBounds(390, 12, 91, 19);
		contentPane.add(selecaosexo);
		
		JButton btnEnivar = new JButton("Enivar");
		btnEnivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome= selecaosexo.getValue().toString();	
				//JOptionPane.showMessageDialog(null,nome);
			}
		});
		btnEnivar.setBounds(380, 270, 117, 25);
		contentPane.add(btnEnivar);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(12, 114, 128, 19);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JCheckBox chZap = new JCheckBox("Zap");
		chZap.setBounds(148, 112, 60, 23);
		contentPane.add(chZap);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(12, 137, 70, 15);
		contentPane.add(lblTelefone);
		
		Button adicionar = new Button("Adicionar");
		adicionar.setForeground(Color.WHITE);
		adicionar.setBackground(Color.DARK_GRAY);
		adicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			aux=textTelefone.getText();	
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
		adicionar.setBounds(206, 110, 86, 23);
		contentPane.add(adicionar);
		
		textRua = new JTextField();
		textRua.setBounds(12, 164, 165, 19);
		contentPane.add(textRua);
		textRua.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(12, 184, 70, 15);
		contentPane.add(lblRua);
		
		textBairro = new JTextField();
		textBairro.setBounds(367, 164, 114, 19);
		contentPane.add(textBairro);
		textBairro.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(367, 184, 70, 15);
		contentPane.add(lblBairro);
		
		textNumero = new JTextField();
		textNumero.setBounds(189, 164, 60, 19);
		contentPane.add(textNumero);
		textNumero.setColumns(10);
		
		JLabel lblN = new JLabel("N");
		lblN.setBounds(189, 184, 70, 15);
		contentPane.add(lblN);
		
		textComp = new JTextField();
		textComp.setBounds(261, 164, 63, 19);
		contentPane.add(textComp);
		textComp.setColumns(10);
		
		JLabel lblComp = new JLabel("Comp.");
		lblComp.setBounds(261, 184, 70, 15);
		contentPane.add(lblComp);
		
		txtcidade = new JTextField();
		txtcidade.setText("Montes Claros");
		txtcidade.setBounds(12, 211, 114, 19);
		contentPane.add(txtcidade);
		txtcidade.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(12, 228, 70, 15);
		contentPane.add(lblCidade);
		
		texUF = new JTextField();
		texUF.setText("MG");
		texUF.setBounds(136, 211, 41, 19);
		contentPane.add(texUF);
		texUF.setColumns(10);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(138, 228, 70, 15);
		contentPane.add(lblUf);
		
		textCEP = new JTextField();
		textCEP.setText("39400-000");
		textCEP.setBounds(189, 211, 114, 19);
		contentPane.add(textCEP);
		textCEP.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(189, 228, 70, 15);
		contentPane.add(lblCep);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(390, 31, 70, 15);
		contentPane.add(lblSexo);

		
		
		
	}
}
