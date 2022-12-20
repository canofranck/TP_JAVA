import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TP_Swing {

	private JFrame frmConnectionAvecVotre;
	private JTextField textSpeudo;
	private JTextField textAffichageSpeudo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TP_Swing window = new TP_Swing();
					window.frmConnectionAvecVotre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TP_Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConnectionAvecVotre = new JFrame();
		frmConnectionAvecVotre.setTitle("Connection avec votre speudo");
		frmConnectionAvecVotre.setBounds(100, 100, 450, 300);
		frmConnectionAvecVotre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConnectionAvecVotre.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrez votre pseudo");
		lblNewLabel.setBounds(10, 33, 116, 14);
		frmConnectionAvecVotre.getContentPane().add(lblNewLabel);
		
		textSpeudo = new JTextField();
		textSpeudo.setBounds(164, 30, 116, 17);
		frmConnectionAvecVotre.getContentPane().add(textSpeudo);
		textSpeudo.setColumns(10);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnAnnuler.setBounds(21, 133, 121, 49);
		frmConnectionAvecVotre.getContentPane().add(btnAnnuler);
		
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAffichageSpeudo.setText("");
				textSpeudo.setText("");
			}
		});
		btnEffacer.setBounds(164, 133, 116, 49);
		frmConnectionAvecVotre.getContentPane().add(btnEffacer);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAffichageSpeudo.setText(textSpeudo.getText());
			}
		});
		btnOK.setBounds(307, 115, 117, 67);
		frmConnectionAvecVotre.getContentPane().add(btnOK);
		
		JLabel lblVotreSpeudo = new JLabel("voici votre speudo : ");
		lblVotreSpeudo.setBounds(36, 207, 130, 14);
		frmConnectionAvecVotre.getContentPane().add(lblVotreSpeudo);
		
		textAffichageSpeudo = new JTextField();
		textAffichageSpeudo.setBounds(201, 204, 146, 20);
		frmConnectionAvecVotre.getContentPane().add(textAffichageSpeudo);
		textAffichageSpeudo.setColumns(10);
	}
}
