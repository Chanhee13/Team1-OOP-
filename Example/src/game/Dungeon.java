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
   JButton btnNewButton = new JButton("Answer\n check");

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
      JTextArea textArea = new JTextArea();
      problem.add(textArea);
      Image img=new ImageIcon("java.png").getImage();
      
      JPanel monster = new JPanel() {
         protected void paintComponent(Graphics g) {
            
            g.drawImage(img, 0, 0,750,250, null);
         //
               }
           };

      monster.setBorder(UIManager.getBorder("InternalFrame.border"));
      monster.setForeground(Color.WHITE);
      int stage = gameManager.getRecentStage();
      Monster[] mons = FileManager.makeMonsters(stage);
      
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {

         }
      });//
      /*/
       *   몬스터 만들어서 문제만드는 거 실패 
      for(int i=0; i<3; i++){
         
         gameManager.setRecentMonster(mons[i]);
         Monster m = gameManager.getRecentMonster();
         textArea.setText(m.askProblem());
         while(!m.isDead()){
            btnNewButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent arg0) {
                  
                  if(m instanceof   SelectMonster){
                     SelectCheckBox.main(null);
                  }
                  else if(m instanceof OXMonster){
                     SelectOXBox.main(null);
                  }
                  else if(m instanceof TypeMonster){
                     SelectTypeBox.main(null);
                  }
      
               }
            });
         }
      }
      */
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