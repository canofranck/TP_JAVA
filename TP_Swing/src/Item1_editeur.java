

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.security.cert.TrustAnchor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JScrollPane;

import javax.swing.JTextArea;


import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JScrollBar;




public class Item1_editeur {

	private JFrame frame;
	
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item1_editeur window = new Item1_editeur();
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
	public Item1_editeur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblRechercheMot = new JLabel("Recherche du mot");
		lblRechercheMot.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblRechercheMot);
		
		JButton btnChercher = new JButton("Chercher");
		btnChercher.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(btnChercher);
		
		JPanel panelCenter = new JPanel();
		frame.getContentPane().add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		panelCenter.add(scrollPane);
		
		JTextArea txtrDansLePlancher = new JTextArea();
		txtrDansLePlancher.setLineWrap(true);
		txtrDansLePlancher.setWrapStyleWord(true);
		String texteDroite = "Il avait d???abord commenc?? par r??cup??rer des informations depuis l???ordinateur de David, puis il ??tait all?? les chercher sur Internet."
				+ " Il avait lui-m??me programm?? l???ordinateur de David afin d???avoir un premier lien vers le monde ext??rieur : la voix."
				+ "Il pouvait entendre la voix de David, mais ne la comprenait pas. C???est alors qu???il a d??cid?? d???aller lui-m??me ?? l???information."
				+ "Il s???est alors ???transport????? sur Internet afin de choisir une nouvelle ???maison???. Il lui a ??t?? beaucoup plus facile de programmer ce nouvel ordinateur afin d???entendre une nouvelle voix."
				+ "Les deux gardes du corps personnels de David le prirent par le bras et suivirent le g??n??ral. Les militaires s?????taient mis au ?? garde ?? vous ?? sur les c??t??s du couloir. Celui-ci menait ?? un ascenseur."
				+ "Le g??n??ral ins??ra ?? nouveau son badge et la porte s???ouvrit. Il y mont??rent tous les quatre. Il n???y avait pas de niveau d???indiqu??. "
				+ "David se rappelait de ce programme m??langeant deux anciennes technologies. Il s???en souvenait tr??s bien, cinq ann??es de travail acharn?? pour r??aliser un vieux r??ve d???enfant un peu solitaire."
				+ "Il voulait un ami et il avait trouv?? en l???informatique la possibilit?? d???avoir cet ami. Un ami capable de r??fl??chir vite, exempt de sentiment."
				+ "Les deux gardes du corps personnels de David le prirent par le bras et suivirent le g??n??ral. Les militaires s?????taient mis au ?? garde ?? vous ?? sur les c??t??s du couloir. Celui-ci menait ?? un ascenseur "
				+ " Le g??n??ral ins??ra ?? nouveau son badge et la porte s???ouvrit. Il y mont??rent tous les quatre. Il n???y avait pas de niveau d???indiqu??."
				+ "ujourd???hui, c???est son anniversaire. Il a vingt-six ans, mais il ne s???en souvient plus. Il ne pr??te pas attention ?? ce genre de d??tails. David est un homme distrait, timide, mais s??r de lui. "
				+ "Il est grand et mince. De grandes mains prolongent ses longs bras. Il lui serait possible de tenir deux bouteilles de Champagne dans chacune de ses mains, mais il ne boit jamais. L'alcool le rend malade et malheureux, voir d??pressif.";
		txtrDansLePlancher.setText(texteDroite);
		scrollPane.setViewportView(txtrDansLePlancher);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		
//		JList list_1 = new JList();
		
		
	
		
		
		
//		String[] tabStrings=texteDroite.split("[ ,\\\"'?? ??:?;.???]");
//		for (String string : tabStrings) {
//			System.out.println(string);
//		}
		
		
		Pattern p = Pattern.compile("[a-z0-9A-Z??????????????????????????????????????????????????????????????????????????????????????????????????????????]*");
		Matcher m = p.matcher(texteDroite);
		TreeSet<String> coucou = new TreeSet<>();
		while ( m.find() ) {
			if (!m.group().isEmpty()) {
				coucou.add((texteDroite.substring(m.start(), m.end())).toLowerCase());
				
			
//				System.out.println(texteDroite.substring(m.start(), m.end()));
			}
		    
		}
		
		String [] tab = new String[coucou.size()]; 
		int i=0;
		for(String s:coucou) {
			tab[i]=s;i++;
		}
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
//		coucou.forEach(x->list.add(x, panel_1));
		
		JList list_1 = new JList(tab);
//		panel_1.add(list_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_1.add(scrollPane_1);
		scrollPane_1.setViewportView(list_1);
		list_1.setLayoutOrientation(JList.VERTICAL);
//		panel_1.add(list);
		
		
		
		
		
		
		
	}
	
	
	
}
