import java.awt.EventQueue;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import keeptoo.KButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class Update_product extends JFrame {

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
					Update_product frame = new Update_product(null);
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
	public Update_product(String str) {
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkEndColor(new Color(0, 255, 255));
		gradientPanel.setBounds(2, 2, 775, 449);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Data");
		lblNewLabel.setBounds(278, 12, 263, 72);
		lblNewLabel.setFont(new Font("Harrington", Font.PLAIN, 35));
		gradientPanel.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("Product Name :");
		label_1.setBounds(115, 107, 175, 48);
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		gradientPanel.add(label_1);
		
		JLabel label_2 = new JLabel("Product Quantity :");
		label_2.setBounds(103, 185, 175, 48);
		label_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		gradientPanel.add(label_2);
		
		JLabel label_3 = new JLabel("Product Cost:");
		label_3.setBounds(105, 267, 175, 48);
		label_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		gradientPanel.add(label_3);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 0, 255)));
		textField.setBounds(337, 116, 183, 39);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		gradientPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 0, 255)));
		textField_1.setOpaque(false);
		textField_1.setBounds(340, 193, 183, 39);
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField_1.setColumns(10);
		gradientPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 0, 255)));
		textField_2.setBounds(339, 266, 183, 39);
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField_2.setColumns(10);
		gradientPanel.add(textField_2);
		
		KButton button = new KButton();
		button.setBorder(null);
		button.setkBorderRadius(40);
		button.setBounds(140, 383, 153, 33);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(i==1) {
				
			
				
				
				try {
					
					Conn c=new Conn();
					String q="update Add_product set pro_name ='"+textField.getText()+"',pro_qty='"+textField_1.getText()+"',pro_cost='"+textField_2.getText()+"' where pro_name='"+str+"' ";
					
				
					c.s.executeUpdate(q);	
					
					
					JOptionPane.showMessageDialog(null,"Details  succesfully Updated");
		
				     new Menu().setVisible(true);
				     dispose();
					
				}
				
				catch(Exception e) {
					
				System.out.println("The error is"+e);
					
				}
				
				}
		
			}

			
		});
		button.setText("Confirm");
		button.kStartColor = Color.WHITE;
		button.setkStartColor(new Color(255, 255, 102));
		button.kIndicatorColor = Color.BLACK;
		button.setkIndicatorColor(Color.BLACK);
		button.kHoverStartColor = new Color(255, 255, 204);
		button.setkHoverStartColor(new Color(255, 255, 204));
		button.kHoverForeGround = Color.BLACK;
		button.setkHoverForeGround(Color.BLACK);
		button.kHoverEndColor = new Color(102, 204, 255);
		button.setkHoverEndColor(new Color(102, 204, 255));
		button.kEndColor = new Color(255, 102, 255);
		button.setkEndColor(new Color(255, 102, 255));
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gradientPanel.add(button);
		
		KButton button_1 = new KButton();
		button_1.setBorder(null);
		button_1.setkBorderRadius(40);
		button_1.setBounds(385, 380, 142, 33);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Menu().setVisible(true);
				dispose();
				
			}
		});
		button_1.setText("Back");
		button_1.kStartColor = Color.WHITE;
		button_1.setkStartColor(new Color(255, 255, 153));
		button_1.kIndicatorColor = Color.BLACK;
		button_1.setkIndicatorColor(Color.BLACK);
		button_1.kHoverStartColor = new Color(255, 255, 204);
		button_1.setkHoverStartColor(new Color(255, 255, 204));
		button_1.kHoverForeGround = Color.BLACK;
		button_1.setkHoverForeGround(Color.BLACK);
		button_1.kHoverEndColor = new Color(102, 204, 255);
		button_1.setkHoverEndColor(new Color(102, 204, 255));
		button_1.kEndColor = new Color(255, 102, 255);
		button_1.setkEndColor(new Color(255, 102, 255));
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gradientPanel.add(button_1);
		
		
		
	
		showdata(str);
		
	}
	
	int i=0;
	
	void showdata(String str) {
		
		
		
		try {
			
			
			
			Conn c=new Conn();
			String q="select * from Add_product where pro_name ='"+str+"'";
			ResultSet rs=c.s.executeQuery(q);
		
			
			if(rs.next()) {

				
			i=1;
				
				 
				
				textField.setText(rs.getString(1));      //here 1 indicate value  is being set to no.1 coolumn from respective textfield or u can use direct  name  of the column  
				textField_1.setText(rs.getString(2));       // i.e. "pro_name" "pro_qty" "pro_cost"
			textField_2.setText(rs.getString(3));
				
			}
		
			if(i==0) {
				
			
				
			JOptionPane.showMessageDialog(null,"Product not found");
			
			new Search_product().setVisible(true);
				
			}
			
		}
		
		catch(Exception e) {
			
			System.out.println("The Error is "+e);
			
		}
		
		
	}
	
	

}
