package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Manage.gameManager;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class SelectOXBox extends JFrame implements ActionListener {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnTrue;
	private JRadioButton rdbtnFalse;
	JButton btnOk = new JButton("OK"); //액션리스너 기능 추가행함
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectOXBox frame = new SelectOXBox();
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
	public SelectOXBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SelectOXBox");
		setBounds(100, 100, 304, 192);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		rdbtnTrue = new JRadioButton("True");
		buttonGroup.add(rdbtnTrue);
		rdbtnFalse = new JRadioButton("False");
		buttonGroup.add(rdbtnFalse);
		
		
		btnOk.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(104)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnFalse)
						.addComponent(rdbtnTrue))
					.addContainerGap(109, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(95)
					.addComponent(btnOk, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(92))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(rdbtnTrue)
					.addGap(18)
					.addComponent(rdbtnFalse)
					.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
					.addComponent(btnOk))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object bt = e.getSource();
		System.out.println(bt.toString());
		
		if(rdbtnTrue.isSelected()){
			gameManager.setRecentOXSolution(true);
		}else if(rdbtnFalse.isSelected()){
			gameManager.setRecentOXSolution(false);
		}else{
			System.out.println("Not Checked");
		}
		
		if(bt.equals(btnOk)){
			this.dispose();;
		}
		
	}

}
