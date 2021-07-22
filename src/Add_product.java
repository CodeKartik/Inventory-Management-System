import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import keeptoo.KButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class Add_product extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_product frame = new Add_product();
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
	public Add_product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setForeground(new Color(0, 0, 51));
		gradientPanel.setkGradientFocus(-10);
		gradientPanel.setkStartColor(new Color(255, 153, 204));
		gradientPanel.setkEndColor(Color.CYAN);
		gradientPanel.setBounds(0, 0, 974, 619);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblProductQuantity = new JLabel("Product Quantity :");
		lblProductQuantity.setBounds(97, 237, 249, 55);
		lblProductQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		gradientPanel.add(lblProductQuantity);
		
		JLabel lblProductCost = new JLabel("Product Cost :");
		lblProductCost.setBounds(97, 342, 221, 55);
		lblProductCost.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		gradientPanel.add(lblProductCost);
		
		JLabel lblProductName = new JLabel("Product Name :");
		lblProductName.setBounds(97, 140, 221, 55);
		lblProductName.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		gradientPanel.add(lblProductName);
		
		textField = new JTextField();
		textField.setBounds(410, 153, 291, 45);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 0, 153)));
		textField.setOpaque(false);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		gradientPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(410, 237, 291, 45);
		textField_1.setOpaque(false);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 0, 204)));
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField_1.setColumns(10);
		gradientPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(410, 342, 291, 45);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 0, 153)));
		textField_2.setOpaque(false);
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField_2.setColumns(10);
		gradientPanel.add(textField_2);
		
		KButton btnSubmit = new KButton();
		btnSubmit.setBounds(133, 484, 185, 45);
		btnSubmit.setBorder(null);
		btnSubmit.setkSelectedColor(new Color(255, 0, 255));
		btnSubmit.setkBackGroundColor(new Color(255, 0, 255));
		btnSubmit.setkBorderRadius(40);
		btnSubmit.kHoverForeGround = new Color(0, 0, 0);
		btnSubmit.setkHoverStartColor(new Color(255, 255, 204));
		btnSubmit.setkHoverForeGround(new Color(0, 0, 0));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String a=textField.getText();
				String b=textField_1.getText();
				String c=textField_2.getText();
			
				try {
					
				Conn cn= new Conn();
				String q="insert into Add_product values('"+a+"','"+b+"','"+c+"')";
				JOptionPane.showMessageDialog(null,"Details Succesfully Inserted");
				
				cn.s.executeUpdate(q);
				
				System.out.println(q);
					
				}
				catch(Exception e) {
					
			       System.out.println("The error is :"+e);
					
				}
				
				
			}
		});
		btnSubmit.setkIndicatorColor(new Color(0, 0, 0));
		btnSubmit.setkHoverEndColor(new Color(102, 204, 255));
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSubmit.setForeground(new Color(0, 0, 0));
		btnSubmit.setText("Submit");
		btnSubmit.setkEndColor(new Color(255, 102, 51));
		btnSubmit.setkStartColor(new Color(255, 255, 102));
		gradientPanel.add(btnSubmit);
		
		KButton btnBack = new KButton();
		btnBack.setBounds(516, 484, 185, 45);
		btnBack.setBorder(null);
		btnBack.setkBorderRadius(40);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				new Menu().setVisible(true);
				dispose();
				
				
			}
		});
		btnBack.setkHoverStartColor(new Color(255, 255, 204));
		btnBack.setkHoverForeGround(new Color(0, 0, 0));
		btnBack.setkHoverEndColor(new Color(153, 204, 255));
		btnBack.setText("Back");
		btnBack.kStartColor = Color.WHITE;
		btnBack.setkStartColor(new Color(255, 255, 102));
		btnBack.kEndColor = new Color(255, 102, 255);
		btnBack.setkEndColor(new Color(255, 102, 0));
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		gradientPanel.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Adding Product.........");
		lblNewLabel.setFont(new Font("Harrington", Font.PLAIN, 50));
		lblNewLabel.setBounds(205, 35, 496, 64);
		gradientPanel.add(lblNewLabel);
	}
}
