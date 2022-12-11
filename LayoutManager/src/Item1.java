import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Rectangle;

public class Item1 {

	private JFrame frmProprietesSystme;
	private JTextField textNom;
	private JTextField textAdresseIp;
	private JTextField textUtilisateur;
	private JTextField textOs;
	private JTextField textMachinevirtuelle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item1 window = new Item1();
					window.frmProprietesSystme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws UnknownHostException 
	 */
	public Item1() throws UnknownHostException {
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
		frmProprietesSystme = new JFrame();
		frmProprietesSystme.setTitle("Proprietes système");
		frmProprietesSystme.setBounds(100, 100, 658, 300);
		frmProprietesSystme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProprietesSystme.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(159, 0, 213, 261);
		frmProprietesSystme.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(5, 5, 0, 0));
		
		JLabel lblNom = new JLabel("Nom de la machine");
		panel_1.add(lblNom);
		
		JLabel lblAdresseIp = new JLabel("Adresse IP");
		panel_1.add(lblAdresseIp);
		
		JLabel lblUtilisateur = new JLabel("Utilisateur");
		panel_1.add(lblUtilisateur);
		
		JLabel lblOs = new JLabel("Nom de l'OS");
		panel_1.add(lblOs);
		
		JLabel lblMvirtuel = new JLabel("Machine virtuelle");
		panel_1.add(lblMvirtuel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 154, 261);
		frmProprietesSystme.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setHorizontalTextPosition(SwingConstants.CENTER);
		lbllogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogo.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbllogo.setIcon(new ImageIcon("D:\\TP_JAVA\\TestWindowBuilder\\src\\media\\Java.png"));
		panel.add(lbllogo, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_2.setBounds(370, 0, 272, 261);
		frmProprietesSystme.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(5, 0, 0, 15));
		
		textNom = new JTextField();
		textNom.setText("STA6017325");
		textNom.setColumns(10);
		panel_2.add(textNom);
		
		textAdresseIp = new JTextField();
		textAdresseIp.setText("10.75.26.85");
		textAdresseIp.setColumns(10);
		panel_2.add(textAdresseIp);
		
		textUtilisateur = new JTextField();
		textUtilisateur.setText("77011-05-05");
		textUtilisateur.setColumns(10);
		panel_2.add(textUtilisateur);
		
		textOs = new JTextField();
		textOs.setText("Windows 10");
		textOs.setColumns(10);
		panel_2.add(textOs);
		
		textMachinevirtuelle = new JTextField();
		textMachinevirtuelle.setText("OpenJDK 64-Bit Server VM");
		textMachinevirtuelle.setColumns(10);
		panel_2.add(textMachinevirtuelle);
	}
}
