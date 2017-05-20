package packcross;
import java.applet.Applet;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarFile;
import java.applet.*;
import java.awt.Canvas;
import javax.swing.*;




public class CrossPic extends JFrame implements ActionListener


{
	public CrossPic() {

	    setSize(1170,700);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       setBackground(Color.BLACK);
	     
	
ImageIcon play=new ImageIcon("C://Users//Abhishek//Desktop//project//play2.png");
ImageIcon rules=new ImageIcon("C://Users//Abhishek//Desktop//project//story.png");
ImageIcon backimg2=new ImageIcon("C://Users//Abhishek//Desktop//project//scroll.png");	
	JButton b1=new JButton ("plays",play);
	
    JButton b2=new JButton ("rule",rules);
    JLabel l1=new JLabel(backimg2);


    
	
	   Container c=getContentPane();
	  
	   
	   c.add(l1);
	   l1.add(b1);
	   l1.add(b2);
	   setLayout(null);
	b1.setBounds(300, 350, 190, 200);
	b2.setBounds(650, 350, 190, 200);
	l1.setSize(1164, 710);
	b1.addActionListener(this);
	b2.addActionListener(this);
	setBackground( Color.BLACK );
	setResizable(false);
	 setVisible(true);
	}
	
	
		
						// canvas started guide when clicked on button
	public void actionPerformed(ActionEvent ae)
	{
		System.out.print(",....1111111....");
			if (ae.getActionCommand()=="rule")
			{
				
				new Frame2();
					
			}   //new button click added
			
			else if (ae.getActionCommand()=="plays") 
			{ 
				new PicPuzzel();
				
				//JFrame f=new JFrame();
			
				//ImageIcon lev=new ImageIcon("C://Users//Abhishek//Desktop//project//level.jpg");
				
				
				//JLabel lb=new JLabel(lev); 
			 
				  //f.setLayout(new BorderLayout());
				  //f.add(new JButton("click"),BorderLayout.SOUTH);	   
				  
					  
				   //lb.setSize(1100, 700);
				     //f.setTitle("kkk");
				 
				   
				   //f.add(lb);
				   //f.add(new Levelmove());
				   
				   
				   
				  // f.setVisible(true);
				   //f.setSize(1100,700);
				  
			}
			
			
			
			
			
			
			
			
			
			
		}
	



	public static void main(String args[])
	{ 
	
		new CrossPic();
		
		
	
		
	}}



	
				
		
		
	

	
	

	
	
	
	
	


