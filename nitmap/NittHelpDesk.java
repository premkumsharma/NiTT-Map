package project;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.awt.event.*;
//import combo.*;
import project.*;

class MainMap implements ActionListener 
{
   
    JLabel nitjlab,zirjlab,pearjlab,octajlab,stadlab,prodlab,liblab,hosplab,gurulab,cselab,archlab;
	PlainButton zirjbut,pearlbut,octabut,stadbut,prodbut,libbut,hospbut,gurubut,csebut,archbut;
	JScrollBar jsbvert;
	JScrollBar jsbhorz;
	RoundButton home;
	
	ImageIcon zircon = new ImageIcon("zirconmap.jpg");
        JLabel pn = new JLabel(zircon);
        JPanel panel = new JPanel();
		Container c;
		ImageIcon img,zirimg,pearlimg,octaimg,stadimg,prodimg,libimg,hospimg,guruimg,cseimg,archimg;
		MainMap()
		{
		
		
	   img=new ImageIcon("Nitmainpic.jpg");
	   zirimg=new ImageIcon("zirconmap.jpg");
	   pearlimg=new ImageIcon("pearl.jpg");
	   octaimg= new ImageIcon("octagon.jpg");
	   stadimg= new ImageIcon("stadium.jpg");
	   prodimg=new ImageIcon("production.jpg");
	   libimg=new ImageIcon("library.jpg");
	   hospimg=new ImageIcon("hospital.jpg");
	   guruimg=new ImageIcon("gurunath.jpg");
	   cseimg=new ImageIcon("cse.jpg");
	   archimg=new ImageIcon("architect");
	   
	    final JFrame jfrm=new JFrame("NITT Online Help Desk");
		c=jfrm.getContentPane();
		c.setBackground(Color.cyan);
		//home button definition and information
	
        	home=new RoundButton("Home");
		home.setBounds(10,10,75,30);
		home.setBackground(Color.blue);
		c.add(home);
		home.addActionListener(this);
		
		c.setLayout(null);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
		
		 zirjlab=new JLabel(zirimg);
		nitjlab=new JLabel(img);		
                nitjlab.setBounds(0,0,1300,700);
		c.add(nitjlab);
		
		pearjlab= new JLabel(pearlimg);
		pearjlab.setBounds(0,0,1300,700);
		
		
		octajlab=new JLabel(octaimg);
		octajlab.setBounds(0,0,1300,700);
		
		stadlab= new JLabel(stadimg);
		stadlab.setBounds(0,0,1300,700);
		
		prodlab=new JLabel(prodimg);
		prodlab.setBounds(0,0,1300,700);
		
		liblab=new JLabel(libimg);
		liblab.setBounds(0,0,1300,700);
		
		hosplab=new JLabel(hospimg);
		hosplab.setBounds(0,0,1300,700);
		
		gurulab=new JLabel(guruimg);
		gurulab.setBounds(0,0,1300,700);
		
		cselab=new JLabel(cseimg);
		cselab.setBounds(0,0,1300,700);
		
		archlab=new JLabel(archimg);
		archlab.setBounds(0,0,1300,700);
				
		//zircon button implementation
		zirjbut=new PlainButton("---------");
		zirjbut.setBounds(450,105,100,30);
		nitjlab.add(zirjbut);
		zirjbut.addActionListener(this);
		  
		pearlbut=new PlainButton("-------------");
		pearlbut.setBounds(475,210,100,30);
		nitjlab.add(pearlbut);
		pearlbut.addActionListener(this);
	
	
	    octabut=new PlainButton("-------------");
		octabut.setBounds(380,390,100,30);
		octabut.setToolTipText("<html>"+"The OCTAGON - Computer Center is the "+"<br>"+"sterling hallmark of this campus."+"<br>"+"This center serves the campus-wide"+"<br>"+"LAN in close association "+"<br>"+"with the user departments."+"<br>"+"This LAN caters to totally "+"<br>"+"6000 users across the campus"+"<br>"+"(1600 users at the same"+"<br>" +"time using Wired connection"+"<br>"+"and the remaining users"+"<html>"); 
		 nitjlab.add(octabut);				   
		octabut.addActionListener(this);
		
		stadbut= new PlainButton("------------");
		stadbut.setBounds(410,580,100,30);
		stadbut.setToolTipText("this area covers high profile");
		stadbut.addActionListener(this);
		nitjlab.add(stadbut);
		
		prodbut=new PlainButton("-------------");
		prodbut.setBounds(450,390,100,30);
		prodbut.addActionListener(this);
		nitjlab.add(prodbut);
		
		libbut=new PlainButton("-Libraray-");
		libbut.setBounds(550,540,100,30);
		libbut.addActionListener(this);
		nitjlab.add(libbut);
		
		hospbut=new PlainButton("-Hospital-");
		hospbut.setBounds(640,280,100,30);
		hospbut.addActionListener(this);
		hospbut.setToolTipText("<html>"+"New NIT-T HOSPITAL"+"<br>"+"Date of Commencement: 19/2/2007"+"<br>"+"Estimated Cost: Rs.195 Lakhs"+"<br>"+"Location: Behind old hospital"+"</html>");
		nitjlab.add(hospbut);
		
		gurubut=new PlainButton("-Gurunath-");
		gurubut.setBounds(430,290,100,30);
		gurubut.addActionListener(this);
		nitjlab.add(gurubut);
		
		csebut=new PlainButton("-- Cse ---");
		csebut.setBounds(550,420,100,30);
		csebut.addActionListener(this);
		csebut.setToolTipText("<html>"+"The Department of Computer Applications "+"<br>"+"is one of the pioneering departments"+"<br>"+" of the institution that offers Information+"+"<br>" +"Technology courses"+"<br>"+"This department currently offers"+"<br>"+"two full-time post-graduate programmes" + "<br>" +"— three-year Master of Computer Applications (MCA)"+"<br>"+" programme and two-year"+"<br>" +"Master of Science (Operations Research &"+"<br>" +"Computer Applications) [M.Sc.(OR & CA)] programme. "+"</HTML>");
		nitjlab.add(csebut);
		
		archbut=new PlainButton("-------------");
		archbut.setBounds(205,410,100,30);
		archbut.addActionListener(this);
		nitjlab.add(archbut);
		
		
		
		jfrm.setBounds(5,5,1350,750);
		/*jsbvert=new JScrollBar();
		jsbvert.setBounds(40,100,15,200);
		c.add(jsbvert);
		         
		//jsbhorz=JScrollBar(Adjustable.HORIZONTAL);
		//c.setBackground(img);
		jsbvert.addAdjustmentListener( new AdjustmentListener(){
		
		public void adjustmentValueChanged(AdjustmentEvent ae){
		if(jsbvert.getValueIsAdjusting()) 
		  nitjlab.setBounds(0,0,1300+ae.getValue(),700+ae.getValue());
		}
		});*/
		}
		public void actionPerformed(ActionEvent ae)
		{
		    if(ae.getSource()==zirjbut)
			{
			       zirjbut.setVisible(true);
                   zirjlab.setVisible(true);
				   zirjlab.setBounds(0,0,1300,700);
				   nitjlab.setVisible(false);
				   nitjlab.setVisible(false);
				    c.add(zirjlab);
				   }
			if(ae.getSource()==home)
            {
		           	           
			      
                   nitjlab.setVisible(true);
			       zirjlab.setVisible(false);
				   pearjlab.setVisible(false);
				   octajlab.setVisible(false);
				   stadlab.setVisible(false);
				   prodlab.setVisible(false);
				   hosplab.setVisible(false);
				   gurulab.setVisible(false);
				   cselab.setVisible(false);
                   liblab.setVisible(false);
                   archlab.setVisible(false);				   
				 c.add(nitjlab);
					}
					
					
			if(ae.getSource()==pearlbut)
			{
			       pearlbut.setVisible(true);
                   pearjlab.setVisible(true);
				   nitjlab.setVisible(false);
				   c.add(pearjlab);
				   }


            if(ae.getSource()==octabut)
			{
			       octabut.setVisible(true);
                   octajlab.setVisible(true);
				  nitjlab.setVisible(false);
				  c.add(octajlab);
				   }

              if(ae.getSource()==stadbut)
			{
			       stadbut.setVisible(true);
                   stadlab.setVisible(true);
				   nitjlab.setVisible(false);
				   c.add(stadlab);
				   }
				   
			if(ae.getSource()==prodbut)
			{
			       prodbut.setVisible(true);
                   prodlab.setVisible(true);
				   nitjlab.setVisible(false);
				   c.add(prodlab);
				   }
	        if(ae.getSource()==hospbut)
			{
			       hospbut.setVisible(true);
                   hosplab.setVisible(true);
				   nitjlab.setVisible(false);
				   c.add(hosplab);
				   }

			if(ae.getSource()==gurubut)
			{
			       gurubut.setVisible(true);
                   gurulab.setVisible(true);
				   nitjlab.setVisible(false);
				   c.add(gurulab);
				   }
	        if(ae.getSource()==csebut)
			{
			       csebut.setVisible(true);
                   cselab.setVisible(true);
				   nitjlab.setVisible(false);
				   c.add(cselab);
				   }
            if(ae.getSource()==libbut)
			{
			       libbut.setVisible(true);
                   liblab.setVisible(true);
				   nitjlab.setVisible(false);
				   c.add(liblab);
				   }
			if(ae.getSource()==archbut)
			{
			       archbut.setVisible(true);
                   archlab.setVisible(true);
				   nitjlab.setVisible(false);
				   c.add(archlab);
				   }
	   
							   
					}  
				   
	
		
		
		 
		 
	public static void main (String arg[])
		{ 
		  MainMap sb=new MainMap() ;
//		  Combo c=new Combo();
		  //sb.setBackground(Color.red);
		 //sb.setVisible(true); 
		  //sw.printLocation();
		  
		  //sw.setVisible(true);
		  /*SwingUtilities.invokeLater(new Runnable(){
		  public void run()
		  {
		       new IconLabel();
			   }
	       });*/
		
		}	
		}