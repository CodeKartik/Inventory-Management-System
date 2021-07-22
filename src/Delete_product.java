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
import java.awt.Window;

import javax.swing.JTextField;
import keeptoo.KTextField;
import keeptoo.KButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class Delete_product extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_product frame = new Delete_product();
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
	public Delete_product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkGradientFocus(-10);
		gradientPanel.setkStartColor(new Color(255, 182, 193));
		gradientPanel.setkEndColor(Color.CYAN);
		gradientPanel.setBounds(0, 0, 549, 327);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter name of the product to be deleted");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(47, 54, 411, 33);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name   :");
		lblName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblName.setBounds(75, 144, 105, 33);
		gradientPanel.add(lblName);
		
		KButton btnConfirm = new KButton();
		btnConfirm.setBorder(null);
		btnConfirm.setkBorderRadius(40);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String str=textField.getText();

				try {
					
					Conn cn=new Conn();
					String s="delete from Add_product where pro_name ='"+str+"'";
			        cn.s.executeUpdate(s);
					JOptionPane.showMessageDialog(null,"Product Succesfully Deleted");
					
				}
				
				catch(Exception e) {
					
					System.out.println("Exception error is :"+e);
				}

			}
		});
		

				
		
		
		btnConfirm.setText("Confirm");
		btnConfirm.kStartColor = Color.WHITE;
		btnConfirm.setkStartColor(new Color(255, 255, 153));
		btnConfirm.kIndicatorColor = Color.BLACK;
		btnConfirm.setkIndicatorColor(Color.BLACK);
		btnConfirm.kHoverStartColor = new Color(255, 255, 204);
		btnConfirm.setkHoverStartColor(new Color(255, 255, 204));
		btnConfirm.kHoverForeGround = Color.BLACK;
		btnConfirm.setkHoverForeGround(Color.BLACK);
		btnConfirm.kHoverEndColor = new Color(102, 204, 255);
		btnConfirm.setkHoverEndColor(new Color(102, 204, 255));
		btnConfirm.kEndColor = new Color(255, 102, 255);
		btnConfirm.setkEndColor(new Color(255, 102, 255));
		btnConfirm.setForeground(Color.BLACK);
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirm.setBounds(71, 231, 153, 33);
		gradientPanel.add(btnConfirm);
		
		KButton btnBack = new KButton();
		btnBack.setBorder(null);
		btnBack.setkBorderRadius(40);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				new Menu().setVisible(true);
				dispose();
				
			}
		});
		btnBack.setText("Back");
		btnBack.kStartColor = Color.WHITE;
		btnBack.setkStartColor(new Color(255, 255, 153));
		btnBack.kIndicatorColor = Color.BLACK;
		btnBack.setkIndicatorColor(Color.BLACK);
		btnBack.kHoverStartColor = new Color(255, 255, 204);
		btnBack.setkHoverStartColor(new Color(255, 255, 204));
		btnBack.kHoverForeGround = Color.BLACK;
		btnBack.setkHoverForeGround(Color.BLACK);
		btnBack.kHoverEndColor = new Color(102, 204, 255);
		btnBack.setkHoverEndColor(new Color(102, 204, 255));
		btnBack.kEndColor = new Color(255, 102, 255);
		btnBack.setkEndColor(new Color(255, 102, 255));
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(316, 228, 142, 33);
		gradientPanel.add(btnBack);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 153, 153)));
		textField.setOpaque(false);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField.setBounds(190, 144, 142, 33);
		gradientPanel.add(textField);
		textField.setColumns(10);
		
		
	}
}
