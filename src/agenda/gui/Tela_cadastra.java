package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Tela_cadastra extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textEmail;
	private JTextField textRG;
	
	private String nome;
	private int cpf;
	private String rg;
	private String email;
	
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(12, 12, 165, 19);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(189, 12, 126, 19);
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
		
		JButton btnTelefones = new JButton("Telefones");
		btnTelefones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"recebeu");
				}
		});
		btnTelefones.setBounds(12, 122, 117, 25);
		contentPane.add(btnTelefones);
	}
}
