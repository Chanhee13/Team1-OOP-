package Manage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Information.Assignment;
import Information.Information;
import Information.OXAssignment;
import Information.SelectAssignment;
import Information.TypeAssignment;
import Monster.Monster;
import Monster.OXMonster;
import Monster.SelectMonster;
import Monster.TypeMonster;
import User.Hero;
import User.User;

public class FileManager {

	private File[] file = new File[3];
	private User user = new User();
	private ArrayList<File> f = new ArrayList<File>();

	public void CreateFile() // ����°� void�� �Ǵ��Ѱ� ���Ƽ� �ϴ� void�� �صξ����.
	{
		// Test ������ ���� �صξ����ϴ�.
		for (int i = 0; i < 3; i++) {

			this.file[i] = new File("Test" + i + ".txt"); // �� �κ��� �ؽ�Ʈ���� �����ε�
															// �Ⱥ��ŵ� �˴ϴ�.
			try {
				file[i].createNewFile();
				file[i].mkdirs();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void MakeID(String ID) throws IOException {
		FileWriter fw = new FileWriter("text1.txt"); // �ϴ� text1�� ������ �ξ���
		User user = new User();
		String data = user.getID(); //���� ���� �����ϴ� ������ ���Ͽ��� �޾Ƽ� �����ϴ� �������𸣰��� �ϴ� ���� ���� �����ϴ� ������ �س�����
		fw.write(data); //makeUser���� setID�� ��µ� makeUSer���� ���� ������  makeID���� ���� ������ �򰥸�
		fw.close();
	}

	public User makeUser() {

		User user = new User();
		// ���߿��� Scanner�� GUI�� �Լ��� ���� �޾ƿ�������
		// ������ �׳� ���� ���� �ֵ��� �Ѵ�.
		user.setID("temp");
		user.setHero(new Hero());
		boolean[] cleard = { true, false, false, false, false, false, false, false };
		user.setCleared(cleard);
		return user;
	}

	public void addFile() {
		for (int i = 0; i < 3; i++) {
			f.add(this.file[i]);
		}
	}

	public void removeFile() {
		f.remove(this.file[0]);
	}

	public void loadFile() {
		System.out.println("Test loading : " + this.f);
	}
	public static Monster[] makeMonsters(int stage){
		//------------------------------ In Stage, Monster vs. Hero Test
				System.out.println("---------------Monster vs. Hero TEST---------------");
				OXMonster ox = new OXMonster();
				SelectMonster se = new SelectMonster();
				TypeMonster ty = new TypeMonster();
				Information info = new Information(stage+1);
				ArrayList<Assignment> as = info.getAssingments();
				System.out.println(as.toString());
				for(int i=0; i<as.size(); i++){
					System.out.println(as.get(i));
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
				
				Monster[] ms = new Monster[3];
				ms[0]=ox;
				ms[1]=se;
				ms[2]=ty;
				
				return ms;
	}
}
