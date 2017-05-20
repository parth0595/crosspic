package packcross;

import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;  
import java.awt.*;  

import javax.swing.*;  
class PicPuzzel extends JFrame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB; 
static int count=0;
String p;


//-------------------------------------------------------------------------------
Timer timer;						
public int delay =100;
public int minute;

public int second;

public int hour;

public JLabel watch;
public JButton start;
int flag=0;
JTextField tf=new JTextField();
//-------------------------------------------------------------------------------
Icon star=new ImageIcon();  
Icon ic0=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-02.jpg");  
Icon ic10=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rab-02.jpg");  
Icon ic20=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpap-02.jpg");  
Icon samicon1=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-games-1920x1080.jpg");  
Icon samicon2=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rabbit_wallpaper_hd_11.jpg");  
Icon samicon3=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpaper.jpg");  
Icon ic1=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-02.jpg");  
Icon ic2=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-05.jpg");  
Icon ic3=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-ga.jpg");  
Icon ic4=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-03.jpg");  
Icon ic5=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-09.jpg");  
Icon ic6=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-07.jpg");  
Icon ic7=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-04.jpg");  
Icon ic8=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-06.jpg");  
Icon ic9=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//Mario-mario-wallpaper-hd-08.jpg");  
  
Icon ic11=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rabbit.jpg");  
Icon ic12=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rab-03.jpg");  
Icon ic13=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rab-04.jpg");  
Icon ic14=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rab-05.jpg");  
Icon ic15=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rab-06.jpg");  
Icon ic16=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rab-07.jpg");  
Icon ic17=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rab-08.jpg");  
Icon ic18=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rab-09.jpg");  
Icon ic19=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//nature_spring_animal_rab-02.jpg");  
  
Icon ic21=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpap-02.jpg");  
Icon ic22=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpaper_.jpg");  
Icon ic23=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpap-06.jpg");  
Icon ic24=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpap-04.jpg");  
Icon ic25=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpap-07.jpg");  
Icon ic26=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpap-03.jpg");  
Icon ic27=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpap-09.jpg");  
Icon ic28=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpap-05.jpg");  
Icon ic29=new ImageIcon("C://Users//Abhishek//Desktop//MyApp//images//tree-snake-hd-hd-wallpap-08.jpg");  
  
PicPuzzel(){  
  
super("pic puzzle");  
  
b1=new JButton(ic1);  
b1.setBounds(10,80,100,100);  
b2=new JButton(ic2);  
b2.setBounds(110,80,100,100);  
b3=new JButton(ic3);  
b3.setBounds(210,80,100,100);  
b4=new JButton(ic4);  
b4.setBounds(10,180,100,100);  
b5=new JButton(ic5);  
b5.setBounds(110,180,100,100);  
b6=new JButton(ic6);  
b6.setBounds(210,180,100,100);  
b7=new JButton(ic7);  
b7.setBounds(10,280,100,100);  
b8=new JButton(ic8);  
b8.setBounds(110,280,100,100);  
b9=new JButton(ic9);  
b9.setBounds(210,280,100,100); 
tf.setBounds(500,200,40,40);
JLabel nl=new JLabel("TOATL MOVES");
nl.setForeground(Color.blue);
nl.setBounds(400, 200, 150, 40);
sample=new JButton(samicon1);  
sample.setBounds(700,100,200,200);  
  
JLabel l1=new JLabel("Sample:");  
l1.setBounds(620,200,70,20);
JLabel l2=new JLabel("NOTE::   THIS PIC HAS THE POWER TO SWAP   ---------- ");
l2.setBounds(250,15,500,20); 
l2.setForeground(Color.blue); 
JLabel l3=new JLabel("Click sample picture to next puzzle");  
l3.setBounds(700,320,200,20);  
l3.setForeground(Color.red);  
starB=new JButton(ic9);  
starB.setBounds(550,5,100,100);  
star=b9.getIcon();  
add(tf);
add(nl);
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);  
add(b9);add(sample);add(l1);add(l2);add(starB);add(l3);  
b1.addActionListener(this); b2.addActionListener(this);  
 b3.addActionListener(this); b4.addActionListener(this);   
