import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JComboBox;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField textTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void bntTest_Clic() {
		textTest.setText("Hello !");
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\TP_JAVA\\TP300_Installation_Swing_Youtube\\media\\javafx_logo-300x278.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Bouton de test");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bntTest_Clic();
				
			}
		});
		btnNewButton.setBounds(419, 91, 144, 87);
		contentPane.add(btnNewButton);
		
		textTest = new JTextField();
		textTest.setBounds(478, 439, 153, 78);
		contentPane.add(textTest);
		textTest.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("check 1");
		chckbxNewCheckBox.setBounds(87, 299, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("check 2");
		chckbxNewCheckBox_1.setBounds(234, 299, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		// Pour une image
		
		JLabel lblNewLabel = new JLabel("");
		String chemin = "image_clone.jpg";
		
		lblNewLabel.setIcon(new ImageIcon("E:\\TP_JAVA\\TP_install_Javafx\\media\\javafx_logo-300x278.jpg"));
		lblNewLabel.setBounds(-33, -12, 1748, 1000);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(442, 275, 30, 22);
		contentPane.add(comboBox);
	
}
}
