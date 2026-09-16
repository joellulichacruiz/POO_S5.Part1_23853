package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		{
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				mnNewMenu = new JMenu("File");
				menuBar.add(mnNewMenu);
			}
			{
				mnNewMenu_1 = new JMenu("Herencia");
				menuBar.add(mnNewMenu_1);
				{
					mntmNewMenuItem = new JMenuItem("Ver círculo");
					mntmNewMenuItem.addActionListener(this);
					mnNewMenu_1.add(mntmNewMenuItem);
				}
			}
			{
				mnNewMenu_2 = new JMenu("Programadores");
				menuBar.add(mnNewMenu_2);
				{
					mntmNewMenuItem_1 = new JMenuItem("Ver Programadores");
					mntmNewMenuItem_1.addActionListener(this);
					mnNewMenu_2.add(mntmNewMenuItem_1);
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_1) {
			do_mntmNewMenuItem_1_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			do_mntmNewMenuItem_actionPerformed(e);
		}
	}
	protected void do_mntmNewMenuItem_actionPerformed(ActionEvent e) {
	Círculo ci=new Círculo();
	ci.setVisible(true);
	}
	protected void do_mntmNewMenuItem_1_actionPerformed(ActionEvent e) {
		programador pro=new programador();
		pro.setVisible(true);
	}
}



