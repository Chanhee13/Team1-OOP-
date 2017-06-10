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

import Dr.Dr_T;
import Information.Assignment;
import Information.Information;
import Information.OXAssignment;
import Information.SelectAssignment;
import Information.TypeAssignment;
import Manage.FileManager;
import Manage.gameManager;
import Monster.*;
import User.Hero;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Dungeon extends JFrame {

   private JPanel contentPane;
   private static JTextArea textArea;
   private static Monster[] mons;
   private static String next;
   private Monster m;
   JButton btnNewButton = new JButton("Answer\n check");
   static Hero hero=new Hero();

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
	
	   gameManager.setRecentHero(hero);
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
      textArea = new JTextArea();
      problem.add(textArea);
      Image img=new ImageIcon("java.png").getImage();
      
      JPanel monster = new JPanel() {
         protected void paintComponent(Graphics g) {
            
            g.drawImage(img, 0, 0,750,250, null);
         //
               }
           };
//
      monster.setBorder(UIManager.getBorder("InternalFrame.border"));
      monster.setForeground(Color.WHITE);
      int stage = gameManager.getRecentStage();
      mons = FileManager.makeMonsters(stage);
      
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {

         }
      });
      Information info = new Information(gameManager.getRecentStage());
      System.out.println("스테이지 넘버: "+gameManager.getRecentStage());
      OXMonster ox = new OXMonster();
		SelectMonster se = new SelectMonster();
		TypeMonster ty = new TypeMonster();
		
		ArrayList<Assignment> as = new ArrayList<Assignment>(7);
			as =info.getAssingments();
			System.out.println(as.size());
		System.out.println("----------------------------------------------------");
		for(int i=0; i<7; i++){
			System.out.println();
			System.out.println(as.get(i).getProblem());
			if(as.get(i) instanceof OXAssignment){
				ox.addAssignment(as.get(i));
				ox.setHP(ox.getHP()+10);
				System.out.println("OX");
			}else if(as.get(i) instanceof SelectAssignment){
				se.addAssignment(as.get(i));
				se.setHP(se.getHP()+10);
				System.out.println("SE");
			}else if(as.get(i) instanceof TypeAssignment){
				ty.addAssignment(as.get(i));
				ty.setHP(ty.getHP()+10);
				System.out.println("TY");
			}
		}
		System.out.println("----------------------------------------------------");
		mons[0] = ox;
		mons[1] = se;
		mons[2] = ty;
		
		         gameManager.setRecentMonster(mons[0]);
		         m = gameManager.getRecentMonster();
		         textArea.setText(m.askProblem());
		         
		            btnNewButton.addActionListener(new ActionListener() {
		               public void actionPerformed(ActionEvent arg0) {
		                  
		            	  m = gameManager.getRecentMonster();
		            	   
		                  if(m instanceof  SelectMonster){
		                     SelectCheckBox.main(null);
		                     
		                  }
		                  else if(m instanceof OXMonster){
		                     SelectOXBox.main(null);
		                     
		                  }
		                  else if(m instanceof TypeMonster){
		                     SelectTypeBox.main(null);
		                     
		                  }
		                  nextAssignment();
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
   void nextAssignment(){
	   
	
   }
   static void renderNextAs(){
	   next = gameManager.nextAssignment(mons);
	   textArea.setText(next);
	   System.out.println("post"+next);
   }
}