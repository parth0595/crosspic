package packcross;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Frame2 extends Canvas implements ActionListener{
	{
JFrame frame2 =new JFrame ();
frame2.setBackground(Color.BLACK ); 
frame2.setLayout(null);








JButton b1=new JButton("BACK");
b1.setBounds(70, 80, 100, 50);
b1.setBackground(Color.black);
b1.setForeground(Color.white);
b1.addActionListener(this);
frame2.add(b1);


ImageIcon imghtp=new ImageIcon("C://Users//Abhishek//Desktop//project//imghtp.jpg");
JLabel l1=new JLabel(imghtp);

l1.setSize(1023, 772);
b1.setBounds(400, 550, 100, 60);
frame2.setSize(1050,774);
frame2.setVisible(true);
frame2.add(l1);





}
	
	
 public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
	System.out.print(".......");
	 if (ae.getActionCommand()=="BACK"){
		 
		new CrossPic();
		
	 }
	 
	
	 
	 
	 {
		 
	 }
	 
	}





private Container getContentPane() {
	// TODO Auto-generated method stub
	return null;
}


public static void main(String args[])
{
	
	new Frame2();
	
}




}
