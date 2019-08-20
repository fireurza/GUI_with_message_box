import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignment_1 {

	private JFrame frame;
	private JTextField textFName;
	private JTextField texLName;
	private JTextField textCity;
	private JTextField textState;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment_1 window = new Assignment_1();
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
	public Assignment_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 710, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(59, 25, 74, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(59, 50, 74, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(59, 77, 46, 14);
		frame.getContentPane().add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(59, 102, 46, 14);
		frame.getContentPane().add(lblState);
		
		JLabel lblHobbies = new JLabel("Hobbies:");
		lblHobbies.setBounds(59, 138, 56, 14);
		frame.getContentPane().add(lblHobbies);
		
		JCheckBox chckbxSports = new JCheckBox("Sports");
		chckbxSports.setBounds(140, 134, 97, 23);
		frame.getContentPane().add(chckbxSports);
		
		JCheckBox chckbxPainting = new JCheckBox("Painting");
		chckbxPainting.setBounds(283, 134, 97, 23);
		frame.getContentPane().add(chckbxPainting);
		
		JCheckBox chckbxCooking = new JCheckBox("Cooking");
		chckbxCooking.setBounds(445, 134, 97, 23);
		frame.getContentPane().add(chckbxCooking);
		
		JCheckBox chckbxGaming = new JCheckBox("Gaming");
		chckbxGaming.setBounds(140, 174, 97, 23);
		frame.getContentPane().add(chckbxGaming);
		
		JCheckBox chckbxBlogging = new JCheckBox("Blogging");
		chckbxBlogging.setBounds(283, 174, 97, 23);
		frame.getContentPane().add(chckbxBlogging);
		
		JLabel lblCommunicationPreference = new JLabel("Communication Preference:");
		lblCommunicationPreference.setBounds(229, 218, 170, 14);
		frame.getContentPane().add(lblCommunicationPreference);
		
		JRadioButton rdbtnTextMsg = new JRadioButton("Text Message");
		buttonGroup.add(rdbtnTextMsg);
		rdbtnTextMsg.setBounds(405, 188, 109, 23);
		frame.getContentPane().add(rdbtnTextMsg);
		
		JRadioButton rdbtnEmail = new JRadioButton("Email");
		buttonGroup.add(rdbtnEmail);
		rdbtnEmail.setBounds(405, 214, 109, 23);
		frame.getContentPane().add(rdbtnEmail);
		
		JRadioButton rdbtnPhone = new JRadioButton("Phone Call");
		buttonGroup.add(rdbtnPhone);
		rdbtnPhone.setBounds(405, 240, 109, 23);
		frame.getContentPane().add(rdbtnPhone);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(76, 275, 549, 165);
		frame.getContentPane().add(textArea);
		
		textFName = new JTextField();
		textFName.setBounds(151, 22, 86, 20);
		frame.getContentPane().add(textFName);
		textFName.setColumns(10);
		
		texLName = new JTextField();
		texLName.setBounds(151, 47, 86, 20);
		frame.getContentPane().add(texLName);
		texLName.setColumns(10);
		
		textCity = new JTextField();
		textCity.setBounds(151, 74, 86, 20);
		frame.getContentPane().add(textCity);
		textCity.setColumns(10);
		
		textState = new JTextField();
		textState.setBounds(151, 99, 86, 20);
		frame.getContentPane().add(textState);
		textState.setColumns(10);
		
		JLabel lblUserEntry = new JLabel("User Entry:");
		lblUserEntry.setBounds(6, 281, 68, 14);
		frame.getContentPane().add(lblUserEntry);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str ="First Name: " + textFName.getText() + "\n";
				str += "Last Name: " + texLName.getText() + "\n";
				str += "City: " + textCity.getText() + "\n";
				str += "State: " + textState.getText() + "\n";
				Boolean sports = chckbxSports.isSelected();
				Boolean gaming = chckbxGaming.isSelected();
				Boolean painting = chckbxPainting.isSelected();
				Boolean blogging = chckbxBlogging.isSelected();
				Boolean cooking = chckbxCooking.isSelected();
				
				str += "Hobbies: ";
				if (sports) str += " Sports ";
				if (gaming) str += " Gaming ";
				if (painting) str += " Painting ";
				if (blogging) str += " Blogging ";
				if (cooking) str += " Cooking ";
				
				Boolean textmsg = rdbtnTextMsg.isSelected();
				Boolean email = rdbtnEmail.isSelected();
				Boolean phone = rdbtnPhone.isSelected();
				
				str += "\nContact by: ";
				if (textmsg) str += "Text Message";
				else if (email) str += "Email";
				else if (phone) str += "Phone Call";
				
				textArea.setText(str);
				
			}
		});
		btnSubmit.setBounds(535, 214, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
}
