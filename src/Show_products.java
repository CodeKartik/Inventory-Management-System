import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import keeptoo.KButton;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Show_products extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Show_products frame = new Show_products();
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
	public Show_products() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkGradientFocus(-10);
		gradientPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(204, 102, 51)));
		gradientPanel.setkStartColor(new Color(255, 204, 255));
		gradientPanel.setkEndColor(new Color(51, 255, 255));
		gradientPanel.setBounds(0, 0, 682, 352);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Show Product Details");
		lblNewLabel.setFont(new Font("Harrington", Font.PLAIN, 30));
		lblNewLabel.setBounds(154, 36, 389, 46);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the name of product you want see details");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(22, 119, 401, 22);
		gradientPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Product name");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(51, 177, 152, 36);
		gradientPanel.add(lblNewLabel_2);
		
		

		textField = new JTextField();
		textField.setOpaque(false);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 0, 153)));
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField.setBounds(213, 177, 187, 33);
		gradientPanel.add(textField);
		textField.setColumns(10);
		
		
		
		KButton btnShow = new KButton();
		btnShow.setBorder(null);
		btnShow.setkBorderRadius(40);
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String s=textField.getText();
				
		//		Print_details p=new Print_details(s);
				
			new Print_details(s).setVisible(true);
			
			dispose();

			
		
				
			}

		
			
		});
		btnShow.setText("Show");
		btnShow.kStartColor = Color.WHITE;
		btnShow.setkStartColor(Color.WHITE);
		btnShow.kIndicatorColor = Color.BLACK;
		btnShow.setkIndicatorColor(Color.BLACK);
		btnShow.kHoverStartColor = new Color(255, 255, 204);
		btnShow.setkHoverStartColor(new Color(255, 255, 204));
		btnShow.kHoverForeGround = Color.BLACK;
		btnShow.setkHoverForeGround(Color.BLACK);
		btnShow.kHoverEndColor = new Color(102, 204, 255);
		btnShow.setkHoverEndColor(new Color(102, 204, 255));
		btnShow.kForeGround = Color.BLACK;
		btnShow.setkForeGround(Color.BLACK);
		btnShow.kEndColor = new Color(255, 102, 255);
		btnShow.setkEndColor(new Color(255, 0, 153));
		btnShow.setForeground(Color.BLACK);
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnShow.setBounds(51, 255, 152, 36);
		gradientPanel.add(btnShow);
		
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
		btnBack.setkEndColor(new Color(255, 0, 153));
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(275, 255, 152, 36);
		gradientPanel.add(btnBack);
		
		
	}
	
	
}
