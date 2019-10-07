package week3Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;  
import java.awt.Font;  
import java.awt.event.FocusAdapter;  
import java.awt.event.FocusEvent;  
import javax.swing.JTextField;  
import java.io.OutputStream;
import java.io.PrintStream;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ScrollPaneConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class ShopGUI {
	

	GUIRelay guirelay1 ;
	private JFrame frame;
	 Customer loggedinCust ;
	
	 
	 
	 ///// initializing some articles and customers 
	 
	 

	   Font gainFont = new Font("Tahoma", Font.PLAIN, 11);  
	   Font lostFont = new Font("Tahoma", Font.ITALIC, 11);  
	   private JTextField findIdtextfield;
	   private JTextField inName;
	   private JTextField inPhone;
	   private JTextField inID;
	   private JTextField inAddress;
	   private JTextField remIDbtn;
	   private JTextField login;
	   JComboBox quantity11 = new JComboBox();
	   JComboBox quantity12 = new JComboBox();
	   JComboBox quantity13 = new JComboBox();
	   JComboBox quantity14 = new JComboBox();
	   JComboBox quantity15 = new JComboBox();
	   JComboBox quantity16 = new JComboBox();
	   JLabel lblNewLabel_3 = new JLabel("SSN/CorpID");

	   
	   
	   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopGUI window = new ShopGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShopGUI() {
		
		initialize();
		guirelay1.fillShop();
		
	}

	
		
		
		
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		

		frame = new JFrame();
		frame.setBounds(150, 150, 537, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel foundprintout = new JLabel("");
		JLabel totallabel = new JLabel ("") ; 
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Shop", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("UserID");
		lblNewLabel_4.setBounds(318, 6, 61, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Products");
		lblNewLabel_5.setBounds(6, 16, 82, 22);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Dress");
		lblNewLabel_6.setBounds(6, 50, 61, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("BarBells");
		lblNewLabel_7.setBounds(6, 80, 61, 16);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Phone");
		lblNewLabel_8.setBounds(6, 140, 61, 16);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Laptop");
		lblNewLabel_9.setBounds(6, 170, 61, 16);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Shoe");
		lblNewLabel_10.setBounds(6, 200, 61, 16);
		panel.add(lblNewLabel_10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(100, 17, 61, 16);
		panel.add(lblQuantity);
		
	
		// first article added to order
		
		JButton btnAddToCart = new JButton("Add to Cart");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				//guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(0), Integer.parseInt(quantity1.getText()));
				
				guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(0), (quantity11.getSelectedIndex() + 1 )) ;
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				System.out.println(guirelay1.articleregister1.getArticleList().get(0).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
			}
		});
		btnAddToCart.setBounds(160, 45, 117, 29);
		panel.add(btnAddToCart);
		
		JButton button = new JButton("Add to Cart");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(0), Integer.parseInt(quantity1.getText()));
				
				guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(1), (quantity12.getSelectedIndex() + 1 )) ;
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				System.out.println(guirelay1.articleregister1.getArticleList().get(1).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
			}
		});
		button.setBounds(160, 75, 117, 29);
		panel.add(button);
		
		JButton button_1 = new JButton("Add to Cart");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(0), Integer.parseInt(quantity1.getText()));
				
				guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(3), (quantity14.getSelectedIndex() + 1 )) ;
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				System.out.println(guirelay1.articleregister1.getArticleList().get(3).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
			}
		});
		button_1.setBounds(160, 135, 117, 29);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Add to Cart");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(0), Integer.parseInt(quantity1.getText()));
				
				guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(4), (quantity15.getSelectedIndex() + 1 )) ;
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				System.out.println(guirelay1.articleregister1.getArticleList().get(4).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
			}
		});
		button_2.setBounds(160, 165, 117, 29);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Add to Cart");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(0), Integer.parseInt(quantity1.getText()));
				
				guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(5), (quantity16.getSelectedIndex() + 1 )) ;
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				System.out.println(guirelay1.articleregister1.getArticleList().get(5).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
			}
		});
		button_3.setBounds(160, 195, 117, 29);
		panel.add(button_3);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(403, 250, 61, 16);
		panel.add(lblTotal);
		
		JButton btnGoToCart = new JButton("View Orders");
		btnGoToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, guirelay1.register1.getOrderdetails(login.getText()));
			}
		});
		btnGoToCart.setBounds(198, 245, 117, 29);
		panel.add(btnGoToCart);
		
		JButton btnBuyNow = new JButton("Buy Now");  //create new Order 
		btnBuyNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guirelay1.initializeOrder(login.getText());
				JOptionPane.showMessageDialog(null, "Order placed !  Create a new Order ");
				
				////reset boxess !!
				quantity11.setSelectedIndex(0);
				quantity12.setSelectedIndex(0);
				quantity13.setSelectedIndex(0);
				quantity14.setSelectedIndex(0);
				quantity15.setSelectedIndex(0);
				quantity16.setSelectedIndex(0);
			}
		});
		btnBuyNow.setBounds(374, 309, 117, 29);
		panel.add(btnBuyNow);
		
		JLabel lblToy = new JLabel("Toy");
		lblToy.setBounds(6, 110, 61, 16);
		panel.add(lblToy);
		
		JButton button_4 = new JButton("Add to Cart");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(0), Integer.parseInt(quantity1.getText()));
				
				guirelay1.guiplaceOrder(login.getText(), guirelay1.articleregister1.getArticleList().get(2), (quantity13.getSelectedIndex() + 1 )) ;
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				System.out.println(guirelay1.articleregister1.getArticleList().get(2).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
			}
		});
		button_4.setBounds(160, 105, 117, 29);
		panel.add(button_4);
		
		login = new JTextField();
		login.setBounds(403, 1, 96, 26);
		panel.add(login);
		login.setColumns(10);
		
		
		//LOGIN AND INITIALIZE
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				//guirelay1.fillShop();
    		    quantity11.setSelectedIndex(0);
			   	quantity12.setSelectedIndex(0);
			 	quantity13.setSelectedIndex(0);
				quantity14.setSelectedIndex(0);
				quantity15.setSelectedIndex(0);
				quantity16.setSelectedIndex(0);
				 String found1 = guirelay1.GUIFindCust(login.getText());
				 
				 if (found1.equals("Customer Not Found"))
				 {
					JOptionPane.showMessageDialog(null, "Please Enter valid Login"); 
					//guirelay1.articleregister1.getArticleList().clear();
					// guirelay1.register1.getCustomerList().clear();
				 }
				 else {
				 
				 totallabel.setText("");
				 loggedinCust =guirelay1.loginCustomer(login.getText()); 
			     
			     guirelay1.initializeOrder(login.getText());
				 }
			}
		});
		btnLogin.setBounds(393, 28, 117, 29);
		panel.add(btnLogin);
		
		
		totallabel.setBounds(381, 278, 96, 16);
		panel.add(totallabel);
		
		
		quantity11.setMaximumRowCount(10);
		quantity11.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		quantity11.setSelectedIndex(0);
		quantity11.setBounds(79, 46, 72, 27);
		panel.add(quantity11);
		
		quantity12.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		quantity12.setSelectedIndex(0);
		quantity12.setMaximumRowCount(10);
		quantity12.setBounds(79, 76, 72, 27);
		panel.add(quantity12);
		
		
		quantity13.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		quantity13.setSelectedIndex(0);
		quantity13.setMaximumRowCount(10);
		quantity13.setBounds(79, 106, 72, 27);
		panel.add(quantity13);
		
		quantity14.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		quantity14.setSelectedIndex(0);
		quantity14.setMaximumRowCount(10);
		quantity14.setBounds(79, 136, 72, 27);
		panel.add(quantity14);
		
		quantity15.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		quantity15.setSelectedIndex(0);
		quantity15.setMaximumRowCount(10);
		quantity15.setBounds(79, 166, 72, 27);
		panel.add(quantity15);
		
		quantity16.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		quantity16.setSelectedIndex(0);
		quantity16.setMaximumRowCount(10);
		quantity16.setBounds(79, 196, 72, 27);
		panel.add(quantity16);
		
		JButton btnRemoveFromCart = new JButton("Remove");
		btnRemoveFromCart.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnRemoveFromCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				////////////HEERREEEEE//////////////////////
			
				guirelay1.register1.deleteArticle(login.getText(), "D11");
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				quantity11.setSelectedIndex(0);
				System.out.println(guirelay1.articleregister1.getArticleList().get(0).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
				
				
			}
		});
		btnRemoveFromCart.setBounds(276, 45, 82, 29);
		panel.add(btnRemoveFromCart);
		
		JButton button_5 = new JButton("Remove");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guirelay1.register1.deleteArticle(login.getText(), "BB23");
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				quantity12.setSelectedIndex(0);
				System.out.println(guirelay1.articleregister1.getArticleList().get(0).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
				
				
			}
		});
		button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		button_5.setBounds(276, 75, 82, 29);
		panel.add(button_5);
		
		JButton button_6 = new JButton("Remove");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guirelay1.register1.deleteArticle(login.getText(), "T45");
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				quantity13.setSelectedIndex(0);
				System.out.println(guirelay1.articleregister1.getArticleList().get(0).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
				
				
			}
		});
		button_6.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		button_6.setBounds(276, 105, 82, 29);
		panel.add(button_6);
		
		JButton button_7 = new JButton("Remove");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guirelay1.register1.deleteArticle(login.getText(), "PH14");
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				quantity14.setSelectedIndex(0);
				System.out.println(guirelay1.articleregister1.getArticleList().get(0).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
				
			}
		});
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		button_7.setBounds(276, 135, 82, 29);
		panel.add(button_7);
		
		JButton button_8 = new JButton("Remove");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guirelay1.register1.deleteArticle(login.getText(), "L589");
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				quantity15.setSelectedIndex(0);
				System.out.println(guirelay1.articleregister1.getArticleList().get(0).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
			}
		});
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		button_8.setBounds(276, 165, 82, 29);
		panel.add(button_8);
		
		JButton button_9 = new JButton("Remove");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guirelay1.register1.deleteArticle(login.getText(), "S086");
				totallabel.setText(guirelay1.calculateprice(login.getText()));
				//guirelay1.calculateprice(login.getText());
				quantity16.setSelectedIndex(0);
				System.out.println(guirelay1.articleregister1.getArticleList().get(0).getName() + " placing order ");
				System.out.println(guirelay1.register1.getOrderdetails(login.getText())) ;
			}
		});
		button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		button_9.setBounds(276, 195, 82, 29);
		panel.add(button_9);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Manage Customers", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		JLabel lblAddCustomer = new JLabel("Add Customer");
		lblAddCustomer.setBounds(8, 102, 90, 15);
		panel_1.add(lblAddCustomer);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(8, 173, 61, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone");
		lblNewLabel_1.setBounds(161, 173, 61, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setBounds(8, 222, 61, 16);
		panel_1.add(lblNewLabel_2);
		
		
		lblNewLabel_3.setBounds(161, 222, 79, 16);
		panel_1.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(422, 44, 1, 12);
		panel_1.add(separator);
	
		
		JLabel lblCustomerType = new JLabel("Customer Type");
		lblCustomerType.setBounds(8, 129, 113, 16);
		panel_1.add(lblCustomerType);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(8, 77, 510, 15);
		panel_1.add(separator_1);
		
		
		
		
		JLabel lblFindCustomer = new JLabel("Find Customer");
		lblFindCustomer.setBounds(8, 20, 98, 16);
		panel_1.add(lblFindCustomer);
		
		
		JLabel label_1 = new JLabel("Remove Customer");
		label_1.setBounds(8, 292, 123, 16);
		panel_1.add(label_1);
		
		
		
		
		
				
	///create find text field 
		
		
		
		findIdtextfield = new JTextField();
		findIdtextfield.setBounds(143, 10, 130, 26);
		panel_1.add(findIdtextfield);
		findIdtextfield.setColumns(10);
		
		JButton btnFindCustomer = new JButton("Find");
		btnFindCustomer.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
				//findIdtextfield.getText() ;
			
		 String findID =findIdtextfield.getText(); 
		 System.out.println("id is " + findIdtextfield.getText());
		 if (findID.equals(""))
		 {
			 JOptionPane.showMessageDialog(null, "Please enter a valid ID");
		 }
		 else {
		 System.out.println(findID) ;
		 String found =	guirelay1.GUIFindCust(findID);
		 System.out.println(found);
		 foundprintout.setText(found);
		 System.out.println(guirelay1.register1.getCustomerList().toString()) ;
		 }
		 
		 
				
			}
		
		
		});
		
		
		
		btnFindCustomer.setBounds(365, 15, 117, 29);
		panel_1.add(btnFindCustomer);
		
		 //JLabel foundprintout = new JLabel("");
		foundprintout.setBounds(6, 48, 392, 26);
		panel_1.add(foundprintout);
		
		JRadioButton privatecust = new JRadioButton("Private");
		privatecust.setSelected(true);
		privatecust.setBounds(143, 125, 79, 23);
		panel_1.add(privatecust);
		
		JRadioButton corpcust = new JRadioButton("Corporate");
		corpcust.setBounds(223, 125, 113, 23);
		panel_1.add(corpcust);
		
		ButtonGroup G = new ButtonGroup();
		G.add(privatecust);
		G.add(corpcust);
		/*
		boolean which =privatecust.isSelected() ;
		if (which == false )
		{
			lblNewLabel_3.setText("CorporateID");
		}
		*/
		inName = new JTextField();
		inName.setBounds(70, 168, 79, 26);
		panel_1.add(inName);
		inName.setColumns(10);
		
		inPhone = new JTextField();
		inPhone.setBounds(244, 168, 73, 26);
		panel_1.add(inPhone);
		inPhone.setColumns(10);
		
		inID = new JTextField();
		inID.setBounds(243, 217, 74, 26);
		panel_1.add(inID);
		inID.setColumns(10);
		
		inAddress = new JTextField();
		inAddress.setBounds(70, 217, 79, 26);
		panel_1.add(inAddress);
		inAddress.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name  = inName.getText(); 
				String address = inAddress.getText() ;
				String  phone = inPhone.getText() ; 
				String id = inID.getText() ;
				int type ; 
				boolean pcust = privatecust.isSelected() ;
				if (pcust == true ) {type = 0 ;}
				else {type = 1 ; }
				
				if (name.equals("")) {JOptionPane.showMessageDialog(null, "Please Insert Valid Name");}
				else if (address.equals("")) {JOptionPane.showMessageDialog(null, "Please Insert Valid Address");}
				else if (phone.equals("")) {JOptionPane.showMessageDialog(null, "Please Insert Valid Phone");}
				else if (id.equals("")) {JOptionPane.showMessageDialog(null, "Please Insert Valid ID");}
				
				else {
				//creating customer manually 
				guirelay1.createNewCustomer(name, address, phone, type, id);
				System.out.println(guirelay1.register1.getCustomerList().toString()) ;
				JOptionPane.showMessageDialog(null, "Customer Added");
				}
			
			}
		});
		btnAdd.setBounds(365, 217, 117, 29);
		panel_1.add(btnAdd);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(8, 260, 502, 15);
		panel_1.add(separator_2);
		
		remIDbtn = new JTextField();
		remIDbtn.setBounds(161, 289, 105, 21);
		panel_1.add(remIDbtn);
		remIDbtn.setColumns(10);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String remID = remIDbtn.getText() ;
				String found =	guirelay1.GUIFindCust(remID);
				if (found.equals("Customer Not Found"))
				{
					JOptionPane.showMessageDialog(null, "Customer Not Found");
				}
				else {
				System.out.println("remove id is " + remID) ;
				guirelay1.removeCustomer(remID);
				JOptionPane.showMessageDialog(null, "Customer Deleted Sucessfully");
				}
			}
		});
		btnRemove.setBounds(365, 287, 117, 29);
		panel_1.add(btnRemove);
		
		JButton btnListCustomers = new JButton("List Customers");
		btnListCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text  = new String ();
				for (int i = 0 ; i < guirelay1.register1.getCustomerList().size() ; i ++)
				{
					 text = (text  +"\n" +  guirelay1.register1.getCustomerList().get(i).toString()) ;
				}
				JOptionPane.showMessageDialog(null, text);
			
			}
		});
		btnListCustomers.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnListCustomers.setBounds(393, 43, 117, 29);
		panel_1.add(btnListCustomers);
		
		JLabel lblNewLabel_11 = new JLabel("Enter SSN/CorpID");
		lblNewLabel_11.setFont(new Font("Lucida Grande", Font.ITALIC, 10));
		lblNewLabel_11.setForeground(Color.GRAY);
		lblNewLabel_11.setBounds(161, 31, 105, 16);
		panel_1.add(lblNewLabel_11);
		
		JLabel label = new JLabel("Enter SSN/CorpID");
		label.setForeground(Color.GRAY);
		label.setFont(new Font("Lucida Grande", Font.ITALIC, 10));
		label.setBounds(168, 307, 105, 16);
		panel_1.add(label);
		
	
		guirelay1 = new GUIRelay(frame) ; 
	
	}
}
