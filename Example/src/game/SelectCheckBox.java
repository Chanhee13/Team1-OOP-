
package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Manage.gameManager;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class SelectCheckBox extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnOk;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton rdbbtn1;
	JRadioButton rdbbtn2;
	JRadioButton rdbbtn3;
	JRadioButton rdbbtn4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectCheckBox frame = new SelectCheckBox();
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
	public SelectCheckBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SelectCheckBox");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		rdbbtn1 = new JRadioButton("1");
		buttonGroup.add(rdbbtn1);
		
		rdbbtn2 = new JRadioButton("2");
		buttonGroup.add(rdbbtn2);
		
		rdbbtn3 = new JRadioButton("3");
		buttonGroup.add(rdbbtn3);
		
		rdbbtn4 = new JRadioButton("4");
		buttonGroup.add(rdbbtn4);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
	
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbbtn1)
						.addComponent(rdbbtn2)
						.addComponent(rdbbtn3)
						.addComponent(rdbbtn4)
						.addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(261, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(rdbbtn1)
					.addGap(18)
					.addComponent(rdbbtn2)
					.addGap(18)
					.addComponent(rdbbtn3)
					.addGap(18)
					.addComponent(rdbbtn4)
					.addGap(27)
					.addComponent(btnOk)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnOk)
		{	
			if(rdbbtn1.isSelected()){
				gameManager.setRecentSelectSolution(0);
			}else if(rdbbtn2.isSelected()){
				gameManager.setRecentSelectSolution(1);
			}else if(rdbbtn3.isSelected()){
				gameManager.setRecentSelectSolution(2);
			}else if(rdbbtn4.isSelected()){
				gameManager.setRecentSelectSolution(3);
			}else{
				System.out.println("Not Checked");
			}
			this.dispose();
		}
	}


}
