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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btncadastrar = new JButton("Cliente");
		btncadastrar.setFont(new Font("Dialog", Font.BOLD, 10));
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela_cadastra tela1= new Tela_cadastra();
				tela1.setVisible(true);
			}
		});
		btncadastrar.setBounds(12, 0, 91, 61);
		contentPane.add(btncadastrar);
		
		JButton butFuncinario = new JButton("Funcionário");
		butFuncinario.setFont(new Font("Dialog", Font.BOLD, 9));
		butFuncinario.setBounds(108, 0, 91, 61);
		contentPane.add(butFuncinario);
	}
}
