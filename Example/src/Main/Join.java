package Main;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Join extends JFrame implements ActionListener {

	private String id;
	private String password;
	private String age;
	public JLabel whatid;
	public JLabel whatpassword;
	public JLabel whatage;
	public JLabel sameid;
	public JTextField writenewusername;
	public JTextField writenewpassword;
	public JTextField writeage;
	public JButton saveid;
	public JButton cancel;
	JFrame frame = new JFrame();
	
	public void Joinpress() // 회원가입을 누르면 이 클래스가 나온다
	{
		frame.setTitle("Create ID");
		Container panel = frame.getContentPane();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints cs = new GridBagConstraints();
		cs.fill = GridBagConstraints.HORIZONTAL;

		TitledBorder border = BorderFactory.createTitledBorder("making id for the game");
		((JComponent) panel).setBorder(border);

		whatid = new JLabel("User ID: ");
		cs.gridx = 0;
		cs.gridy = 0;
		cs.gridwidth = 1;
		panel.add(whatid, cs);

		writenewusername = new JTextField(20);
		cs.gridx = 1;
		cs.gridy = 0;
		cs.gridwidth = 2;
		panel.add(writenewusername, cs); 

		sameid = new JLabel();
		cs.gridx = 2;
		cs.gridy = 0;
		cs.gridwidth = 1;
		panel.add(sameid, cs);

		whatpassword = new JLabel("Password: ");
		cs.gridx = 0;
		cs.gridy = 1;
		cs.gridwidth = 1;
		panel.add(whatpassword, cs); 

		writenewpassword = new JTextField(20);
		cs.gridx = 1;
		cs.gridy = 1;
		cs.gridwidth = 2;
		panel.add(writenewpassword, cs); 

		whatage = new JLabel("Age: (number)");
		cs.gridx = 0;
		cs.gridy = 2;
		cs.gridwidth = 1;
		panel.add(whatage, cs);

		writeage = new JTextField(20);
		cs.gridx = 1;
		cs.gridy = 2;
		cs.gridwidth = 2;
		panel.add(writeage, cs);

		saveid = new JButton("save the information"); 
		cs.gridx = 0;
		cs.gridy = 3;
		cs.gridwidth = 2;
		panel.add(saveid, cs);

		cancel = new JButton("Canel");
		cs.gridx = 2;
		cs.gridy = 3;
		cs.gridwidth = 1;
		panel.add(cancel, cs);

		saveid.addActionListener(this); 
		cancel.addActionListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(saveid)) {
			
			char token = ',';
			Join a = new Join();
			a.setId(writenewusername.getText());
			a.setPassword(writenewpassword.getText()); // 임의로 하나의 join을 만들어서 입력한  것을 저장한다
			a.setAge(writeage.getText());
			String[][] indat = new String[100][5]; // indat에 csv 하나하나를 넣는다.
			int row = 0, i;
			
			
			try {
				File path = new File("");
			    File csv = new File(path.getCanonicalPath()+"//join.csv");
				
			   BufferedReader br = new BufferedReader(new FileReader(csv));
				String line = "";
				while ((line = br.readLine()) != null) {
					String[] token1 = line.split(",", -1);
					for (i = 0; i < 5; i++) {
						indat[row][i] = token1[i];
							if (a.id.equals(indat[row][0])) // 사용자가 id를 친것과 csv의 아이디 칸에 같은것이있을때
							{
									idcheck idc = new idcheck();
									indat= null;
									br.close();
									return;
							}
						}
					row++;
					}
				br.close();
				
				BufferedWriter bw = new BufferedWriter(new FileWriter("join.csv"));
				indat[row][0] = a.getId();
				indat[row][1] = a.getPassword();
				indat[row][2] = a.getAge();
				indat[row][3] = "0";
				indat[row][4] = "0";
				for (i = 0; i <= row; i++) {
					bw.write(indat[i][0] + token + indat[i][1] + token + indat[i][2] + token + indat[i][3]+token +indat[i][4]);
					bw.write("\n");
				}
				bw.close();
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			frame.dispose();
		}else if(e.getSource().equals(cancel))

	{
		frame.dispose();
	}

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String string) {
		this.age = string;
	}

}