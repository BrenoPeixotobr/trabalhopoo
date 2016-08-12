package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuItem;

public class Tela_inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_inicial frame = new Tela_inicial();
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
	public Tela_inicial() {
		setDefaultCloseOperation(Tela_inicial.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(12, 0, 129, 21);
		contentPane.add(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmFuncionario = new JMenuItem("Funcionário");
		mntmFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_cadastra_fun tela2 = new Tela_cadastra_fun();
				tela2.setVisible(true);
			}
		});
		mnCadastro.add(mntmFuncionario);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_cadastra tela1 = new Tela_cadastra();
				tela1.setVisible(true);
			}
		});
		mnCadastro.add(mntmCliente);
		
		JMenuItem mntmCargo = new JMenuItem("Cargo");
		mntmCargo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Tela_cargo tela3 = new Tela_cargo();
				tela3.setVisible(true);
				
			}
		});
		mnCadastro.add(mntmCargo);
		
		JMenuItem mntmServio = new JMenuItem("Serviço");
		mnCadastro.add(mntmServio);
		
		JMenu mnAlterar = new JMenu("Alterar");
		menuBar.add(mnAlterar);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnAlterar.add(mnCliente);
		
		JMenu mnFuncionrio = new JMenu("Funcionário");
		mnAlterar.add(mnFuncionrio);
	}
}
