package packcross;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.Canvas;
import javax.swing.*;

public class Levelmove extends JPanel implements ActionListener {

	Timer t;
	double x,y,newx,newy;
	
	
	Levelmove(){
		t=new Timer (5,this);
		    x=300;
		    y=100;
		    newx=5;
		    newy=5;
			
		//setSize(400,400);
		//setVisible(true);
		
		
	
		
}
	
	   public void paintComponent(Graphics g)
	   
	   {   super.paintComponents(g);
		   Graphics2D g2=(Graphics2D) g;
		   Ellipse2D circle=new Ellipse2D.Double(x,y,25,25) ;
		   g2.fill(circle);
		   t.start();
		   if(x>680&&y>480){
		   t.stop();
		   }
		   }
	   
	   public void actionPerformed(ActionEvent e){
		   x+=newx;
		   y+=newy;
		 
		   repaint();
		   
		   
	      
}
public static void main(String args[])
{
	JFrame f=new JFrame();
	
	ImageIcon lev=new ImageIcon("C://Users//Abhishek//Desktop//project//levelmove 3.jpg");
	
	
	JLabel lb=new JLabel(lev); 
 
	  f.setLayout(new BorderLayout());
	     
	  
		  
	   lb.setSize(1100, 700);
	     f.setTitle("YOU WON");
	 
	   
	   f.add(lb);
	   f.add(new Levelmove());
	   
	   
	   
	   f.setVisible(true);
	   f.setSize(1100,700);
	  
}
}

   


