package project;
import javax.swing.*;
import javax.swing.event.*;
class PlainButton extends JButton
{
    public PlainButton()
	{
	  setOpaque(false);
	  setContentAreaFilled(false);
      setBorderPainted(false);
		}
		
	public PlainButton(String text)
	{
	  super(text);
	  setOpaque(false);
	  setContentAreaFilled(false);
      setBorderPainted(false);
		}	
		}
	