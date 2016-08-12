package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;

public class Tela_cargo extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_cargo frame = new Tela_cargo();
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
	public Tela_cargo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 364, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(12, 12, 151, 19);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 32, 70, 19);
		contentPane.add(lblNome);
		
		JComboBox cbnivel = new JComboBox();
		cbnivel.setBackground(Color.WHITE);
		cbnivel.setModel(new DefaultComboBoxModel(new String[] {"1.Admnistrador", "2.Gerente", "3.Profissional", "4.Atendente"}));
		cbnivel.setBounds(200, 9, 144, 24);
		contentPane.add(cbnivel);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(227, 61, 117, 25);
		contentPane.add(btnCadastrar);
		
		JLabel lblNvelDeAcesso = new JLabel("Nível de Acesso");
		lblNvelDeAcesso.setBounds(200, 34, 123, 15);
		contentPane.add(lblNvelDeAcesso);
	}
}
