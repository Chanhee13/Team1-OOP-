package game;
import Manage.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;


import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Dungeon2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dungeon2 frame = new Dungeon2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dungeon2() {
		setTitle("Fight!");
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel problem = new JPanel();
		problem.setBorder(new TitledBorder(null, "Problem", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		
		

		
		problem.setBorder(new TitledBorder(null, "Problem", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		Image img=new ImageIcon("java.png").getImage();
		
		JPanel monster = new JPanel() {
			protected void paintComponent(Graphics g) {
				
				g.drawImage(img, 0, 0,750,250, null);
			
	            }
	        };

		
		
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Answer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(problem, GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(monster, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
							.addGap(3)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(monster, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(problem, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JRadioButton rdbtnA = new JRadioButton("A");
		
		buttonGroup.add(rdbtnA);
		panel.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		buttonGroup.add(rdbtnB);
		panel.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		buttonGroup.add(rdbtnC);
		panel.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		buttonGroup.add(rdbtnD);
		panel.add(rdbtnD);
		contentPane.setLayout(gl_contentPane);
	}
}