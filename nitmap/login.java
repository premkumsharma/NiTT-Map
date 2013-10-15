package project;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.awt.event.*;
import project.*;


class Login extends JFrame implements ActionListener 
{
    JTextField userid;
    JPasswordField pass;
	JLabel userlb,passlb,plab;//
	 MainMap mp;
	// Main m;
	 JProgressBar prgbar;
	JButton logbut,canbut;
        Login()
		{
		  userid=new JTextField();
		  pass=new JPasswordField(8);
		  userlb=new JLabel(" User Name ");
		  passlb=new JLabel(" Password  ");
          logbut= new JButton("Login");
		  canbut= new JButton("Cancel");
		  //Container c=getContentPane();
		  userlb.setBounds(50,50,100,25);
		  passlb.setBounds(50,80,100,25);
		  userid.setBounds(180,52,150,20);
		  pass.setBounds(180,82,150,20);
		  logbut.setBounds(150,140,80,20);
		  canbut.setBounds(250,140,80,20);
		  logbut.addActionListener(this);
		  canbut.addActionListener(this);
		  plab=new JLabel();
		  plab.setBounds(200,180,100,20);
		  prgbar= new JProgressBar();
		  prgbar.setBounds(200,180,100,20);
		  prgbar.setStringPainted(true);
		  prgbar.setMaximum(100000);
		  add(prgbar);
		  prgbar.setVisible(false);
		  //plab.add(prgbar);
		  //prgbar.setMinimum(0);
		  //prgbar.setMaximum(100);
		  add(pass);
		  add(userid);
		  add(userlb);
		  add(passlb);
		  add(logbut);
		  add(canbut);
		  add(plab);
		  setLayout(null);
		  }  
		  
		  public void actionPerformed(ActionEvent ae)
		  {
		  	    /*class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		        Connection con=DriverManager.getConnection("jdbc:odbc:NITTDB","system","patel");
		        PreparedStatement stmt= con.prepareStatement("select * from login where UserName=?")*/
		       if(ae.getSource()==logbut)
			      {
				   char [] ps={'r','a','n','j','a','n'};
					 if(userid.getText().equals("prem")&& Arrays.equals(ps,pass.getPassword()))
				     {
					    
                        prgbar.setVisible(true);					 
					    for(int i=0;i<100000;i++)
						   prgbar.setValue(i);
						   setVisible(false);
						   //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					   mp=new MainMap();
					   }
					else
                    JOptionPane.showMessageDialog(userid,"Invalid Username or Password");
					  
                  }
				  
                 if(ae.getSource()==canbut)
                 {System.exit(0);}
            }
			
	public static void main(String args[])
{
        Login ln=new Login();
        ln.setVisible(true);
        ln.setBounds(400,200,400,250);
		ln.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
		
		  