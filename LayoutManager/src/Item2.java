import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.Window.Type;
import javax.swing.JTextPane;

public class Item2 {

	private JFrame frmEditeurDeTexte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item2 window = new Item2();
					window.frmEditeurDeTexte.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Item2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditeurDeTexte = new JFrame();
		frmEditeurDeTexte.setTitle("Editeur de texte");
		frmEditeurDeTexte.setBounds(100, 100, 553, 400);
		frmEditeurDeTexte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditeurDeTexte.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(0, 0, 537, 65);
		frmEditeurDeTexte.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnChercher = new JButton("New button");
		btnChercher.setBounds(421, 11, 106, 43);
		panel.add(btnChercher);
		
		JLabel lblRecherche = new JLabel("Recherche du mot");
		lblRecherche.setBounds(294, 18, 117, 29);
		panel.add(lblRecherche);
		
		JScrollPane scrollPaneTexte = new JScrollPane();
		scrollPaneTexte.setBorder(new LineBorder(new Color(130, 135, 144), 2, true));
		scrollPaneTexte.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTexte.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneTexte.setBounds(174, 63, 363, 269);
		frmEditeurDeTexte.getContentPane().add(scrollPaneTexte);
		
		JTextPane textPane = new JTextPane();
		scrollPaneTexte.setViewportView(textPane);
		
		JScrollPane scrollMot = new JScrollPane();
		scrollMot.setBorder(new LineBorder(new Color(130, 135, 144), 2));
		scrollMot.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollMot.setBounds(0, 63, 175, 269);
		frmEditeurDeTexte.getContentPane().add(scrollMot);
		
		JTextPane textPane_1 = new JTextPane();
		scrollMot.setViewportView(textPane_1);
	}
}
