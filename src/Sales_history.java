import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import keeptoo.KButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.border.MatteBorder;


public class Sales_history extends JFrame {
	private JTable table_1;
	int mn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales_history frame = new Sales_history();
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
	public Sales_history() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 983, 566);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkGradientFocus(-10);
		gradientPanel.setkStartColor(new Color(255, 153, 255));
		gradientPanel.setkEndColor(new Color(153, 255, 255));
		gradientPanel.setBounds(0, 0, 965, 519);
		getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.setBounds(104, 177, 773, 253);
		gradientPanel.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.RED));
		comboBox.setFont(new Font("Gabriola", Font.PLAIN, 30));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//	String m = comboBox.getSelectedItem().toString();
				
			//	System.out.println(m);
				
				 mn = comboBox.getSelectedIndex();
			//	System.out.println(mn);
				
		
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(720, 115, 181, 34);
		gradientPanel.add(comboBox);
		
		KButton btnLoadData = new KButton();
		btnLoadData.setBounds(231, 105, 150, 50);
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				
				
				
				if(mn==1) {
					
					try {
						
						Conn c=new Conn();
						String q="select * from Billing_details where monthname(date_of_purchase)='January'";
					//	c.s.executeQuery(q);
						ResultSet rs=c.s.executeQuery(q);
						
						table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
					}
					catch(Exception e) {
						
						System.out.println("The error is :"+e);
					}
					
				}
				else if(mn==2) {
					
					try {
						
						Conn c=new Conn();
						String q="select * from Billing_details where monthname(date_of_purchase)='February'";
					//	c.s.executeQuery(q);
						ResultSet rs=c.s.executeQuery(q);
						
						table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
					}
					catch(Exception e) {
						
						System.out.println("The error is :"+e);
					}
					
				}
				else
					if(mn==3) {
						
						try {
							
							Conn c=new Conn();
							String q="select * from Billing_details where monthname(date_of_purchase)='March'";
						//	c.s.executeQuery(q);
							ResultSet rs=c.s.executeQuery(q);
							
							table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
						}
						catch(Exception e) {
							
							System.out.println("The error is :"+e);
						}
						
					}
					else
						if(mn==4) {
							
							try {
								
								Conn c=new Conn();
								String q="select * from Billing_details where monthname(date_of_purchase)='April'";
							//	c.s.executeQuery(q);
								ResultSet rs=c.s.executeQuery(q);
								
								table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
							}
							catch(Exception e) {
								
								System.out.println("The error is :"+e);
							}
							
						}
						else
							if(mn==5) {
								
								try {
									
									Conn c=new Conn();
									String q="select * from Billing_details where monthname(date_of_purchase)='May'";
								//	c.s.executeQuery(q);
									ResultSet rs=c.s.executeQuery(q);
									
									table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
								}
								catch(Exception e) {
									
									System.out.println("The error is :"+e);
								}
								
							}
							else
								if(mn==6) {
									
									try {
										
										Conn c=new Conn();
										String q="select * from Billing_details where monthname(date_of_purchase)='June'";
									//	c.s.executeQuery(q);
										ResultSet rs=c.s.executeQuery(q);
										
										table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
									}
									catch(Exception e) {
										
										System.out.println("The error is :"+e);
									}
									
								}
								else
									if(mn==7) {
										
										try {
											
											Conn c=new Conn();
											String q="select * from Billing_details where monthname(date_of_purchase)='July'";
										//	c.s.executeQuery(q);
											ResultSet rs=c.s.executeQuery(q);
											
											table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
										}
										catch(Exception e) {
											
											System.out.println("The error is :"+e);
										}
										
									}
									else
										if(mn==8) {
											
											try {
												
												Conn c=new Conn();
												String q="select * from Billing_details where monthname(date_of_purchase)='August'";
											//	c.s.executeQuery(q);
												ResultSet rs=c.s.executeQuery(q);
												
												table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
											}
											catch(Exception e) {
												
												System.out.println("The error is :"+e);
											}
											
										}
										else
											if(mn==9) {
												
												try {
													
													Conn c=new Conn();
													String q="select * from Billing_details where monthname(date_of_purchase)='September'";
												//	c.s.executeQuery(q);
													ResultSet rs=c.s.executeQuery(q);
													
													table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
												}
												catch(Exception e) {
													
													System.out.println("The error is :"+e);
												}
												
											}
											else
												if(mn==10) {
													
													try {
														
														Conn c=new Conn();
														String q="select * from Billing_details where monthname(date_of_purchase)='October'";
													//	c.s.executeQuery(q);
														ResultSet rs=c.s.executeQuery(q);
														
														table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
													}
													catch(Exception e) {
														
														System.out.println("The error is :"+e);
													}
													
												}
												else
													if(mn==11) {
														
														try {
															
															Conn c=new Conn();
															String q="select * from Billing_details where monthname(date_of_purchase)='November'";
														//	c.s.executeQuery(q);
															ResultSet rs=c.s.executeQuery(q);
															
															table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
														}
														catch(Exception e) {
															
															System.out.println("The error is :"+e);
														}
														
													}
													else
														if(mn==12) {
															
															try {
																
																Conn c=new Conn();
																String q="select * from Billing_details where monthname(date_of_purchase)='December'";
															//	c.s.executeQuery(q);
																ResultSet rs=c.s.executeQuery(q);
																
																table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
															}
															catch(Exception e) {
																
																System.out.println("The error is :"+e);
															}
															
														}
														else
														{
															//System.out.println("Enter valid month!");
															JOptionPane.showMessageDialog(null, "Select month from checkbox ");
														}
				
				
		
			}
		});
		btnLoadData.setText("Load data");
		btnLoadData.kStartColor = Color.WHITE;
		btnLoadData.setkStartColor(new Color(255, 255, 153));
		btnLoadData.kIndicatorColor = Color.BLACK;
		btnLoadData.setkIndicatorColor(Color.BLACK);
		btnLoadData.kHoverStartColor = new Color(255, 255, 204);
		btnLoadData.setkHoverStartColor(new Color(255, 255, 204));
		btnLoadData.kHoverForeGround = Color.BLACK;
		btnLoadData.setkHoverForeGround(Color.BLACK);
		btnLoadData.kHoverEndColor = new Color(102, 204, 255);
		btnLoadData.setkHoverEndColor(new Color(102, 204, 255));
		btnLoadData.kForeGround = Color.BLACK;
		btnLoadData.setkForeGround(Color.BLACK);
		btnLoadData.kEndColor = new Color(255, 102, 255);
		btnLoadData.setkEndColor(Color.MAGENTA);
		btnLoadData.kBorderRadius = 40;
		btnLoadData.setkBorderRadius(40);
		btnLoadData.setForeground(Color.BLACK);
		btnLoadData.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnLoadData.setBorder(null);
		gradientPanel.add(btnLoadData);
		
		KButton btnBack = new KButton();
		btnBack.setBounds(790, 456, 150, 50);
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
		btnBack.kForeGround = Color.BLACK;
		btnBack.setkForeGround(Color.BLACK);
		btnBack.kEndColor = new Color(255, 102, 255);
		btnBack.setkEndColor(Color.MAGENTA);
		btnBack.kBorderRadius = 40;
		btnBack.setkBorderRadius(40);
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnBack.setBorder(null);
		gradientPanel.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Sales History");
		lblNewLabel.setBounds(321, 13, 326, 65);
		lblNewLabel.setFont(new Font("Harrington", Font.PLAIN, 50));
		gradientPanel.add(lblNewLabel);
		

		
		JLabel lblSelectMonth = new JLabel("Select Month :");
		lblSelectMonth.setFont(new Font("Harrington", Font.PLAIN, 30));
		lblSelectMonth.setBounds(518, 106, 190, 41);
		gradientPanel.add(lblSelectMonth);
		
		KButton btnLoadAllData = new KButton();
		btnLoadAllData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					Conn c=new Conn();
					String q="select * from Billing_details";
				//	c.s.executeQuery(q);
					ResultSet rs=c.s.executeQuery(q);
					
					table_1.setModel(DbUtils.resultSetToTableModel(rs));     //dbustil is a class in rs2xml.jar 
				}
				catch(Exception e) {
					
					System.out.println("The error is :"+e);
				}
				
				
			}
		});
		btnLoadAllData.setText("Load all data");
		btnLoadAllData.kStartColor = Color.WHITE;
		btnLoadAllData.setkStartColor(new Color(255, 255, 153));
		btnLoadAllData.kIndicatorColor = Color.BLACK;
		btnLoadAllData.setkIndicatorColor(Color.BLACK);
		btnLoadAllData.kHoverStartColor = new Color(255, 255, 204);
		btnLoadAllData.setkHoverStartColor(new Color(255, 255, 204));
		btnLoadAllData.kHoverForeGround = Color.BLACK;
		btnLoadAllData.setkHoverForeGround(Color.BLACK);
		btnLoadAllData.kHoverEndColor = new Color(102, 204, 255);
		btnLoadAllData.setkHoverEndColor(new Color(102, 204, 255));
		btnLoadAllData.kForeGround = Color.BLACK;
		btnLoadAllData.setkForeGround(Color.BLACK);
		btnLoadAllData.kEndColor = new Color(255, 102, 255);
		btnLoadAllData.setkEndColor(new Color(255, 102, 255));
		btnLoadAllData.kBorderRadius = 40;
		btnLoadAllData.setkBorderRadius(40);
		btnLoadAllData.setForeground(Color.BLACK);
		btnLoadAllData.setFont(new Font("Gabriola", Font.PLAIN, 35));
		btnLoadAllData.setBorder(null);
		btnLoadAllData.setBounds(12, 105, 150, 50);
		gradientPanel.add(btnLoadAllData);
		
		
	}
}
