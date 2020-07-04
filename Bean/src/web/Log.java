package web;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Log extends JFrame {


	private JTextField textField;
	private JTextField pasword;
    private static Connection connection;
    
	
					JFrame frame = new JFrame();
					frame.setSize(300, 720);
					frame.setVisible(true);

		
		 setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONNEXION");
		lblNewLabel.setBackground(new Color(127, 255, 212));
		lblNewLabel.setForeground(new Color(230, 230, 250));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(81, 11, 154, 41);
		contentPane.add(lblNewLabel);
		
		JLabel login = new JLabel("login");
		login.setBounds(10, 69, 46, 14);
		contentPane.add(login);
		
		JTextField login1 = new JTextField();
		login1.setBounds(10, 87, 221, 26);
		contentPane.add(login1);
		textField.setColumns(10);
		
		JLabel password = new JLabel("Password");
		password.setBounds(10, 139, 46, 14);
		contentPane.add(password);
		
		JTextField password1 = new JTextField();
		password1.setBounds(10, 156, 221, 26);
		contentPane.add(password1);
		password1.setColumns(10);
		
		JButton btnNewButton = new JButton("enregistrer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/souna ","root","")	;
			PreparedStatement ps = con.prepareStatement("insert into produit (designation,prix) values(?,?);");
			ps.setString(1,password1.getText());
			ps.setString(2,login1.getText());
		
			 int x = ps.executeUpdate();
		     con.close();
		     if(x>0) {
		    	 System.out.println("success operation");
		     }
		     else {
		    	 System.out.println("error");
		     }
				}
				
				catch(Exception e1) {
					System.out.println("erreur de saisie");
				}
			}
		});
		btnNewButton.setBounds(29, 210, 202, 26);
		contentPane.add(btnNewButton);
				
		
	}
}