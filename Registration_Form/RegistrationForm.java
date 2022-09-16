package Registration_Form;

import javax.swing.*;
import java.awt.Container;
import java.awt.Font;

public class RegistrationForm extends JFrame {
	JLabel Message;
	JLabel NameLabel,DOBLabel,GenderLabel,DOBFormat,AddressLabel;
	JTextField NameField, DOBField,AddressField;
	JRadioButton GenderMale,GenderFemale;
	ButtonGroup GenderGroup;
	
	JLabel MailIDLabel,MobileNoLabel;
	JTextField MailIDField,MobileNoField;

	JLabel ProgramLabel;
	JComboBox<String>ProgramList;
		
	JButton RegisterButton;
	Container Container;
	
	public RegistrationForm() {
		Message = new JLabel("Registration Form");
		Message.setFont(new Font("Times New Roman",Font.BOLD, 26));
		NameLabel = new JLabel("NAME");
		NameField = new JTextField();
		
		DOBLabel = new JLabel("DOB");
		DOBField = new JTextField();
		
		GenderLabel = new JLabel("GENDER");
		GenderMale = new JRadioButton("MALE",true);
		GenderFemale = new JRadioButton("FEMALE");
		GenderGroup = new ButtonGroup();
		GenderGroup.add(GenderMale);
		GenderGroup.add(GenderFemale);
		
		AddressLabel = new JLabel("ADDRESS");
		AddressField = new JTextField();
		
		MobileNoLabel = new JLabel("MOBILE NO");
		MobileNoField = new JTextField();
		
		MailIDLabel = new JLabel("MAIL ID");
		MailIDField = new JTextField();

		ProgramLabel = new JLabel("POSITION");
		ProgramList = new JComboBox<String>();
		
	    ProgramList.addItem("   *** OPTIONS ***");
		ProgramList.addItem("JAVASCRIPT DEVELOPER");
		ProgramList.addItem("PHP DEVELOPER");
		ProgramList.addItem("QUALITY ASSURANCE TESTER");
		ProgramList.addItem("SENIOR SOFTWARE DEVELOPER");
		ProgramList.addItem("SOFTWARE DEVELOPER");
		ProgramList.addItem("SYSTEM ENGINEER");
		
		RegisterButton = new JButton("REGISTER");
		Container = getContentPane();
		Container.setLayout(null);
		setBounds();
		addComponents();		
	
	}
	 public void setBounds() {
	        Message.setBounds(50, 10, 600, 30);
	        NameLabel.setBounds(50, 60, 100, 30);
	        NameField.setBounds(120, 60, 200, 30);
	 
	        DOBLabel.setBounds(50, 110, 100, 30);
	        DOBField.setBounds(120, 110, 200, 30);
	        
	        GenderLabel.setBounds(50, 160, 100, 30);
	        GenderMale.setBounds(120, 160, 60, 30);
	        GenderFemale.setBounds(190, 160, 150,30);
	          	        	 	  
	        ProgramLabel.setBounds(50, 210, 100, 30);
	        ProgramList.setBounds(120, 210, 200, 30);
	       
	        AddressLabel.setBounds(50, 270, 100, 30);
	        AddressField.setBounds(120, 270, 200, 30);
	        
	        MobileNoLabel.setBounds(50, 320, 100, 30);
	        MobileNoField.setBounds(120, 320, 200, 30);
	        
	        MailIDLabel.setBounds(50, 380, 100, 30);
	        MailIDField.setBounds(120, 380, 200, 30);
	 	 	            	  
	        RegisterButton.setBounds(90, 440, 150, 30);
	    }
	 
	    public void addComponents() {
	        Container.add(Message);
	        Container.add(NameLabel);
	        Container.add(NameField);
	        Container.add(DOBLabel);
	        Container.add(DOBField);
	        Container.add(AddressLabel);
	        Container.add(AddressField);
	        Container.add(GenderLabel);
	        Container.add(GenderMale);
	        Container.add(GenderFemale);
	        Container.add(MailIDLabel);
	        Container.add(MailIDField);
	        Container.add(MobileNoLabel);
	        Container.add(MobileNoField);
	        Container.add(ProgramLabel);
	        Container.add(ProgramList);
	        Container.add(RegisterButton);
	    }
	 
	    public static void main(String[] args) {
	        RegistrationForm frame = new RegistrationForm();
	        frame.setTitle("Registration Form");
	        frame.setVisible(true);
	        frame.setBounds(500, 100, 500, 700);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(true);
	 
	    }



}
