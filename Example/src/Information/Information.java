package Information;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import Dr.Dr_T;

public class Information implements Serializable {
	private String ID;
	private String toTeach;
	private ArrayList<Assignment> assingments = new ArrayList<Assignment>();
	
	public Information(int stage){
		String f = "stage"+stage+".txt";
		try {
			File file = new File(f);
			FileReader read = new FileReader(file);
			BufferedReader br = new BufferedReader(read);
			
			String text;
			String copytext="";
			
			while((text = br.readLine())!=null)
			{
				copytext+=text;
				copytext+="\n";
			}
			//�������� ����
			String[] result = copytext.split("&");
			this.setID(result[0]);
			System.out.println("ID ID ID");
			System.out.println(result[0]);
			//����ĥ ���� ����
			this.setToTeach(result[1]);
			Dr_T.setToTeach(result[1]);
			System.out.println("����Ȯ��");
			String sTemp = result[2];
			String[] preAssingments = sTemp.split(".^");
			System.out.println(preAssingments[0]);
			System.out.println(preAssingments[1]);
			System.out.println(preAssingments[2]);			
			
			//������ ����� ���� ����
			for(String s : preAssingments){
				String[] tempStr = s.split(",");
				if(tempStr[0]=="ox"){
					boolean sol=true;
					if(tempStr[2]=="X"){
						sol=false;
					}
					assingments.add(new OXAssignment(Integer.parseInt(this.getID()),tempStr[1],sol));
				}
				if(tempStr[0]=="se"){
					String[] wro = {tempStr[3],tempStr[4],tempStr[5]};
					assingments.add(new SelectAssignment(Integer.parseInt(this.getID()),tempStr[1],tempStr[2],wro));
				}
				if(tempStr[0]=="ty"){
					assingments.add(new TypeAssignment(Integer.parseInt(this.getID()),tempStr[1],tempStr[2]));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getToTeach() {
		return toTeach;
	}
	public void setToTeach(String toTeach) {
		this.toTeach = toTeach;
	}
	
	//assingment�� ���� �ְų� ����, ��ȸ�� ���� ArrayList�� method�� add, remove�� ������ �Ѵ�. 
	//������   �ٸ� Ŭ�������� assingment ��ü�� ������ ������ ���� ��쿡�� getAssingment�� ����Ѵ�.
	public ArrayList<Assignment> getAssingments() {
		return assingments;
	}
	
	public void setAssingments(ArrayList<Assignment> assingments) {
		this.assingments = assingments;
	}

}
