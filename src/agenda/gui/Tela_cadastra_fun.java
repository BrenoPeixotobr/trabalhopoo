package agenda.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Button;
import java.awt.Color;

public class Tela_cadastra_fun extends JPanel {
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textRG;
	private JTextField textEmail;
	private JTextField textRua;
	private JTextField textN;
	private JTextField textComp;
	private JTextField textBairro;
	private JTextField textTelefone;
	private JLabel lblTelefone;

	/**
	 * Create the panel.
	 */
	public Tela_cadastra_fun() {
		setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(12, 12, 173, 19);
		add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 31, 70, 15);
		add(lblNome);
		
		textCPF = new JTextField();
		textCPF.setBounds(197, 12, 138, 19);
		add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(197, 31, 70, 15);
		add(lblCpf);
		
		textRG = new JTextField();
		textRG.setBounds(12, 58, 114, 19);
		add(textRG);
		textRG.setColumns(10);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(12, 77, 70, 15);
		add(lblRg);
		
		textEmail = new JTextField();
		textEmail.setBounds(194, 58, 141, 19);
		add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(197, 77, 70, 19);
		add(lblEmail);
		
		textRua = new JTextField();
		textRua.setBounds(12, 151, 173, 19);
		add(textRua);
		textRua.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(12, 170, 70, 15);
		add(lblRua);
		
		textN = new JTextField();
		textN.setBounds(197, 151, 29, 19);
		add(textN);
		textN.setColumns(10);
		
		JLabel lblN = new JLabel("N");
		lblN.setBounds(204, 170, 19, 15);
		add(lblN);
		
		textComp = new JTextField();
		textComp.setBounds(235, 151, 56, 19);
		add(textComp);
		textComp.setColumns(10);
		
		JLabel lblComp = new JLabel("Comp");
		lblComp.setBounds(235, 170, 70, 15);
		add(lblComp);
		
		textBairro = new JTextField();
		textBairro.setBounds(303, 151, 114, 19);
		add(textBairro);
		textBairro.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(303, 170, 70, 15);
		add(lblBairro);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(12, 104, 152, 19);
		add(textTelefone);
		textTelefone.setColumns(10);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(12, 124, 70, 15);
		add(lblTelefone);
		
		JCheckBox chZap = new JCheckBox("Zap");
		chZap.setBounds(172, 104, 56, 23);
		add(chZap);
		
		Button buadicionar = new Button("Adicionar");
		buadicionar.setForeground(Color.WHITE);
		buadicionar.setBackground(Color.BLACK);
		buadicionar.setBounds(234, 102, 86, 23);
		add(buadicionar);
		

	}
}