b5.addActionListener(this); b6.addActionListener(this);  
 b7.addActionListener(this); b8.addActionListener(this);  
 b9.addActionListener(this);   
  // new add------------------------------------------------------------------
 
 watch = new JLabel("00:00:00");					
	watch.setForeground(Color.blue);
	watch.setFont(new Font("Helvetica", Font.PLAIN, 30));
	watch.setBounds(800,350,200,30);
	add(watch);
	
	timer = new Timer(delay,this);
	start=new JButton("Start");
	start.setBounds(700,350,80,30);	//start button
	start.addActionListener(this);
	
	add(start);
	
 // add close--------------------------------------------------------------------
sample.addActionListener(this); 
 
setLayout(null);  
setSize(1000,500);  
setVisible(true);  
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}  
  
public void actionPerformed(ActionEvent e){  
	if(e.getActionCommand()=="start")
	{
		
		
	//------------------------------------------------------------
									
		watch = new JLabel("00:00:00");					
		watch.setForeground(Color.blue);
		watch.setFont(new Font("Helvetica", Font.PLAIN, 30));
		watch.setBounds(840,350,200,30);
		add(watch);
		
		timer = new Timer(delay,this);
		start=new JButton("Start");
		start.setBounds(750,350,80,30);	//start button
		start.addActionListener(this);
		
		add(start);}{
		timer.start();//starting the Timer
		flag=1;
	}     
			
		
		if(flag==1)
		{
			
			final int limit =60;
			final int two_digit_start = 10;
			if (minute == 30) //setting condition to be 30 min
			{													
				JOptionPane.showMessageDialog(null,"you took too long..");
				timer.stop();//stop the timer
				minute = 0;
				second = 0;
				hour=0;
			}
			second++;
			if (second == limit) {
			minute++;
			second = 0;
			}
			if (minute == limit) {
			hour++;
			minute = 0;
			}
		
		/*if (!timer.isRunning()) 
		{				
			timer.stop();
			minute = 0;								
			second = 0;
			hour = 0;
			watch.setText("00:00:00");
		}*/
watch.setText(((hour <two_digit_start) ? "0" : "") + hour + ":"+ ((minute < two_digit_start) ? "0" : "") + minute + ":"+ ((second < two_digit_start) ? "0" : "") + second);

 
	
	
		}

	//------------------------------------------------------------

	if (flag==1){
	//-----------------------------------------------------------
if(e.getSource()==b1)
	{
    Icon s1=b1.getIcon();  
      if(b2.getIcon()==star)
      {  
        b2.setIcon(s1);  
        b1.setIcon(star);  
        count++;
        p=Integer.toString(count);
        tf.setText(p);
      } 
      else if(b4.getIcon()==star){  
                    b4.setIcon(s1);  
                    b1.setIcon(star);  
                
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);}  
  }
  
if(e.getSource()==b2){  
    Icon s1=b2.getIcon();  
      if(b1.getIcon()==star){  
        b1.setIcon(s1);  
        b2.setIcon(star);  
        count++;
        p=Integer.toString(count);
        tf.setText(p);
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b2.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
         else if(b3.getIcon()==star){  
                    b3.setIcon(s1);  
                    b2.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
  }//end of if  
  
if(e.getSource()==b3){  
    Icon s1=b3.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b3.setIcon(star);
        count++;
        p=Integer.toString(count);
        tf.setText(p);
      } else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b3.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);     }  
  }
  
if(e.getSource()==b4){  
    Icon s1=b4.getIcon();  
      if(b1.getIcon()==star){  
        b1.setIcon(s1);  
        b4.setIcon(star);  
        count++;
        p=Integer.toString(count);
        tf.setText(p);
      } 
      else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b4.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
         else if(b7.getIcon()==star){  
                    b7.setIcon(s1);  
                    b4.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
  }
  
if(e.getSource()==b5){  
    Icon s1=b5.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b5.setIcon(star);  
        count++;
        p=Integer.toString(count);
        tf.setText(p);
        }
      else if(b4.getIcon()==star){  
                    b4.setIcon(s1);  
                    b5.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);             }  
         else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b5.setIcon(star);  
                   }  
          else if(b8.getIcon()==star){  
                    b8.setIcon(s1);  
                    b5.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
  }
  
