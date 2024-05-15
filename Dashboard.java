package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{

	String username;
	JButton addPersonalDetails,viewPersonalDetails, updatePersonalDetails;
	Dashboard(String username){
		
		this.username=username;
		setBounds(0,0,1600,1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);//maximized length and breadth of frame on screen
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		p1.setBounds(0,0,1700,65);
		add(p1);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("dashboard.png"));
		Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel icon=new JLabel(i3);
		icon.setBounds(5,0,70,70);
		p1.add(icon);
		
		JLabel heading =new JLabel("Dashboard");
		heading.setBounds(80,10,300,40);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma",Font.BOLD,30));
		p1.add(heading);
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(0,65,300,900);
		add(p2);
		
		addPersonalDetails=new JButton("Add Personal Details");
		addPersonalDetails.setBounds(0,0,300,45);
		addPersonalDetails.setBackground(new Color(0,0,102));
		addPersonalDetails.setForeground(Color.WHITE);
		addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		addPersonalDetails.setMargin(new Insets(0,0,0,60));
		addPersonalDetails.addActionListener(this);
		p2.add(addPersonalDetails);
		
	    updatePersonalDetails=new JButton("Update Personal Details");
		updatePersonalDetails.setBounds(0,45,300,45);
		updatePersonalDetails.setBackground(new Color(0,0,102));
		updatePersonalDetails.setForeground(Color.WHITE);
		updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		updatePersonalDetails.setMargin(new Insets(0,0,0,30));
		p2.add(updatePersonalDetails);
		
	    viewPersonalDetails=new JButton("View Details");
		viewPersonalDetails.setBounds(0,90,300,45);
		viewPersonalDetails.setBackground(new Color(0,0,102));
		viewPersonalDetails.setForeground(Color.WHITE);
		viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewPersonalDetails.setMargin(new Insets(0,0,0,130));
		viewPersonalDetails.addActionListener(this);
		p2.add(viewPersonalDetails);
		
		JButton deletePersonalDetails=new JButton("Delete Personal Details");
		deletePersonalDetails.setBounds(0,135,300,45);
		deletePersonalDetails.setBackground(new Color(0,0,102));
		deletePersonalDetails.setForeground(Color.WHITE);
		deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		deletePersonalDetails.setMargin(new Insets(0,0,0,40));
		p2.add(deletePersonalDetails);
		
		JButton checkPackages=new JButton("Check Packages");
		checkPackages.setBounds(0,180,300,45);
		checkPackages.setBackground(new Color(0,0,102));
		checkPackages.setForeground(Color.WHITE);
		checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		checkPackages.setMargin(new Insets(0,0,0,110));
		p2.add(checkPackages);
		
		JButton bookPackages=new JButton("Book Package");
		bookPackages.setBounds(0,225,300,45);
		bookPackages.setBackground(new Color(0,0,102));
		bookPackages.setForeground(Color.WHITE);
		bookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookPackages.setMargin(new Insets(0,0,0,120));
		p2.add(bookPackages);
		
		JButton viewPackages=new JButton("View Package");
		viewPackages.setBounds(0,270,300,45);
		viewPackages.setBackground(new Color(0,0,102));
		viewPackages.setForeground(Color.WHITE);
		viewPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewPackages.setMargin(new Insets(0,0,0,110));
		p2.add(viewPackages);
		
		JButton viewHotels=new JButton("View Hotels");
		viewHotels.setBounds(0,315,300,45);
		viewHotels.setBackground(new Color(0,0,102));
		viewHotels.setForeground(Color.WHITE);
		viewHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewHotels.setMargin(new Insets(0,0,0,130));
		p2.add(viewHotels);
		
		JButton bookHotels=new JButton("Book Hotel");
		bookHotels.setBounds(0,360,300,45);
		bookHotels.setBackground(new Color(0,0,102));
		bookHotels.setForeground(Color.WHITE);
		bookHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookHotels.setMargin(new Insets(0,0,0,140));
		p2.add(bookHotels);
		
		JButton viewbookHotels=new JButton("View Booked Hotel");
		viewbookHotels.setBounds(0,405,300,45);
		viewbookHotels.setBackground(new Color(0,0,102));
		viewbookHotels.setForeground(Color.WHITE);
		viewbookHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewbookHotels.setMargin(new Insets(0,0,0,70));
		p2.add(viewbookHotels);
		
		JButton destinations=new JButton("Destinations");
		destinations.setBounds(0,450,300,45);
		destinations.setBackground(new Color(0,0,102));
		destinations.setForeground(Color.WHITE);
		destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
		destinations.setMargin(new Insets(0,0,0,125));
		p2.add(destinations);
		
		JButton payments=new JButton("Payments");
		payments.setBounds(0,495,300,45);
		payments.setBackground(new Color(0,0,102));
		payments.setForeground(Color.WHITE);
		payments.setFont(new Font("Tahoma",Font.PLAIN,20));
		payments.setMargin(new Insets(0,0,0,130));
		p2.add(payments);
		
		JButton calculator=new JButton("Calculator");
		calculator.setBounds(0,540,300,45);
		calculator.setBackground(new Color(0,0,102));
		calculator.setForeground(Color.WHITE);
		calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
		calculator.setMargin(new Insets(0,0,0,145));
		p2.add(calculator);
		
		JButton notepad=new JButton("Notepad");
		notepad.setBounds(0,585,300,45);
		notepad.setBackground(new Color(0,0,102));
		notepad.setForeground(Color.WHITE);
		notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
		notepad.setMargin(new Insets(0,0,0,155));
		p2.add(notepad);
		
		JButton about=new JButton("About");
		about.setBounds(0,630,300,45);
		about.setBackground(new Color(0,0,102));
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Tahoma",Font.PLAIN,20));
		about.setMargin(new Insets(0,0,0,175));
		 p2.add(about);
		
		JButton review=new JButton("Review");
		review.setBounds(0,675,300,45);
		review.setBackground(new Color(0,0,102));
		review.setForeground(Color.WHITE);
		review.setFont(new Font("Tahoma",Font.PLAIN,20));
		review.setMargin(new Insets(0,0,0,175));
		p2.add(review);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
		Image i5=i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);		
		ImageIcon i6=new ImageIcon(i5);
		JLabel image=new JLabel(i6);
		image.setBounds(0,0,1650,1000);
		add(image);
		
		JLabel text=new JLabel("Travel and Tourism Management System");
		text.setBounds(400,70,1000,70);
		text.setFont(new Font("Raleway",Font.PLAIN,40));
		image.add(text);
		
		
		
		
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==addPersonalDetails) {
			new AddCustomer(username);
			
		}else if(ae.getSource()==viewPersonalDetails) {
			new ViewCustomer(username);
		}
		else if(ae.getSource()==updatePersonalDetails) {
			new UpdateCustomer(username);
		}
		else {
			setVisible(false);
		}
	}

	public static void main(String[] args) {
	new Dashboard("");

	}

}
