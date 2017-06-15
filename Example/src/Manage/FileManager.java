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

	private File[] file = new File[4];
	private User user = new User();
	private ArrayList<File> f = new ArrayList<File>();



	public void MakeID(String ID) throws IOException {
		FileWriter fw = new FileWriter("text1.txt"); // �ϴ� text1�� ������ �ξ���
		User user = new User();
		String data = user.getID(); //���� ���� �����ϴ� ������ ���Ͽ��� �޾Ƽ� �����ϴ� �������𸣰��� �ϴ� ���� ���� �����ϴ� ������ �س�����
		fw.write(data); //makeUser���� setID�� ��µ� makeUSer���� ���� ������  makeID���� ���� ������ �򰥸�
		fw.close();
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
		
				System.out.println("---------------Make Monsetrs : STAGE "+stage+"---------------");
				OXMonster ox = new OXMonster();
				SelectMonster se = new SelectMonster();
				TypeMonster ty = new TypeMonster();
				Information info = new Information(stage);
				ArrayList<Assignment> as = info.getAssingments();
				for(int i=0; i<as.size()/2; i++){
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