if(e.getSource()==b6){  
    Icon s1=b6.getIcon();  
      if(b3.getIcon()==star){  
        b3.setIcon(s1);  
        b6.setIcon(star);  
        count++;
        p=Integer.toString(count);
        tf.setText(p);
      } 
      else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b6.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
         else if(b9.getIcon()==star){  
                    b9.setIcon(s1);  
                    b6.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
}
  
if(e.getSource()==b7){  
    Icon s1=b7.getIcon();  
      if(b4.getIcon()==star){  
        b4.setIcon(s1);  
        b7.setIcon(star);  
        count++;
        p=Integer.toString(count);
        tf.setText(p);
        } 
      else if(b8.getIcon()==star){  
                    b8.setIcon(s1);  
                    b7.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
 }
  
   if(e.getSource()==b8){  
    Icon s1=b8.getIcon();  
      if(b7.getIcon()==star){  
        b7.setIcon(s1);  
        b8.setIcon(star);
        count++;
        p=Integer.toString(count);
        tf.setText(p);
      } 
      else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b8.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
         else if(b9.getIcon()==star){  
                    b9.setIcon(s1);  
                    b8.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
  
  }
  
 if(e.getSource()==b9){  
    Icon s1=b9.getIcon();  
      if(b8.getIcon()==star){  
        b8.setIcon(s1);  
        b9.setIcon(star);  
        count++;
        p=Integer.toString(count);
        tf.setText(p);
        } 
      else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b9.setIcon(star);  
                    count++;
                    p=Integer.toString(count);
                    tf.setText(p);
                    }  
  }  
	}
if(e.getSource()==sample){ 
	//++++++++++++++++++++++++++++++++++
	count=0;
	tf.setText(null);
	timer.stop();
	minute = 0;								
	second = 0;
	hour = 0;
	watch.setText("00:00:00");
	

	
	//+++++++++++++++++++++++++++++++++
	
Icon s1=sample.getIcon();  
 if(s1==samicon3){
	 
	 //------------------------------------------------------
	 JFrame f=new JFrame();
		{
			
			ImageIcon lev=new ImageIcon("C://Users//Abhishek//Desktop//project//levelmove 3.jpg");
		
		
		JLabel lb=new JLabel(lev); 
		
		 
		     f.setTitle("YOU WON");
		 f.setVisible(true);
		   f.setSize(1100,700);
		   f.add(lb);
		   lb.setSize(1100, 700);
		   f.add(new Levelmove());
		   sample.setIcon(null);
		   sample.setBounds(500, 500, 0, 0);
	 }	 //-------------------------------------------------------
//sample.setIcon(samicon1);  
//b1.setIcon(ic1);  
//b2.setIcon(ic2);  
//b3.setIcon(ic3);  
//b4.setIcon(ic4);  
//b5.setIcon(ic5);  
//b6.setIcon(ic6);  
//b7.setIcon(ic7);  
//b8.setIcon(ic8);  
//b9.setIcon(ic9);  
//star=b9.getIcon();  
//starB.setIcon(ic0);  
}
else if(s1==samicon1){  
sample.setIcon(samicon2);  
b1.setIcon(ic11);  
b2.setIcon(ic12);  
b3.setIcon(ic13);  
b4.setIcon(ic14);  
b5.setIcon(ic15);  
b6.setIcon(ic16);  
b7.setIcon(ic17);  
b8.setIcon(ic18);  
b9.setIcon(ic19);  
star=b6.getIcon();  
starB.setIcon(ic16);  
}  
else{  
sample.setIcon(samicon3);  
b1.setIcon(ic21);  
b2.setIcon(ic22);  
b3.setIcon(ic23);  
b4.setIcon(ic24);  
b5.setIcon(ic25);  
b6.setIcon(ic26);  
b7.setIcon(ic27);  
b8.setIcon(ic28);  
b9.setIcon(ic29);  
star=b6.getIcon();  
starB.setIcon(ic26);  
}
} 
}  

  
public static void main(String args[]){  
new PicPuzzel();  
}
}


