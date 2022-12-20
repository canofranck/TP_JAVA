import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Item3 {

	private JFrame frmFrancaiseDesJeux;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item3 window = new Item3();
					window.frmFrancaiseDesJeux.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Item3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFrancaiseDesJeux = new JFrame();
		frmFrancaiseDesJeux.setTitle("Francaise des Jeux");
		frmFrancaiseDesJeux.setBounds(100, 100, 655, 398);
		frmFrancaiseDesJeux.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFrancaiseDesJeux.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\TP_JAVA\\TestWindowBuilder\\src\\media\\loto.png"));
		lblNewLabel.setBounds(110, 25, 412, 112);
		frmFrancaiseDesJeux.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxPremier = new JCheckBox("Premier");
		buttonGroup.add(chckbxPremier);
		chckbxPremier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		chckbxPremier.setBounds(98, 212, 97, 23);
		frmFrancaiseDesJeux.getContentPane().add(chckbxPremier);
		
		JCheckBox chckbxsecond = new JCheckBox("Second");
		buttonGroup.add(chckbxsecond);
		chckbxsecond.setBounds(347, 212, 97, 23);
		frmFrancaiseDesJeux.getContentPane().add(chckbxsecond);
		
		JLabel lblDatetirage = new JLabel("date du tirage");
		lblDatetirage.setBounds(63, 259, 89, 14);
		frmFrancaiseDesJeux.getContentPane().add(lblDatetirage);
		
		JLabel lblchiffre1 = new JLabel("");
		lblchiffre1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblchiffre1.setBounds(50, 284, 46, 37);
		frmFrancaiseDesJeux.getContentPane().add(lblchiffre1);
		
		JLabel lblchiffre2 = new JLabel("");
		lblchiffre2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblchiffre2.setBounds(131, 284, 46, 37);
		frmFrancaiseDesJeux.getContentPane().add(lblchiffre2);
		
		JLabel lblchiffre3 = new JLabel("");
		lblchiffre3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblchiffre3.setBounds(218, 284, 46, 37);
		frmFrancaiseDesJeux.getContentPane().add(lblchiffre3);
		
		JLabel lblchiffre4 = new JLabel("");
		lblchiffre4.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblchiffre4.setBounds(303, 284, 46, 37);
		frmFrancaiseDesJeux.getContentPane().add(lblchiffre4);
		
		JLabel lblchiffre5 = new JLabel("");
		lblchiffre5.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblchiffre5.setBounds(387, 284, 46, 37);
		frmFrancaiseDesJeux.getContentPane().add(lblchiffre5);
		
		JLabel lblchiffre6 = new JLabel("");
		lblchiffre6.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblchiffre6.setBounds(468, 284, 46, 37);
		frmFrancaiseDesJeux.getContentPane().add(lblchiffre6);
		
		JLabel lblchiffre7 = new JLabel("");
		lblchiffre7.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblchiffre7.setBounds(551, 284, 46, 37);
		frmFrancaiseDesJeux.getContentPane().add(lblchiffre7);
	}
}
