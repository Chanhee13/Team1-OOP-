package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import game.Stage_GUI;

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
	
	private static Main frame2 = new Main();
	private JButton btnCancel;
	private JButton btnReset;
	
	private static String id;
	private static String password;
	
	

	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		if(id != null) Main.id = id;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		if(password != null) Main.password = password;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame2.setVisible(true);
					frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame2.setResizable(false);
					frame2.setAlwaysOnTop(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "static-access", "deprecation" })
	public Main() {
		setTitle("Java Program Game");
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
		
		JLabel lblNewLabel = new JLabel("User ID: ");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		textField.setColumns(10);
		
		btnNewButton = new JButton("Login");
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		
		btnCancel = new JButton("Cancel");
		
		btnReset = new JButton("Reset");
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
				Stage_GUI gui = new Stage_GUI();
				gui.stage(textField.getText());
				frame2.dispose();
			}
		});
		
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aw) {
				char tk = ',';
				String[][] data = new String[100][3];
				Main ji = new Main();
				
				ji.setId(textField.getText());
				ji.setPassword(passwordField.getText());
				System.out.println(textField.getText());
				System.out.println(passwordField.getPassword());
				int row = 0;
				int row2 = 0;
				int i = 0;
				
				int res = JOptionPane.showConfirmDialog(null, "Your Id: " +ji.getId()+ "\nYour Password: " +ji.getPassword()+ "\nIf it is Correct, Press Yes.", "Verify", JOptionPane.YES_NO_OPTION);
				
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
								
								if(ji.id.equals(data[row][0])) {
									JOptionPane.showMessageDialog(null, "Your ID is already in USE!! try different id.");
									br.close();
								}
							}
							row++;
						}
						System.out.println(row);
						
						br.close();
						
						data[row][0] = ji.getId();
						data[row][1] = ji.getPassword();
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
					
					Main ma = new Main();
					ma.main(null);
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