import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import keeptoo.KTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import keeptoo.Drag;
import keeptoo.KButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private JTextField txtAProjectOn;
	private JTextField txtInventoryManagementSystem;
	private JTextField txtWelcome;
	private JLabel lblNewLabel;
	private JLabel label_1;
	private JTextField txtByKartik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1248, 798);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkStartColor(new Color(0, 255, 255));
		gradientPanel.setkEndColor(new Color(128, 0, 128));
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
		gradientPanel.setkGradientFocus(600);
		gradientPanel.setBounds(0, 0, 1250, 796);
		contentPane.add(gradientPanel, BorderLayout.CENTER);
		getContentPane().add(gradientPanel,BorderLayout.CENTER);
		gradientPanel.setLayout(null);
		
		txtAProjectOn = new JTextField();
		txtAProjectOn.setBounds(598, 314, 132, 40);
		txtAProjectOn.setBorder(null);
		txtAProjectOn.setFont(new Font("Segoe UI", Font.ITALIC, 22));
		txtAProjectOn.setOpaque(false);
		txtAProjectOn.setForeground(new Color(255, 255, 255));
		txtAProjectOn.setText("A Project on ");
		gradientPanel.add(txtAProjectOn);
		txtAProjectOn.setColumns(10);
		
		txtInventoryManagementSystem = new JTextField();
		txtInventoryManagementSystem.setBounds(429, 382, 547, 54);
		txtInventoryManagementSystem.setBorder(null);
		txtInventoryManagementSystem.setText("Inventory Management System");
		txtInventoryManagementSystem.setOpaque(false);
		txtInventoryManagementSystem.setForeground(Color.WHITE);
		txtInventoryManagementSystem.setFont(new Font("Georgia", Font.ITALIC, 35));
		txtInventoryManagementSystem.setColumns(10);
		gradientPanel.add(txtInventoryManagementSystem);
		
		JLabel label = new JLabel("X");
		label.setBounds(1221, 13, 29, 32);
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				
				System.exit(0);
			}
		});
		
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Segoe UI", Font.BOLD, 22));
		gradientPanel.add(label);
		
		txtWelcome = new JTextField();
		txtWelcome.setBounds(450, 188, 427, 77);
		txtWelcome.setText("WELCOME");
		txtWelcome.setOpaque(false);
		txtWelcome.setForeground(Color.WHITE);
		txtWelcome.setFont(new Font("Harrington", Font.ITALIC, 80));
		txtWelcome.setColumns(10);
		txtWelcome.setBorder(null);
		gradientPanel.add(txtWelcome);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(533, 461, 300, 240);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kartik\\Downloads\\box.png"));
		gradientPanel.add(lblNewLabel);
		
		label_1 = new JLabel("");
		label_1.setBounds(33, 26, 165, 157);
		label_1.setIcon(new ImageIcon("C:\\Users\\kartik\\Downloads\\inventory.png"));
		gradientPanel.add(label_1);
		
		txtByKartik = new JTextField();
		txtByKartik.setBounds(1104, 735, 132, 40);
		txtByKartik.setText("By Kartik");
		txtByKartik.setOpaque(false);
		txtByKartik.setForeground(Color.WHITE);
		txtByKartik.setFont(new Font("Segoe UI", Font.ITALIC, 22));
		txtByKartik.setColumns(10);
		txtByKartik.setBorder(null);
		gradientPanel.add(txtByKartik);
		
		KButton btnClickHere = new KButton();
		btnClickHere.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnClickHere.setForeground(new Color(0, 0, 0));
		btnClickHere.setkEndColor(new Color(51, 255, 255));
		btnClickHere.setkStartColor(new Color(255, 102, 255));
		btnClickHere.setBounds(46, 737, 185, 45);
		btnClickHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				new Menu().setVisible(true);
				dispose();
				
			}

			
		});
		btnClickHere.setText("click here");
		gradientPanel.add(btnClickHere);
	
	}
	
	
	
	
	
}
