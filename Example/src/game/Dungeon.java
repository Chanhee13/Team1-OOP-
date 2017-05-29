package game;

import game.Stage_GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import Manage.gameManager;
import Monster.*;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Dungeon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dungeon frame = new Dungeon();
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
	public Dungeon() {
		setTitle("Fight!");
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel problem = new JPanel();
		problem.setBorder(new TitledBorder(null, "Problem", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		Image img=new ImageIcon("java.png").getImage();
		
		JPanel monster = new JPanel() {
			protected void paintComponent(Graphics g) {
				
				g.drawImage(img, 0, 0,750,250, null);
			//
	            }
	        };

		monster.setBorder(UIManager.getBorder("InternalFrame.border"));
		monster.setForeground(Color.WHITE);
	

		
		
		
		JButton btnNewButton = new JButton("Answer\n check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster m = gameManager.getRecentMonster();
				if(m instanceof	SelectMonster){
					SelectCheckBox.main(null);
				}
				else if(m instanceof OXMonster){
					SelectOXBox.main(null);
				}
				else if(m instanceof TypeMonster){
					SelectTypeBox.main(null);
				}
				
				/*
				JFrame frame = new JFrame("Answer check");
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				JTextArea textarea = new JTextArea();
				textarea.append("Á¤´ä");
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(17, 31, 311, 165);
				scrollPane.setViewportView(textarea);
				textarea.setEditable(true);
				frame.getContentPane().add(scrollPane);
				frame.setSize(300, 200);
				frame.setVisible(true);
				*/
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(problem, GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(monster, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(monster, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(problem, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
