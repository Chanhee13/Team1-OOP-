package Main;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IdPasswordCheck extends JFrame implements ActionListener{
	
	
	public JLabel wrong = new JLabel("you have wrong id and password");
	public JButton returnIdmake = new JButton("Okay");
	JFrame frame = new JFrame();
	
	
	public IdPasswordCheck()
	{
		frame.setTitle("ID is not exist");
		Container panel = frame.getContentPane();
		panel.setLayout(new GridBagLayout());
		panel.add(wrong);
		panel.add(returnIdmake);
		
		returnIdmake.addActionListener(this); 
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		frame.setSize(400,200);
		frame.setVisible(true); 
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(returnIdmake))           // Id 로그인 창으로 돌아간다.
		{
			Main a = new Main();
			frame.dispose();
		}
		
	}

}
