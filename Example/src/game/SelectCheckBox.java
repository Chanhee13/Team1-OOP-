
package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Information.Assignment;
import Information.SelectAssignment;
import Manage.gameManager;
import Monster.SelectMonster;

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
	String sol="";
	String[] wor = {"","",""};

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
		
		//현재 문제를 받아오고 문제 번호를 증기시킵니다. 
		SelectMonster seMon = (SelectMonster) gameManager.getRecentMonster();
		int pbrNum = seMon.getPrbNum();
		ArrayList<Assignment> assignments = gameManager.getRecentMonster().getAssignment();
		
		
		Assignment a = assignments.get(pbrNum);
		
		
		//정답과 오답을 받아옵니다.
		
		if(a instanceof SelectAssignment){
			sol = ((SelectAssignment) a).getSolution();
			wor = ((SelectAssignment) a).getWrong();
		}{
			System.out.println("This is Not SelectAssignment \nHere: SelectCheckBox");
		}
		gameManager.getRecentMonster().setPrbNum(gameManager.getRecentMonster().getPrbNum()+1);
		
		
		
		//문제에 해당하는 정답과 오답을 출력합니다.
		rdbbtn1 = new JRadioButton("1. "+sol);
		buttonGroup.add(rdbbtn1);
		
		rdbbtn2 = new JRadioButton("2"+wor[0]);
		buttonGroup.add(rdbbtn2);
		
		rdbbtn3 = new JRadioButton("3"+wor[1]);
		buttonGroup.add(rdbbtn3);
		
		rdbbtn4 = new JRadioButton("4"+wor[2]);
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
		
		Object bt = e.getSource();
		
		//입력한답을 저장합니다.
		if(rdbbtn1.isSelected()){
			gameManager.setRecentSelectSolution(sol);
		}else if(rdbbtn2.isSelected()){
			gameManager.setRecentSelectSolution(wor[1]);
		}else if(rdbbtn3.isSelected()){
			gameManager.setRecentSelectSolution(wor[2]);
		}else if(rdbbtn4.isSelected()){
			gameManager.setRecentSelectSolution(wor[3]);
		}else{
			System.out.println("Not Checked");
		}
		
		//정답인지 확인합니다.
		if(gameManager.getRecentMonster().isCorrect(gameManager.getRecentSelectSolution()))
		{
			System.out.println("Your answer is right!");
		}
		else
			System.out.println("Your answer is NOT right!");
		
		if(bt.equals(btnOk)){
			Dungeon.renderNextAs();
			this.dispose();;
		}
	}


}
