package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


import Manage.gameManager;
import User.User;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Main extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	public JButton btnSignUp = new JButton("Sign UP");
	private JPasswordField passwordField;
	
	private JButton btnCancel;
	private JButton btnReset;
	
	private String id;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id != null) this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(id != null) this.password = password;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Main ma = new Main();
		ma.main();
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	@SuppressWarnings({"deprecation" })
	public void main() {
		JFrame frame2 = new JFrame();
		frame2.setTitle("Java Program game");
		frame2.setVisible(true);
		frame2.setBounds(100, 100, 450, 450);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		TitledBorder border = BorderFactory.createTitledBorder("Please Login to start a game.");
		((JComponent) panel).setBorder(border);
		frame2.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("User ID: ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("굴림", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 14));
		textField.setColumns(10);
		
		btnNewButton = new JButton("Login");
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 14));
		
		btnCancel = new JButton("Close");
		
		btnReset = new JButton("Reset");
		panel.add(lblNewLabel);
		panel.add(lblPassword);
		panel.add(textField);
		panel.add(passwordField);
		panel.add(btnNewButton);
		panel.add(btnCancel);
		panel.add(btnReset);
		
		frame2.add(panel);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(75, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel)
										.addComponent(lblPassword))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(passwordField)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(btnNewButton)
									.addGap(28)
									.addComponent(btnSignUp)
									.addGap(27)
									.addComponent(btnCancel)))
							.addGap(69))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(btnReset)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnReset)
					.addGap(70)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(79)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnSignUp)
						.addComponent(btnCancel))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				setId(textField.getText());
				setPassword(passwordField.getText());
				
				if(textField.getText().length() <= 0 || passwordField.getText().length() <= 0) {
					JOptionPane.showMessageDialog(null, "Your ID and Password is too short!!\n Please write it again.");
					textField.setText("");
					passwordField.setText("");
					return;
				}
				String[][] data2 = new String[100][3];
				int row = 0;
				
				try {
					File path = new File("");
					File csv = new File(path.getCanonicalPath() + "//Join.csv");
					
					BufferedReader br = new BufferedReader(new FileReader(csv));
					String line = "";
					
					while((line = br.readLine()) != null) {
						String[] tok = line.split(",");
						
						for(int i = 0; i < 3; i++) {
							data2[row][i] = tok[i];
						}
						row++;
					}
					
					br.close();
				} catch (FileNotFoundException ex1) {
					ex1.printStackTrace();
				} catch (IOException ex2) {
					ex2.printStackTrace();
				}
				
				for(int i = 0; i < 100; i++) {
					if(textField.getText().equals(data2[i][0])) {
						if(passwordField.getText().equals(data2[i][1])) {
							
							//유저 객체생성
							User u = new User();
							
							//유저 아이디 저장
							u.setID(data2[i][0]);
							
							//유저 clear stage정보 저장
							boolean[] cleared = new boolean[3];
							cleared[0]=false;
							cleared[1]=false;
							cleared[2]=false;
							
							u.setCleared(cleared);
							//유저 설정
							gameManager.setRecnetUser(u);
							
							
							
							//stage선택창으로 넘어감
							Stage_GUI gui = new Stage_GUI();
							gui.stage(textField.getText());
							
							frame2.dispose();
						}
					}
				}
				
				if(frame2.isShowing() == true) {
					JOptionPane.showMessageDialog(null, "Your Account or Password is wrong.");
				}
			}
		});
		
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aw) {
				char tk = ',';
				String[][] data = new String[100][3];
				
				setId(textField.getText());
				setPassword(passwordField.getText());
				
				String str1 = " ";
				
				boolean com = id.contains(str1);
				
				if(textField.getText().length() <= 2 || passwordField.getText().length() <= 2 || com == true) {
					JOptionPane.showMessageDialog(null, "Your ID or Password is too short.\nIf not, please don't leave blanks in the ID.");
					textField.setText("");
					passwordField.setText("");
					return;
				}
				
				int row = 0;
				int i = 0;
				
				int res = JOptionPane.showConfirmDialog(null, "Your ID is:  " +getId()+ "\nYour Password is:  " +getPassword()+ "\nIf it is Correct, Press Yes.\n\n(Warning!!: If Your Id and Password is shorter than 3 letters, It will not read.)", "Verify", JOptionPane.YES_NO_OPTION);
				
				if(res == JOptionPane.YES_OPTION)
				{
					try {
						File path = new File("");
						File file = new File(path.getCanonicalPath()+ "//join.csv");
						
						FileReader reader = new FileReader(file);
						
						BufferedReader br = new BufferedReader(reader);
						String line;
						
						while((line = br.readLine()) != null) {
							String[] token1 = line.split(",", -1);
							
							for(i = 0; i < 3; i++) {
								data[row][i] = token1[i];
								
								if(id.equals(data[row][0])) {
									JOptionPane.showMessageDialog(null, "Your ID is already in USE!! try different id.");
									br.close();
									return;
								}
							}
							row++;
						}
						System.out.println(row);
						
						br.close();
						
						data[row][0] = getId();
						data[row][1] = getPassword();
						data[row][2] = "0";
						
						FileWriter writer = new FileWriter(file);
						for(i = 0; i <= row; i++) {
							writer.append(data[i][0] + tk + data[i][1] + tk + data[i][2]);
							writer.append("\n");
						}
						writer.close();
						
					} catch(IOException ioe) {
						ioe.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "Your ID is now written. Please login again.");
					

				}
				
				else {
					JOptionPane.showMessageDialog(null, "Please Write Again.");
					textField.setText("");
					passwordField.setText("");
				}
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent at) {
				System.exit(0);
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ar) {
				textField.setText("");
				passwordField.setText("");
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}