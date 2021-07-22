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
import keeptoo.KButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Print_details extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Print_details frame = new Print_details(null);
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
	public Print_details(String str) {
		
		
		
		String product_name = null,product_qty = null,product_cost = null;
		
		try {
			
			Conn cn=new Conn();
			String s="select * from Add_product where pro_name ='"+str+"'";
			ResultSet rs=cn.s.executeQuery(s);
			
			
			while(rs.next()) {
				
			
				
				 product_name =rs.getString("pro_name");
				 product_qty=rs.getString("pro_qty");
				 product_cost=rs.getString("pro_cost");
				
			}
			
			
		}
		
		catch(Exception e) {
			
			System.out.println("Exception error is :"+e);
		}
		
		
		 int pq=Integer.parseInt(String.valueOf(product_qty));
		
		if(pq<5) {
			
			JOptionPane.showMessageDialog(null,"Quantity of product is less add more.","Warning",JOptionPane.WARNING_MESSAGE);
			
		}
	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkStartColor(new Color(255, 153, 255));
		gradientPanel.setkEndColor(new Color(153, 255, 255));
		gradientPanel.setBounds(0, 0, 655, 516);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Name :");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(60, 146, 175, 48);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblProductQuantity = new JLabel("Product Quantity :");
		lblProductQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblProductQuantity.setBounds(60, 225, 175, 48);
		gradientPanel.add(lblProductQuantity);
		
		JLabel lblProductCost = new JLabel("Product Cost:");
		lblProductCost.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblProductCost.setBounds(60, 312, 175, 48);
		gradientPanel.add(lblProductCost);
		
		JLabel lblNewLabel_1 = new JLabel(product_name);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(278, 151, 175, 46);
		gradientPanel.add(lblNewLabel_1);
		
		
		JLabel label = new JLabel(product_qty);
		label.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		label.setBounds(278, 225, 175, 46);
		gradientPanel.add(label);
		
		JLabel label_1 = new JLabel(product_cost);
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		label_1.setBounds(278, 301, 175, 46);
		gradientPanel.add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("Product Details");
		lblNewLabel_2.setFont(new Font("Harrington", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(84, 52, 392, 48);
		gradientPanel.add(lblNewLabel_2);
		
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
		btnBack.setkStartColor(Color.WHITE);
		btnBack.kIndicatorColor = Color.BLACK;
		btnBack.setkIndicatorColor(Color.BLACK);
		btnBack.kHoverStartColor = new Color(255, 255, 204);
		btnBack.setkHoverStartColor(new Color(255, 255, 204));
		btnBack.kHoverForeGround = Color.BLACK;
		btnBack.setkHoverForeGround(Color.BLACK);
		btnBack.kHoverEndColor = new Color(102, 204, 255);
		btnBack.setkHoverEndColor(new Color(102, 204, 255));
		btnBack.kForeGround = Color.BLACK;
		btnBack.setkForeGround(Color.BLACK);
		btnBack.kEndColor = new Color(255, 102, 255);
		btnBack.setkEndColor(new Color(255, 0, 204));
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(392, 419, 152, 36);
		gradientPanel.add(btnBack);
		
	
		
		
	}
}
