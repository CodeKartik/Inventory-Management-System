import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import keeptoo.KGradientPanel;
import java.awt.Color;
import keeptoo.KButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.border.MatteBorder;

public class Menu extends JFrame {

	private JPanel contentPane;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		
		
	      
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1162, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkGradientFocus(-10);
		gradientPanel.setkEndColor(new Color(255, 105, 180));
		gradientPanel.setkStartColor(new Color(51, 255, 255));
		gradientPanel.setBounds(0, 0, 1144, 630);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Chiller", Font.ITALIC, 65));
		lblNewLabel.setBounds(447, 25, 338, 87);
		gradientPanel.add(lblNewLabel);
		
		KButton btnAddProduct = new KButton();
		btnAddProduct.setBorder(null);
		btnAddProduct.setkBorderRadius(40);
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Add_product().setVisible(true);
			dispose();
				
			}
		});
		btnAddProduct.setkForeGround(new Color(0, 0, 0));
		btnAddProduct.setText("Add product");
		btnAddProduct.kStartColor = Color.WHITE;
		btnAddProduct.setkStartColor(new Color(255, 255, 102));
		btnAddProduct.kIndicatorColor = Color.BLACK;
		btnAddProduct.setkIndicatorColor(Color.BLACK);
		btnAddProduct.kHoverStartColor = new Color(255, 255, 204);
		btnAddProduct.setkHoverStartColor(new Color(255, 255, 204));
		btnAddProduct.kHoverForeGround = Color.BLACK;
		btnAddProduct.setkHoverForeGround(Color.BLACK);
		btnAddProduct.kHoverEndColor = new Color(102, 204, 255);
		btnAddProduct.setkHoverEndColor(new Color(102, 204, 255));
		btnAddProduct.kEndColor = new Color(255, 102, 255);
		btnAddProduct.setkEndColor(new Color(255, 102, 255));
		btnAddProduct.setForeground(Color.BLACK);
		btnAddProduct.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnAddProduct.setBounds(122, 145, 198, 50);
		gradientPanel.add(btnAddProduct);
		
		KButton btnShowProductDetails = new KButton();
		btnShowProductDetails.setBorder(null);
		btnShowProductDetails.setkBorderRadius(40);
	
		btnShowProductDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Show_products().setVisible(true);
				dispose();
         
			}

			
					});
	
		btnShowProductDetails.setText("Show product Details");
		btnShowProductDetails.kStartColor = Color.WHITE;
		btnShowProductDetails.setkStartColor(new Color(255, 255, 102));
		btnShowProductDetails.kIndicatorColor = Color.BLACK;
		btnShowProductDetails.setkIndicatorColor(Color.BLACK);
		btnShowProductDetails.kHoverStartColor = new Color(255, 255, 204);
		btnShowProductDetails.setkHoverStartColor(new Color(255, 255, 204));
		btnShowProductDetails.kHoverForeGround = Color.BLACK;
		btnShowProductDetails.setkHoverForeGround(Color.BLACK);
		btnShowProductDetails.kHoverEndColor = new Color(102, 204, 255);
		btnShowProductDetails.setkHoverEndColor(new Color(102, 204, 255));
		btnShowProductDetails.kForeGround = Color.BLACK;
		btnShowProductDetails.setkForeGround(Color.BLACK);
		btnShowProductDetails.kEndColor = new Color(255, 102, 255);
		btnShowProductDetails.setkEndColor(new Color(255, 102, 255));
		btnShowProductDetails.setForeground(Color.BLACK);
		btnShowProductDetails.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnShowProductDetails.setBounds(713, 145, 253, 50);
		gradientPanel.add(btnShowProductDetails);
		
		KButton btnDeleteProduct = new KButton();
		btnDeleteProduct.setBorder(null);
		btnDeleteProduct.setkBorderRadius(40);
		btnDeleteProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Delete_product().setVisible(true);
				dispose();
				
			}
		});
		
		btnDeleteProduct.setText("Delete Product");
		btnDeleteProduct.kStartColor = Color.WHITE;
		btnDeleteProduct.setkStartColor(new Color(255, 255, 102));
		btnDeleteProduct.kIndicatorColor = Color.BLACK;
		btnDeleteProduct.setkIndicatorColor(Color.BLACK);
		btnDeleteProduct.kHoverStartColor = new Color(255, 255, 204);
		btnDeleteProduct.setkHoverStartColor(new Color(255, 255, 204));
		btnDeleteProduct.kHoverForeGround = Color.BLACK;
		btnDeleteProduct.setkHoverForeGround(Color.BLACK);
		btnDeleteProduct.kHoverEndColor = new Color(102, 204, 255);
		btnDeleteProduct.setkHoverEndColor(new Color(102, 204, 255));
		btnDeleteProduct.kForeGround = Color.BLACK;
		btnDeleteProduct.setkForeGround(Color.BLACK);
		btnDeleteProduct.kEndColor = new Color(255, 102, 255);
		btnDeleteProduct.setkEndColor(new Color(255, 102, 255));
		btnDeleteProduct.setForeground(Color.BLACK);
		btnDeleteProduct.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnDeleteProduct.setBounds(122, 366, 198, 50);
		gradientPanel.add(btnDeleteProduct);
		
		KButton btnUpdateProductDetails = new KButton();
		btnUpdateProductDetails.setBorder(null);
		btnUpdateProductDetails.setkBorderRadius(40);
		btnUpdateProductDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Search_product().setVisible(true);
				dispose();
				
				
			}
			
		});
		btnUpdateProductDetails.setText("Update Product Details");
		btnUpdateProductDetails.kStartColor = Color.WHITE;
		btnUpdateProductDetails.setkStartColor(new Color(255, 255, 102));
		btnUpdateProductDetails.kIndicatorColor = Color.BLACK;
		btnUpdateProductDetails.setkIndicatorColor(Color.BLACK);
		btnUpdateProductDetails.kHoverStartColor = new Color(255, 255, 204);
		btnUpdateProductDetails.setkHoverStartColor(new Color(255, 255, 204));
		btnUpdateProductDetails.kHoverForeGround = Color.BLACK;
		btnUpdateProductDetails.setkHoverForeGround(Color.BLACK);
		btnUpdateProductDetails.kHoverEndColor = new Color(102, 204, 255);
		btnUpdateProductDetails.setkHoverEndColor(new Color(102, 204, 255));
		btnUpdateProductDetails.kForeGround = Color.BLACK;
		btnUpdateProductDetails.setkForeGround(Color.BLACK);
		btnUpdateProductDetails.kEndColor = new Color(255, 102, 255);
		btnUpdateProductDetails.setkEndColor(new Color(255, 102, 255));
		btnUpdateProductDetails.setForeground(Color.BLACK);
		btnUpdateProductDetails.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnUpdateProductDetails.setBounds(697, 366, 269, 50);
		gradientPanel.add(btnUpdateProductDetails);
		
		KButton btnExit = new KButton();
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				close();
				
			}
		});
		btnExit.setText("Exit");
		btnExit.kStartColor = Color.WHITE;
		btnExit.setkStartColor(new Color(255, 255, 102));
		btnExit.kIndicatorColor = Color.BLACK;
		btnExit.setkIndicatorColor(Color.BLACK);
		btnExit.kHoverStartColor = new Color(255, 255, 204);
		btnExit.setkHoverStartColor(new Color(255, 255, 204));
		btnExit.kHoverForeGround = Color.BLACK;
		btnExit.setkHoverForeGround(Color.BLACK);
		btnExit.kHoverEndColor = new Color(102, 204, 255);
		btnExit.setkHoverEndColor(new Color(102, 204, 255));
		btnExit.kForeGround = Color.BLACK;
		btnExit.setkForeGround(Color.BLACK);
		btnExit.kEndColor = new Color(255, 102, 255);
		btnExit.setkEndColor(new Color(255, 102, 255));
		btnExit.kBorderRadius = 40;
		btnExit.setkBorderRadius(40);
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnExit.setBorder(null);
		btnExit.setBounds(428, 509, 198, 50);
		gradientPanel.add(btnExit);
		
		KButton btnBilling = new KButton();
		btnBilling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				new Billing().setVisible(true);
				dispose();
				
				
			}
		});
		btnBilling.setText("Billing");
		btnBilling.kStartColor = Color.WHITE;
		btnBilling.setkStartColor(new Color(255, 255, 102));
		btnBilling.kIndicatorColor = Color.BLACK;
		btnBilling.setkIndicatorColor(Color.BLACK);
		btnBilling.kHoverStartColor = new Color(255, 255, 204);
		btnBilling.setkHoverStartColor(new Color(255, 255, 204));
		btnBilling.kHoverForeGround = Color.BLACK;
		btnBilling.setkHoverForeGround(Color.BLACK);
		btnBilling.kHoverEndColor = new Color(102, 204, 255);
		btnBilling.setkHoverEndColor(new Color(102, 204, 255));
		btnBilling.kForeGround = Color.BLACK;
		btnBilling.setkForeGround(Color.BLACK);
		btnBilling.kEndColor = new Color(255, 102, 255);
		btnBilling.setkEndColor(new Color(255, 102, 255));
		btnBilling.kBorderRadius = 40;
		btnBilling.setkBorderRadius(40);
		btnBilling.setForeground(Color.BLACK);
		btnBilling.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnBilling.setBorder(null);
		btnBilling.setBounds(283, 248, 198, 50);
		gradientPanel.add(btnBilling);
		
		KButton btnSalesHistory = new KButton();
		btnSalesHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Sales_history().setVisible(true);
				dispose();
				
			}
		});
		btnSalesHistory.setText("Sales History");
		btnSalesHistory.kStartColor = Color.WHITE;
		btnSalesHistory.setkStartColor(new Color(255, 255, 102));
		btnSalesHistory.kIndicatorColor = Color.BLACK;
		btnSalesHistory.setkIndicatorColor(Color.BLACK);
		btnSalesHistory.kHoverStartColor = new Color(255, 255, 204);
		btnSalesHistory.setkHoverStartColor(new Color(255, 255, 204));
		btnSalesHistory.kHoverForeGround = Color.BLACK;
		btnSalesHistory.setkHoverForeGround(Color.BLACK);
		btnSalesHistory.kHoverEndColor = new Color(102, 204, 255);
		btnSalesHistory.setkHoverEndColor(new Color(102, 204, 255));
		btnSalesHistory.kForeGround = Color.BLACK;
		btnSalesHistory.setkForeGround(Color.BLACK);
		btnSalesHistory.kEndColor = new Color(255, 102, 255);
		btnSalesHistory.setkEndColor(new Color(255, 102, 255));
		btnSalesHistory.kBorderRadius = 40;
		btnSalesHistory.setkBorderRadius(40);
		btnSalesHistory.setForeground(Color.BLACK);
		btnSalesHistory.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnSalesHistory.setBorder(null);
		btnSalesHistory.setBounds(555, 248, 198, 50);
		gradientPanel.add(btnSalesHistory);
		
		
		
		
	}
	
	
public void close() {
		
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}
