import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;


import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import keeptoo.KButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

import keeptoo.Drag;
import javax.swing.JComponent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class NextPage extends JFrame
{
  NextPage()
 {
 setDefaultCloseOperation(javax.swing.
  WindowConstants.DISPOSE_ON_CLOSE);
 setTitle("Login Success");
 setSize(400, 200);
  }
 }
 



public class Login {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(0, 0, 1294, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	KGradientPanel gradientPanel = new KGradientPanel();
	gradientPanel.setkEndColor(new Color(0, 0, 139));
	gradientPanel.setkGradientFocus(0);
	gradientPanel.setBorder(null);
	gradientPanel.setOpaque(false);
		gradientPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {
				
				new Drag(gradientPanel).onPress(evt);
			}
		});
		
	
		
		gradientPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				
				new Drag(gradientPanel).moveWindow(evt);
				
			}
		});

		gradientPanel.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(gradientPanel, BorderLayout.CENTER);
		gradientPanel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(484, 220, 359, 46);
		txtUsername.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		txtUsername.setForeground(new Color(255, 255, 255));
		txtUsername.setOpaque(false);
		txtUsername.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		gradientPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(484, 321, 359, 38);
		pwdPassword.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		pwdPassword.setOpaque(false);
		gradientPanel.add(pwdPassword);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(484, 199, 85, 27);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(192, 192, 192));
		gradientPanel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(484, 295, 85, 27);
		lblPassword.setForeground(new Color(192, 192, 192));
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		gradientPanel.add(lblPassword);
		
		KButton btnReset = new KButton();
		btnReset.setBounds(680, 437, 163, 38);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			txtUsername.setText(null);
			pwdPassword.setText(null);	
				
			}
		});
		btnReset.setForeground(new Color(192, 192, 192));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setBorder(null);
		btnReset.setkHoverForeGround(new Color(238, 130, 238));
		btnReset.setkHoverStartColor(new Color(30, 144, 255));
		btnReset.setText("Reset");
		btnReset.setOpaque(false);
		btnReset.kStartColor = Color.MAGENTA;
		btnReset.setkStartColor(Color.MAGENTA);
		btnReset.kEndColor = Color.BLUE;
		btnReset.setkEndColor(Color.BLUE);
		btnReset.kBorderRadius = 40;
		btnReset.setkBorderRadius(40);
		btnReset.setBackground(SystemColor.menu);
		gradientPanel.add(btnReset);
		
		KButton btnSignin = new KButton();		
		btnSignin.setBounds(484, 437, 163, 38);
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String t=new String();
				t=txtUsername.getText();
				
				String p=new String();
				p=pwdPassword.getText();
				
			
				
				if(t.equals("kartik")&&p.equals("123")) {
					
					new Welcome().setVisible(true);
					
					dispose();
	
				}
				
				else {
					
					JOptionPane.showMessageDialog(null, "Enter valid username and password!");
					
					
					
				
				}
				

		}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}

		

			
		});
		btnSignin.setForeground(new Color(192, 192, 192));
		btnSignin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSignin.setText("SignIn");
		btnSignin.setOpaque(false);
		btnSignin.kStartColor = Color.MAGENTA;
		btnSignin.setkStartColor(Color.MAGENTA);
		btnSignin.kHoverStartColor = new Color(30, 144, 255);
		btnSignin.setkHoverStartColor(new Color(30, 144, 255));
		btnSignin.kHoverForeGround = new Color(238, 130, 238);
		btnSignin.setkHoverForeGround(new Color(238, 130, 238));
		btnSignin.kEndColor = Color.BLUE;
		btnSignin.setkEndColor(Color.BLUE);
		btnSignin.kBorderRadius = 40;
		btnSignin.setkBorderRadius(40);
		btnSignin.setBorder(null);
		btnSignin.setBackground(SystemColor.menu);
		gradientPanel.add(btnSignin);
		
		JLabel lblOrSiginWith = new JLabel("Or SignIn with");
		lblOrSiginWith.setBounds(671, 575, 106, 27);
		lblOrSiginWith.setForeground(Color.LIGHT_GRAY);
		lblOrSiginWith.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		gradientPanel.add(lblOrSiginWith);
		
		JLabel lblNewLabel_1 = new JLabel("Inventory Management System");
		lblNewLabel_1.setBounds(456, 13, 617, 96);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 34));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		gradientPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("By Kartik");
		lblNewLabel_2.setBounds(68, 575, 106, 46);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		gradientPanel.add(lblNewLabel_2);
		
		KButton button = new KButton();
		button.setBounds(837, 552, 41, 61);
		button.setIcon(new ImageIcon("C:\\Users\\kartik\\Downloads\\facebook (1).png"));
		button.setOpaque(false);
		button.kStartColor = Color.MAGENTA;
		button.setkStartColor(Color.MAGENTA);
		button.kHoverStartColor = new Color(30, 144, 255);
		button.setkHoverStartColor(new Color(30, 144, 255));
		button.kHoverForeGround = new Color(238, 130, 238);
		button.setkHoverForeGround(new Color(238, 130, 238));
		button.kEndColor = Color.BLUE;
		button.setkEndColor(Color.BLUE);
		button.kBorderRadius = 40;
		button.setkBorderRadius(40);
		button.setForeground(Color.LIGHT_GRAY);
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBorder(null);
		button.setBackground(SystemColor.menu);
		gradientPanel.add(button);
		
		KButton button_2 = new KButton();
		button_2.setBounds(1032, 552, 41, 61);
		button_2.setIcon(new ImageIcon("C:\\Users\\kartik\\Downloads\\gmail.png"));
		button_2.setOpaque(false);
		button_2.kStartColor = Color.MAGENTA;
		button_2.setkStartColor(Color.MAGENTA);
		button_2.kHoverStartColor = new Color(30, 144, 255);
		button_2.setkHoverStartColor(new Color(30, 144, 255));
		button_2.kHoverForeGround = new Color(238, 130, 238);
		button_2.setkHoverForeGround(new Color(238, 130, 238));
		button_2.kEndColor = Color.BLUE;
		button_2.setkEndColor(Color.BLUE);
		button_2.kBorderRadius = 40;
		button_2.setkBorderRadius(40);
		button_2.setForeground(Color.LIGHT_GRAY);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_2.setBorder(null);
		button_2.setBackground(SystemColor.menu);
		gradientPanel.add(button_2);
		
		KButton button_1 = new KButton();
		button_1.setBounds(930, 552, 41, 61);
		button_1.setIcon(new ImageIcon("C:\\Users\\kartik\\Downloads\\twitter.png"));
		button_1.setOpaque(false);
		button_1.kStartColor = Color.MAGENTA;
		button_1.setkStartColor(Color.MAGENTA);
		button_1.kHoverStartColor = new Color(30, 144, 255);
		button_1.setkHoverStartColor(new Color(30, 144, 255));
		button_1.kHoverForeGround = new Color(238, 130, 238);
		button_1.setkHoverForeGround(new Color(238, 130, 238));
		button_1.kEndColor = Color.BLUE;
		button_1.setkEndColor(Color.BLUE);
		button_1.kBorderRadius = 40;
		button_1.setkBorderRadius(40);
		button_1.setForeground(Color.LIGHT_GRAY);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBorder(null);
		button_1.setBackground(SystemColor.menu);
		gradientPanel.add(button_1);
		
		JLabel btn_exit = new JLabel("X");
		btn_exit.setBounds(1269, 13, 23, 32);
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				
				System.exit(0);
			}
		});
		btn_exit.setForeground(Color.WHITE);
		btn_exit.setFont(new Font("Segoe UI", Font.BOLD, 22));
		gradientPanel.add(btn_exit);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(628, 106, 80, 72);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\kartik\\Downloads\\use r.png"));
		gradientPanel.add(lblNewLabel_3);
	}

	

	
	
}
