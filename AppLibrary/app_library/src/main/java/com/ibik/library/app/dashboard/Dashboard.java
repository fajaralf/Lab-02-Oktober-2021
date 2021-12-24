package com.ibik.library.app.dashboard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import com.ibik.library.app.model.User;
import com.ibik.library.app.login.LoginDao;
import com.ibik.library.app.login.LoginController;
import com.ibik.library.app.login.LoginController.MyResults;

public class Dashboard extends JFrame {
	/**
	 * 
	 */
	private JTextField textNIK;
	private JTextField textFullname;
	private JTextField textPlaceBirth;
	private JTextField textBirthdate;
	private JTextField textGender;
	private JTextArea textAddress;
	private JTextField textEmail;
	private JPasswordField textPassword;
	private User User;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard(null);
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
	public Dashboard(User user) {
		new JFrame();
		LoginController lc = new LoginController();
		LoginDao ld = new LoginDao();
		this.User = user;
		
		try {
			User u = ld.checkLogin(User);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 440, 600);
			getContentPane().setForeground(SystemColor.textHighlight);
			setTitle("Dashboard");
			getContentPane().setLayout(null);
			
			JLabel labelTitle = new JLabel("Wellcome to This Application");
			labelTitle.setForeground(Color.BLACK);
			labelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
			labelTitle.setBounds(90, 50, 245, 45);
			getContentPane().add(labelTitle);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(24, 134, 377, 420);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel labelPassword = new JLabel("Password");
			labelPassword.setBounds(206, 335, 70, 14);
			panel.add(labelPassword);
			
			textPassword = new JPasswordField(u.getPassword());
			textPassword.setBounds(216, 359, 138, 20);
			panel.add(textPassword);
			textPassword.setColumns(10);

			JLabel labelNIK = new JLabel("NIK");
			labelNIK.setBounds(27, 26, 70, 14);
			panel.add(labelNIK);
			
			textNIK = new JTextField(u.getNIK());
			textNIK.setBounds(27, 50, 138, 20);
			panel.add(textNIK);
			textNIK.setColumns(10);

			JLabel labelFullname = new JLabel("Fullname");
			labelFullname.setBounds(206, 26, 70, 14);
			panel.add(labelFullname);
			
			textFullname = new JTextField(u.getFullname());
			textFullname.setBounds(206, 50, 138, 20);
			panel.add(textFullname);
			textFullname.setColumns(10);

			JLabel labelPlaceBirth = new JLabel("PlaceBirth");
			labelPlaceBirth.setBounds(27, 94, 70, 14);
			panel.add(labelPlaceBirth);
			
			textPlaceBirth = new JTextField(u.getPlaceBirth());
			textPlaceBirth.setBounds(27, 118, 86, 20);
			panel.add(textPlaceBirth);
			textPlaceBirth.setColumns(10);

			JLabel labelBirthdate = new JLabel("Birthdate");
			labelBirthdate.setBounds(126, 94, 70, 14);
			panel.add(labelBirthdate);
			
			textBirthdate = new JTextField(u.getBirthdate());
			textBirthdate.setBounds(123, 118, 105, 20);
			panel.add(textBirthdate);
			textBirthdate.setColumns(10);

			JLabel labelGender = new JLabel("Gender");
			labelGender.setBounds(247, 94, 70, 14);
			panel.add(labelGender);
			
			textGender = new JTextField(u.getGender());
			textGender.setBounds(238, 118, 106, 20);
			panel.add(textGender);
			textGender.setColumns(10);

			JLabel labelAddress = new JLabel("Address");
			labelAddress.setBounds(27, 160, 70, 14);
			panel.add(labelAddress);
			
			textAddress = new JTextArea(u.getAddress());
			textAddress.setBounds(27, 184, 317, 141);
			panel.add(textAddress);
			textAddress.setColumns(10);

			JLabel labelEmail = new JLabel("Email");
			labelEmail.setBounds(27, 335, 70, 14);
			panel.add(labelEmail);
			
			textEmail = new JTextField(u.getEmail());
			textEmail.setBounds(27, 359, 138, 20);
			panel.add(textEmail);
			textEmail.setColumns(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
