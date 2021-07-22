import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import keeptoo.KButton;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Billing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	String g;
	String pc;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1251, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkGradientFocus(-50);
		gradientPanel.kStartColor = new Color(255, 204, 255);
		gradientPanel.setkEndColor(new Color(153, 255, 255));
		gradientPanel.setBounds(0, 0, 1233, 699);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Billing and Recipt");
		lblNewLabel.setBounds(369, 13, 511, 85);
		lblNewLabel.setFont(new Font("Harrington", Font.PLAIN, 60));
		gradientPanel.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 111, 579, 588);
		panel.setOpaque(false);
		gradientPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Add details");
		lblNewLabel_1.setBounds(205, 13, 248, 58);
		lblNewLabel_1.setFont(new Font("Gabriola", Font.PLAIN, 51));
		panel.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Name  :");
		lblName.setBounds(22, 117, 123, 32);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblName);
		
		JLabel lblItem = new JLabel("Item  :");
		lblItem.setBounds(22, 250, 123, 32);
		lblItem.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblItem);
		
		JLabel lblQuantity = new JLabel("Quantity  :");
		lblQuantity.setBounds(22, 310, 123, 32);
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblQuantity);
		
		JLabel lblGst = new JLabel("GST  :");
		lblGst.setBounds(22, 383, 123, 32);
		lblGst.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblGst);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 428, 562, 14);
		panel.add(separator);
		
		textField = new JTextField();
		textField.setBounds(168, 118, 335, 32);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 153, 255)));
		textField.setOpaque(false);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(663, 111, 556, 588);
		panel_1.setOpaque(false);
		gradientPanel.add(panel_1);
		panel_1.setLayout(null);
	
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(199, 97, 295, 32);
		panel_1.add(lblNewLabel_2);
		
		
		JLabel label_8 = new JLabel("");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_8.setBounds(344, 435, 150, 32);
		panel_1.add(label_8);
		
		JLabel label_5 = new JLabel("");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_5.setBounds(199, 223, 295, 32);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_6.setBounds(199, 292, 295, 32);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("18%");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_7.setBounds(199, 365, 295, 32);
		panel_1.add(label_7);
		
		JLabel label_9 = new JLabel("");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_9.setBounds(181, 161, 295, 32);
		panel_1.add(label_9);
		
		
		KButton btnRecipt = new KButton();
		btnRecipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String name = textField.getText();
				String item = textField_1.getText();
				String qty = textField_2.getText();
				String total=textField_4.getText();
				String date=textField_5.getText();
				
				lblNewLabel_2.setText(name);
				label_5.setText(item);
				label_6.setText(qty);
				label_8.setText(total);
				label_9.setText(date);
				
			}
		});
		btnRecipt.setBounds(196, 525, 198, 50);
		btnRecipt.setText("Recipt");
		btnRecipt.kStartColor = Color.WHITE;
		btnRecipt.setkStartColor(Color.WHITE);
		btnRecipt.kIndicatorColor = Color.BLACK;
		btnRecipt.setkIndicatorColor(Color.BLACK);
		btnRecipt.kHoverStartColor = new Color(255, 255, 204);
		btnRecipt.setkHoverStartColor(new Color(255, 255, 204));
		btnRecipt.kHoverForeGround = Color.BLACK;
		btnRecipt.setkHoverForeGround(Color.BLACK);
		btnRecipt.kHoverEndColor = new Color(102, 204, 255);
		btnRecipt.setkHoverEndColor(new Color(102, 204, 255));
		btnRecipt.kForeGround = Color.BLACK;
		btnRecipt.setkForeGround(Color.BLACK);
		btnRecipt.kEndColor = new Color(255, 102, 255);
		btnRecipt.setkEndColor(new Color(255, 153, 255));
		btnRecipt.kBorderRadius = 40;
		btnRecipt.setkBorderRadius(40);
		btnRecipt.setForeground(Color.BLACK);
		btnRecipt.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnRecipt.setBorder(null);
		panel.add(btnRecipt);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 251, 238, 32);
		textField_1.setOpaque(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 153, 255)));
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 311, 113, 32);
		textField_2.setOpaque(false);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 153, 255)));
		panel.add(textField_2);
		
		textField_3 = new JTextField("18%");
		textField_3.setBounds(168, 383, 113, 32);
		textField_3.setOpaque(false);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 153, 255)));
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(205, 455, 113, 43);
		textField_4.setOpaque(false);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 51, 204)));
		panel.add(textField_4);
		
		KButton btnOk = new KButton();
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				
				String item_name =textField_1.getText();
			
				g=item_name;
				
			}
		});
		btnOk.setText("Ok");
		btnOk.kStartColor = Color.WHITE;
		btnOk.setkStartColor(Color.WHITE);
		btnOk.kIndicatorColor = Color.BLACK;
		btnOk.setkIndicatorColor(Color.BLACK);
		btnOk.kHoverStartColor = new Color(255, 255, 204);
		btnOk.setkHoverStartColor(new Color(255, 255, 204));
		btnOk.kHoverForeGround = Color.BLACK;
		btnOk.setkHoverForeGround(Color.BLACK);
		btnOk.kHoverEndColor = new Color(102, 204, 255);
		btnOk.setkHoverEndColor(new Color(102, 204, 255));
		btnOk.kForeGround = Color.BLACK;
		btnOk.setkForeGround(Color.BLACK);
		btnOk.kEndColor = new Color(255, 102, 255);
		btnOk.setkEndColor(new Color(255, 51, 255));
		btnOk.kBorderRadius = 40;
		btnOk.setkBorderRadius(40);
		btnOk.setForeground(Color.BLACK);
		btnOk.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnOk.setBorder(null);
		btnOk.setBounds(487, 244, 65, 50);
		panel.add(btnOk);

		
		KButton btnTotal = new KButton();
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				total();
	
			}
		});
		btnTotal.setText("Total  :");
		btnTotal.kStartColor = Color.WHITE;
		btnTotal.setkStartColor(Color.WHITE);
		btnTotal.kIndicatorColor = Color.BLACK;
		btnTotal.setkIndicatorColor(Color.BLACK);
		btnTotal.kHoverStartColor = new Color(255, 255, 204);
		btnTotal.setkHoverStartColor(new Color(255, 255, 204));
		btnTotal.kHoverForeGround = Color.BLACK;
		btnTotal.setkHoverForeGround(Color.BLACK);
		btnTotal.kHoverEndColor = new Color(102, 204, 255);
		btnTotal.setkHoverEndColor(new Color(102, 204, 255));
		btnTotal.kForeGround = Color.BLACK;
		btnTotal.setkForeGround(Color.BLACK);
		btnTotal.kEndColor = new Color(255, 102, 255);
		btnTotal.setkEndColor(new Color(255, 102, 255));
		btnTotal.kBorderRadius = 40;
		btnTotal.setkBorderRadius(40);
		btnTotal.setForeground(Color.BLACK);
		btnTotal.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnTotal.setBorder(null);
		btnTotal.setBounds(44, 453, 114, 50);
		panel.add(btnTotal);
		
		JLabel lblDate = new JLabel("Date  :");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDate.setBounds(22, 191, 123, 32);
		panel.add(lblDate);
		
		textField_5 = new JTextField();
		textField_5.setOpaque(false);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 153, 255)));
		textField_5.setBounds(168, 192, 335, 32);
		panel.add(textField_5);
		

		
		JLabel lblRecipt = new JLabel("Recipt");
		lblRecipt.setFont(new Font("Gabriola", Font.PLAIN, 51));
		lblRecipt.setBounds(250, 13, 105, 71);
		panel_1.add(lblRecipt);
		
		JLabel label = new JLabel("Item  :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(39, 223, 123, 32);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Name  :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setBounds(39, 97, 123, 32);
		panel_1.add(label_1);
		
		JLabel lblDate_1 = new JLabel("Date  :");
		lblDate_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDate_1.setBounds(39, 161, 123, 32);
		panel_1.add(lblDate_1);
		
		JLabel label_2 = new JLabel("Quantity  :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_2.setBounds(39, 292, 123, 32);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("GST  :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_3.setBounds(51, 365, 123, 32);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Total :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_4.setBounds(250, 435, 123, 32);
		panel_1.add(label_4);
		
	
		
		KButton btnBack = new KButton();
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
		btnBack.setkEndColor(new Color(255, 153, 255));
		btnBack.kBorderRadius = 40;
		btnBack.setkBorderRadius(40);
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnBack.setBorder(null);
		btnBack.setBounds(12, 525, 150, 50);
		panel_1.add(btnBack);
		
		KButton btnPrint = new KButton();
		btnPrint.setText("Print");
		btnPrint.kStartColor = Color.WHITE;
		btnPrint.setkStartColor(Color.WHITE);
		btnPrint.kIndicatorColor = Color.BLACK;
		btnPrint.setkIndicatorColor(Color.BLACK);
		btnPrint.kHoverStartColor = new Color(255, 255, 204);
		btnPrint.setkHoverStartColor(new Color(255, 255, 204));
		btnPrint.kHoverForeGround = Color.BLACK;
		btnPrint.setkHoverForeGround(Color.BLACK);
		btnPrint.kHoverEndColor = new Color(102, 204, 255);
		btnPrint.setkHoverEndColor(new Color(102, 204, 255));
		btnPrint.kForeGround = Color.BLACK;
		btnPrint.setkForeGround(Color.BLACK);
		btnPrint.kEndColor = new Color(255, 102, 255);
		btnPrint.setkEndColor(new Color(255, 102, 255));
		btnPrint.kBorderRadius = 40;
		btnPrint.setkBorderRadius(40);
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnPrint.setBorder(null);
		btnPrint.setBounds(410, 525, 134, 50);
		panel_1.add(btnPrint);
		
		KButton btnSave = new KButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String a=lblNewLabel_2.getText();
				String b =label_5.getText();
				String c =label_6.getText();
				String d =label_8.getText();
				String h=label_9.getText();
				
				int e=Integer.parseInt(String.valueOf(c));
				int r=0;
				int final_qty_upd=0;
				
				try {
					
					Conn cn= 	new Conn();
					String q="insert into Billing_details values('"+a+"','"+b+"','"+c+"','"+d+"','"+h+"')";
					JOptionPane.showMessageDialog(null,"Details Succesfully Saved");
					
					cn.s.executeUpdate(q);
					
					
					String o="select * from Add_product where pro_name='"+g+"'";
					ResultSet rs=cn.s.executeQuery(o);
					
					while(rs.next()) {
						
						r=rs.getInt(2);       //getting product qty from databse to update    and 2 is the column no2 in database i.e. pro_qty
						System.out.println(r);
						final_qty_upd=r-e;
					}
					
						
					String f="update Add_product set pro_qty='"+final_qty_upd+"' where pro_name='"+g+"' ";
					cn.s.executeUpdate(f);
					
					
					}
					catch(Exception ee) {
						
				       System.out.println("The error is :"+e);
						
					}
		
				
			}
		});
		btnSave.setText("Save");
		btnSave.kStartColor = Color.WHITE;
		btnSave.setkStartColor(Color.WHITE);
		btnSave.kIndicatorColor = Color.BLACK;
		btnSave.setkIndicatorColor(Color.BLACK);
		btnSave.kHoverStartColor = new Color(255, 255, 204);
		btnSave.setkHoverStartColor(new Color(255, 255, 204));
		btnSave.kHoverForeGround = Color.BLACK;
		btnSave.setkHoverForeGround(Color.BLACK);
		btnSave.kHoverEndColor = new Color(102, 204, 255);
		btnSave.setkHoverEndColor(new Color(102, 204, 255));
		btnSave.kForeGround = Color.BLACK;
		btnSave.setkForeGround(Color.BLACK);
		btnSave.kEndColor = new Color(255, 102, 255);
		btnSave.setkEndColor(new Color(255, 102, 255));
		btnSave.kBorderRadius = 40;
		btnSave.setkBorderRadius(40);
		btnSave.setForeground(Color.BLACK);
		btnSave.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnSave.setBorder(null);
		btnSave.setBounds(205, 525, 150, 50);
		panel_1.add(btnSave);
		
	
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(603, 111, -1, 566);
		gradientPanel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(589, 111, 22, -13);
		gradientPanel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 99, 1205, 14);
		gradientPanel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(634, 111, 8, 566);
		gradientPanel.add(separator_4);
		
		
	}
	
	

	
	public void total() {
		
	
		
		try {

			Conn c = new Conn();
			String q="select * from Add_product where pro_name ='"+g+"'";
			ResultSet rs=c.s.executeQuery(q);
			
			while(rs.next()) {
				
				pc=rs.getString(3);       //getting product cost from databse    and 3 is the column no3 in database i.e. pro_cost
				
			}
			
			//System.out.println(pc);
		}
		catch(Exception e) {
			
			System.out.println("Exception is "+e);
			
		}
	
		
		if(pc!=null) {
		
		String qty = textField_2.getText();
		 int q=Integer.parseInt(String.valueOf(qty));

		 
		 int p =Integer.parseInt(String.valueOf(pc));
		
		 String l="laptop";
		 String tb="table";
		 String mb="mobile";
		 String pd="pendrive";
		 String eg="egg";
		 String ca="cable";
		 
		
			
		
          if(l.equals(g)) {
	   
	      int t=(p*q)+180;
	     textField_4.setText(Integer.toString(t));
 
	
         }
          else if(tb.equals(g)) {
        	  
        	  int t=(p*q)+180;
        	  textField_4.setText(Integer.toString(t));
        	  
          }
          else if(mb.equals(g)) {
        	  int t=(p*q)+180;
        	  textField_4.setText(Integer.toString(t));
        	  
          
          }
          else if(pd.equals(g)) {
        	  
        	  int t=(p*q)+180;
        	  textField_4.setText(Integer.toString(t));
        	  
          }
          else if(eg.equals(g)) {
        	  
        	  int t=(p*q)+180;
        	  textField_4.setText(Integer.toString(t));
        	  
        	  
          }
          else if(ca.equals(g)) {
        	  
        	  int t=(p*q)+180;
        	  textField_4.setText(Integer.toString(t));
        	  
        	  System.out.println(g);
          }
         
          
       
         
		}
		else {
			  JOptionPane.showMessageDialog(null,"Enter valid item name");
		}
		
	}
}
