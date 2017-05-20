package packcross;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class SampleABC  extends JFrame implements ActionListener
{
	Timer timer;						
	private int delay =1000;
	private int minute;
	
	private int second;
	
	private int hour;
	
	private JLabel watch;
	JButton start;
	int flag=0;
	
	SampleABC()
	{
		

		//setSize(1000,550);							
		//setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setVisible(true);							
		watch = new JLabel("00:00:00");					
		watch.setForeground(Color.blue);
		watch.setFont(new Font("Helvetica", Font.PLAIN, 30));
		watch.setBounds(840,350,200,30);
		add(watch);
		
		timer = new Timer(delay,this);
		start=new JButton("Start");
		start.setBounds(750,350,80,30);	//start button
		start.addActionListener(this);
		
		add(start);
		}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==start)
		{
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
	}

public static void main(String args[])
{
	
	new SampleABC();
}





}
