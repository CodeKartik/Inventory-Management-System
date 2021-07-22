import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import keeptoo.KButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class Search_product extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_product frame = new Search_product();
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
	public Search_product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkGradientFocus(-20);
		gradientPanel.setkStartColor(new Color(102, 255, 255));
		gradientPanel.setkEndColor(new Color(255, 102, 255));
		gradientPanel.setBounds(0, 0, 602, 336);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Product ");
		lblNewLabel.setBounds(148, 31, 286, 52);
		lblNewLabel.setFont(new Font("Harrington", Font.PLAIN, 40));
		gradientPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name    :");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(58, 143, 126, 40);
		gradientPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 99, 71)));
		textField.setOpaque(false);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField.setBounds(207, 143, 162, 36);
		gradientPanel.add(textField);
		textField.setColumns(10);
		
		KButton btnSearch = new KButton();
		btnSearch.setBorder(null);
		btnSearch.setkBorderRadius(40);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s=textField.getText();
				

		//		Update_product u= new Update_product(s);
				new Update_product(s).setVisible(true);
				dispose();
				
				
		
			}
		});
		
		
		
		btnSearch.setText("Search");
		btnSearch.kStartColor = Color.WHITE;
		btnSearch.setkStartColor(new Color(255, 255, 153));
		btnSearch.kIndicatorColor = Color.BLACK;
		btnSearch.setkIndicatorColor(Color.BLACK);
		btnSearch.kHoverStartColor = new Color(255, 255, 204);
		btnSearch.setkHoverStartColor(new Color(255, 255, 204));
		btnSearch.kHoverForeGround = Color.BLACK;
		btnSearch.setkHoverForeGround(Color.BLACK);
		btnSearch.kHoverEndColor = new Color(102, 204, 255);
		btnSearch.setkHoverEndColor(new Color(102, 204, 255));
		btnSearch.kForeGround = Color.BLACK;
		btnSearch.setkForeGround(Color.BLACK);
		btnSearch.kEndColor = new Color(255, 102, 255);
		btnSearch.setkEndColor(new Color(255, 140, 0));
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSearch.setBounds(84, 241, 152, 36);
		gradientPanel.add(btnSearch);
		
		KButton btnCancel = new KButton();
		btnCancel.setBorder(null);
		btnCancel.setkBorderRadius(40);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Menu().setVisible(true);
				dispose();
				
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.kStartColor = Color.WHITE;
		btnCancel.setkStartColor(new Color(255, 255, 153));
		btnCancel.kIndicatorColor = Color.BLACK;
		btnCancel.setkIndicatorColor(Color.BLACK);
		btnCancel.kHoverStartColor = new Color(255, 255, 204);
		btnCancel.setkHoverStartColor(new Color(255, 255, 204));
		btnCancel.kHoverForeGround = Color.BLACK;
		btnCancel.setkHoverForeGround(Color.BLACK);
		btnCancel.kHoverEndColor = new Color(102, 204, 255);
		btnCancel.setkHoverEndColor(new Color(102, 204, 255));
		btnCancel.kForeGround = Color.BLACK;
		btnCancel.setkForeGround(Color.BLACK);
		btnCancel.kEndColor = new Color(255, 102, 255);
		btnCancel.setkEndColor(new Color(255, 165, 0));
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCancel.setBounds(330, 241, 152, 36);
		gradientPanel.add(btnCancel);
	}
	
	
	
	}
