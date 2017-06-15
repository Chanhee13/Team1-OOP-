package game;

import User.User;
import Monster.Monster;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

import Manage.gameManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Stage_GUI extends User implements ActionListener{
	private JFrame frame = new JFrame("Select Stage");
	
	private JButton Stage1 = new JButton("Stage 1");
	private JButton Stage2 = new JButton("Stage 2");
	private JButton Stage3 = new JButton("Stage 3");
	private JButton Stage4 = new JButton("Stage 4");
	private JButton Stage5 = new JButton("Stage 5");
	private JButton Stage6 = new JButton("Stage 6");
	private JButton Stage7 = new JButton("Stage 7");
	private JButton Stage8 = new JButton("Stage 8");
	
	public void stage(String name)
	{
		
		frame.setSize(470, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		
		
		
		JLabel label = new JLabel("Welcome. " +name);
		frame.add(label);
		label.setBounds(50, 20, 300, 10);
		
		frame.add(Stage1);
		Stage1.setLocation(120, 60);
		Stage1.setSize(210, 60);
		
		frame.add(Stage2);
		Stage2.setLocation(120, 130);
		Stage2.setSize(210, 60);
		
		frame.add(Stage3);
		Stage3.setLocation(120, 200);
		Stage3.setSize(210, 60);
		
		/*
		frame.add(Stage4);
		Stage4.setLocation(120, 270);
		Stage4.setSize(210, 60);
		
		frame.add(Stage5);
		Stage5.setLocation(120, 340);
		Stage5.setSize(210, 60);
		
		frame.add(Stage6);
		Stage6.setLocation(120, 410);
		Stage6.setSize(210, 60);
		
		frame.add(Stage7);
		Stage7.setLocation(120, 480);
		Stage7.setSize(210, 60);
		
		frame.add(Stage8);
		Stage8.setLocation(120, 550);
		Stage8.setSize(210, 60);
		*/
		
		
		Stage1.addActionListener(this);
		Stage2.addActionListener(this);
		Stage3.addActionListener(this);
		
		/*
		Stage4.addActionListener(this);
		Stage5.addActionListener(this);
		Stage6.addActionListener(this);
		Stage7.addActionListener(this);
		Stage8.addActionListener(this);
		*/
		
		frame.setVisible(true);
		frame.setResizable(false);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e){ 
		Object bt = e.getSource();
		
		if(bt == Stage1)
		{
			//Stage1.setBackground(Color.GRAY);
			gameManager.setRecentStage(1);
			System.out.println("===================지금 스테이지는====================");
			System.out.println("++++++++"+gameManager.getRecentStage()+"+++++++++++++");
			Dungeon D1 = new Dungeon(frame);
			gameManager.setRecentDungeon(D1);
			frame.setVisible(false);
			//D1.main(null);
			
		}
		
		if(bt == Stage2)
		{	
			//Stage2.setBackground(Color.GRAY);
			if(gameManager.getRecnetUser().isCleared(1)){
				gameManager.setRecentStage(2);
				System.out.println("===================지금 스테이지는====================");
				System.out.println("++++++++"+gameManager.getRecentStage()+"+++++++++++++");
				Dungeon D1 = new Dungeon(frame);
				gameManager.setRecentDungeon(D1);
				frame.setVisible(false);
			}else{
				JOptionPane.showMessageDialog(null, "To enter stage2, you must complete stage1.","Warning!", JOptionPane.INFORMATION_MESSAGE);
			}
			
			//D1.main(null);
			
		}
		
		if(bt == Stage3)
		{
			//Stage3.setBackground(Color.GRAY);
			if(gameManager.getRecnetUser().isCleared(2)){
				gameManager.setRecentStage(3);
				System.out.println("===================지금 스테이지는====================");
				System.out.println("++++++++"+gameManager.getRecentStage()+"+++++++++++++");
				Dungeon D1 = new Dungeon(frame);
				gameManager.setRecentDungeon(D1);
				frame.setVisible(false);
			}else{
				JOptionPane.showMessageDialog(null, "To enter stage3, you must complete stage2.","Warning!", JOptionPane.INFORMATION_MESSAGE);
			}
			//D1.main(null);
		}
		
		
		/*
		if(bt == Stage4)
		{
			Stage4.setBackground(Color.GRAY);
			gameManager.setRecentStage(4);
			Dungeon D1 = new Dungeon(frame);
			frame.setVisible(false);
			//D1.main(null);
		}
		
		if(bt == Stage5)
		{
			Stage5.setBackground(Color.GRAY);
			gameManager.setRecentStage(5);
			Dungeon D1 = new Dungeon(frame);
			frame.setVisible(false);
			//D1.main(null);
		}
		
		if(bt == Stage6)
		{
			Stage6.setBackground(Color.GRAY);
			gameManager.setRecentStage(6);
			Dungeon D1 = new Dungeon(frame);
			frame.setVisible(false);
			//D1.main(null);
		}
		
		if(bt == Stage7)
		{
			Stage7.setBackground(Color.GRAY);
			gameManager.setRecentStage(7);
			Dungeon D1 = new Dungeon(frame);
			frame.setVisible(false);
			//D1.main(null);
		}
		
		if(bt == Stage8)
		{
			Stage8.setBackground(Color.GRAY);
			gameManager.setRecentStage(8);
			Dungeon D1 = new Dungeon(frame);
			frame.setVisible(false);
			//D1.main(null);
		}
		*/
//		Teaching.main(null);
		
	}
	
	private int StageNumber;
	Monster[] monster = new Monster[24];



	public int getStageNumber() {
		return StageNumber;
	}

	public void setStageNumber(int stageNumber) {
		StageNumber = stageNumber;
	}
	
	public void setVisible(boolean visibility){
		this.changeStageblockColor();
	}
	
	public void changeStageblockColor(){
		boolean[] cleared = gameManager.getRecnetUser().getCleared();
		if(cleared[0]){
			Stage1.setBackground(Color.GRAY);
		}
		if(cleared[1]){
			Stage2.setBackground(Color.GRAY);
		}
		if(cleared[2]){
			Stage3.setBackground(Color.GRAY);
		}
	}
	
	public static void main(String[] args) {
		Stage_GUI gui = new Stage_GUI();
		gui.stage("name");
	}
}
