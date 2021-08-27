import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;

public class splash extends JFrame {

	private JPanel contentPane;
	private static JProgressBar progressBar;
	private static JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		int x;
		splash frame = new splash();
		frame.setVisible(true);
					
		try 
		{
			for(x=0;x<=100;x++)
			{	
				splash.progressBar.setValue(x);
				Thread.sleep(50);
				splash.lblNewLabel_1.setText(Integer.toString(x)+"%");
				if(x==100)
				{
					frame.dispose();
				}
			} 
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 * Create the frame.
	 */
	public splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/picc7.jpeg"));
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(10, 27, 680, 398);
		contentPane.add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(Color.MAGENTA);
		progressBar.setBackground(Color.BLACK);
		progressBar.setBounds(34, 460, 624, 19);
		contentPane.add(progressBar);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(329, 435, 45, 19);
		contentPane.add(lblNewLabel_1);
	}
}
