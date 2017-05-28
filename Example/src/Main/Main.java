package Main;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import Manage.MyTest;

public class Main extends JFrame implements ActionListener {

	public JLabel Username;
	public JLabel Password;
	public JTextField writeUsername;
	public JTextField writePassword;
	public JButton okay;
	public JButton joinid;
	JFrame frame = new JFrame();
	public static String ID;

	public Main() {

		frame.setTitle("JavaProgramGame");
		Container panel = frame.getContentPane();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints cs = new GridBagConstraints();
		cs.fill = GridBagConstraints.HORIZONTAL;

		TitledBorder border = BorderFactory.createTitledBorder("Login to start the game");
		((JComponent) panel).setBorder(border);

		Username = new JLabel("Userid: ");
		cs.gridx = 0;
		cs.gridy = 0;
		cs.gridwidth = 1;
		panel.add(Username, cs); // 아이디를 쓰시오 ( Id :)

		writeUsername = new JTextField(20);
		cs.gridx = 1;
		cs.gridy = 0;
		cs.gridwidth = 2;
		panel.add(writeUsername, cs); // 아이디 쓰는 칸

		Password = new JLabel("Password: ");
		cs.gridx = 0;
		cs.gridy = 1;
		cs.gridwidth = 1;
		panel.add(Password, cs); // 패스워드를 쓰시오 (Password :)

		writePassword = new JTextField(20);
		cs.gridx = 1;
		cs.gridy = 1;
		cs.gridwidth = 2;
		panel.add(writePassword, cs); // 패스워드 쓰는 칸

		okay = new JButton("Login");
		cs.gridx = 0;
		cs.gridy = 2;
		cs.gridwidth = 2;
		panel.add(okay, cs);

		joinid = new JButton("Sign Up");
		cs.gridx = 1;
		cs.gridy = 2;
		cs.gridwidth = 2;
		panel.add(joinid, cs);

		okay.addActionListener(this);
		joinid.addActionListener(this);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		Main a = new Main();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String[][] indat = new String[100][5]; // indat에 csv 하나하나를 넣는다.
		int row = 0, i;
				
		if (e.getSource().equals(joinid)) // 회원가입을 눌렀을때
		{
			Join a = new Join();
			a.Joinpress();
		}

		else if (e.getSource().equals(okay)) // 확인 버튼을 눌렀을때
		{
			setID(writeUsername.getText());
			try {
				File path = new File("");
			    File csv = new File(path.getCanonicalPath()+"//join.csv");
				BufferedReader br = new BufferedReader(new FileReader(csv));
				
				String line = "";
				while ((line = br.readLine()) != null) {
					String[] token = line.split(",");
					for (i = 0; i < 5; i++) {
						indat[row][i] = token[i];
					}
					row++;
				}
				br.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			for ( i = 0; i < 100; i++) {
				if (writeUsername.getText().equals(indat[i][0])) // 사용자가 id를 친것과 csv의 아이디 칸에 같은것이있을때
				{
					if (writePassword.getText().equals(indat[i][1])) // 사용자의 id가 같고  password를 csv와 비교할때
					{
		MyTest a1 = new MyTest(); //게임으로 들어가야 하는것인데 음 우리 클래스에서 어디로 들어가는것인지 모르겠음
						
						frame.dispose();
						MyTest.main(null);
					}

				}

			}
			if (frame.isShowing() == true) // 만약 이 class 의 frame이 살아있다면!!
			{
				IdPasswordCheck a = new IdPasswordCheck();
				frame.dispose();
			} // 틀리면 IdPasswordCheck 클래스로가서 다시 Idmake JFrame으로 옮겨진다

		}

	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}