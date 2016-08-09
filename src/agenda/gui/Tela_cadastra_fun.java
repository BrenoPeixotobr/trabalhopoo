package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Tela_cadastra_fun extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

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
	public Tela_cadastra_fun() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 12, 165, 19);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 12, 146, 19);
		panel.add(textField_1);
		
		JLabel label = new JLabel("CPF");
		label.setBounds(189, 31, 70, 15);
		panel.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 64, 146, 19);
		panel.add(textField_2);
		
		JLabel label_1 = new JLabel("RG");
		label_1.setBounds(12, 83, 70, 15);
		panel.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 64, 146, 19);
		panel.add(textField_3);
		
		JLabel label_2 = new JLabel("Email");
		label_2.setBounds(189, 83, 70, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Nome");
		label_3.setBounds(12, 31, 70, 15);
		panel.add(label_3);
		
		JButton button = new JButton("Enivar");
		button.setBounds(380, 270, 117, 25);
		panel.add(button);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(12, 114, 128, 19);
		panel.add(textField_4);
		
		JCheckBox checkBox = new JCheckBox("Zap");
		checkBox.setBounds(148, 112, 60, 23);
		panel.add(checkBox);
		
		JLabel label_4 = new JLabel("Telefone");
		label_4.setBounds(12, 137, 70, 15);
		panel.add(label_4);
		
		Button button_1 = new Button("Adicionar");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(206, 110, 86, 23);
		panel.add(button_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 164, 165, 19);
		panel.add(textField_5);
		
		JLabel label_5 = new JLabel("Rua");
		label_5.setBounds(12, 184, 70, 15);
		panel.add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(367, 164, 114, 19);
		panel.add(textField_6);
		
		JLabel label_6 = new JLabel("Bairro");
		label_6.setBounds(367, 184, 70, 15);
		panel.add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(189, 164, 60, 19);
		panel.add(textField_7);
		
		JLabel label_7 = new JLabel("N");
		label_7.setBounds(189, 184, 70, 15);
		panel.add(label_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(261, 164, 63, 19);
		panel.add(textField_8);
		
		JLabel label_8 = new JLabel("Comp.");
		label_8.setBounds(261, 184, 70, 15);
		panel.add(label_8);
		
		textField_9 = new JTextField();
		textField_9.setText("Montes Claros");
		textField_9.setColumns(10);
		textField_9.setBounds(12, 211, 114, 19);
		panel.add(textField_9);
		
		JLabel label_9 = new JLabel("Cidade");
		label_9.setBounds(12, 228, 70, 15);
		panel.add(label_9);
		
		textField_10 = new JTextField();
		textField_10.setText("MG");
		textField_10.setColumns(10);
		textField_10.setBounds(136, 211, 41, 19);
		panel.add(textField_10);
		
		JLabel label_10 = new JLabel("UF");
		label_10.setBounds(138, 228, 70, 15);
		panel.add(label_10);
		
		textField_11 = new JTextField();
		textField_11.setText("39400-000");
		textField_11.setColumns(10);
		textField_11.setBounds(189, 211, 114, 19);
		panel.add(textField_11);
		
		JLabel label_11 = new JLabel("CEP");
		label_11.setBounds(189, 228, 70, 15);
		panel.add(label_11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Maquiador(a)", "Cabeleireiro(a)", "Manicure", "Depelidor(a)"}));
		comboBox.setBounds(380, 9, 117, 24);
		panel.add(comboBox);
		
		
		
	}
}
