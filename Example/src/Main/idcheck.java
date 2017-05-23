package Main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class idcheck implements ActionListener {
	JFrame ejf = new JFrame("ID is overlap");

	public idcheck(){
				JPanel ejp = new JPanel();
		JLabel ejl = new JLabel("ID is can not use, please change");
		JButton ejb = new JButton("OK");
		ejb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					ejf.dispose();
			}
		});
		
		ejp.setLayout(new BoxLayout(ejp, BoxLayout.Y_AXIS));
		ejp.setLayout(new FlowLayout(FlowLayout.CENTER));
		ejp.add(ejl);
		ejp.add(ejb);
		ejf.getContentPane().add(ejp);
		ejf.setSize(300, 100);
		ejf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
