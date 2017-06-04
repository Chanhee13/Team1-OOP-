package game;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class subway extends Dungeon2 {
	Container cPane;
	ImageIcon img;
	JLabel Imgbox;
	
	public void subway()
	{ cPane=getContentPane();
	  cPane.setLayout(null);
	  img=new ImageIcon("java.png");
	Imgbox=new JLabel(img);
	Imgbox.setBounds(0, 50, img.getIconWidth(), img.getIconHeight());
	cPane.add(Imgbox);
	}
}
