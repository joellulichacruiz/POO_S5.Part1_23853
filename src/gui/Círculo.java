package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Círculo extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Círculo dialog = new Círculo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Círculo() {
		setTitle("Círculo");
		setBounds(100, 100, 815, 748);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("Radio");
			lblNewLabel.setBounds(10, 24, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setBounds(97, 21, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("Área");
			lblNewLabel_1.setBounds(10, 60, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(97, 52, 86, 20);
			textField_1.setEditable(false);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Longitud");
			lblNewLabel_2.setBounds(10, 96, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(97, 93, 86, 20);
			textField_2.setEnabled(false);
			textField_2.setEditable(false);
			textField_2.setText(" ");
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			btnNewButton = new JButton("Calcular");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(247, 20, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Limpiar");
			btnNewButton_1.setBounds(247, 56, 89, 23);
			contentPanel.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Salir");
			btnNewButton_2.setBounds(247, 92, 89, 23);
			contentPanel.add(btnNewButton_2);
		}
		{
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(Círculo.class.getResource("/imagen/Círculo.png")));
			lblNewLabel_3.setBounds(96, 135, 554, 554);
			contentPanel.add(lblNewLabel_3);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		//Insertar accion
	}
}
