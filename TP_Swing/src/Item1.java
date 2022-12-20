import java.awt.EventQueue;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Item1 {

	private JFrame frame;
	private JTextField textNom;
	private JTextField textAdresseIp;
	private JTextField textUtilisateur;
	private JTextField textOs;
	private JTextField textMachinevirtuelle;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item1 window = new Item1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Item1()throws Exception {
		
		initialize();
		Properties info = System.getProperties ();
		String user = info.getProperty ("user.name");
		String os = info.getProperty("os.name");
		InetAddress ip = InetAddress.getLocalHost();
		String nomHote = (String)ip.getHostName();
		String vm=info.getProperty("java.vm.name");
	     
	      textAdresseIp.setText(ip.getHostAddress());
	      textNom.setText(nomHote);
	      textUtilisateur.setText(user);
	      textOs.setText(os);
	      textMachinevirtuelle.setText(vm);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 687, 293);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNom = new JLabel("Nom de la machine");
		lblNom.setBounds(127, 43, 151, 14);
		frame.getContentPane().add(lblNom);
		
		JLabel lblAdresseIp = new JLabel("Adresse IP");
		lblAdresseIp.setBounds(126, 77, 117, 14);
		frame.getContentPane().add(lblAdresseIp);
		
		JLabel lblUtilisateur = new JLabel("Utilisateur");
		lblUtilisateur.setBounds(127, 111, 116, 14);
		frame.getContentPane().add(lblUtilisateur);
		
		JLabel lblOs = new JLabel("Nom de l'OS");
		lblOs.setBounds(127, 150, 128, 14);
		frame.getContentPane().add(lblOs);
		
		JLabel lblMvirtuel = new JLabel("Machine virtuelle");
		lblMvirtuel.setBounds(127, 192, 128, 14);
		frame.getContentPane().add(lblMvirtuel);
		
		textNom = new JTextField();
		textNom.setBounds(389, 40, 260, 20);
		frame.getContentPane().add(textNom);
		textNom.setColumns(10);
		
		textAdresseIp = new JTextField();
		textAdresseIp.setBounds(389, 74, 260, 20);
		frame.getContentPane().add(textAdresseIp);
		textAdresseIp.setColumns(10);
		
		textUtilisateur = new JTextField();
		textUtilisateur.setBounds(389, 111, 260, 20);
		frame.getContentPane().add(textUtilisateur);
		textUtilisateur.setColumns(10);
		
		textOs = new JTextField();
		textOs.setBounds(387, 147, 262, 20);
		frame.getContentPane().add(textOs);
		textOs.setColumns(10);
		
		textMachinevirtuelle = new JTextField();
		textMachinevirtuelle.setBounds(389, 189, 260, 20);
		frame.getContentPane().add(textMachinevirtuelle);
		textMachinevirtuelle.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 43, 107, 124);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\TP_JAVA\\TestWindowBuilder\\src\\media\\Java.png"));
		lblNewLabel_1.setBounds(10, 43, 107, 137);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
